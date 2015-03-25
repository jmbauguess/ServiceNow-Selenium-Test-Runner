/**
 * ProposedChangeHandler Provides functionality for discovering information about proposed changes
 * @type {Class}
 */
var ProposedChangeHandler = Class.create();
ProposedChangeHandler.prototype = {
	/**
	 * initialize Sets the arrays to empty so they can be used throughout the class
	 */
	initialize: function(){
		this.parentArray = [], this.fieldNameArray = [], this.changesArray = [], this.ciList = [];
	},
	/**
 	* getDictionaryFields Gets all fields in the dictionary related to a set of tables
 	* @param  {string} tablename The base table name to query with
 	*/
	getDictionaryFields: function(tablename){
		this.getParentTable(tablename);
		var dictionary = new GlideRecord('sys_dictionary');
		dictionary.addEncodedQuery('nameIN'+ tablename + "," + this.parentArray.toString());	
		dictionary.addNotNullQuery('element');
		dictionary.query();		
		while (dictionary.next()){
			var fieldLabel = this.getFieldLabel(dictionary.element, dictionary.name);
			var obj = {
				'element' : dictionary.element + '',
				'fieldName' : fieldLabel,
				'reference' : dictionary.reference + ''};
			this.fieldNameArray.push(obj);
		}
	},
	/**
 	* getFieldLabel Queries the field label table to find the label of the field for displaying later
 	* @param  {string} element The name of the field
 	* @param  {string} name    The name of the table
 	* @return {string}         Either the label of the field, 
 	* or just the element argument if no label was found
 	*/
	getFieldLabel: function(element, name) {
		var label = new GlideRecord('sys_documentation');
		label.addQuery('name', name);
		label.addQuery('element', element);
		label.query();
		if (label.next()){
			return label.label;
		} else {
			return element;
		}
	},	
	/**
 	* getParentTable Gets the name of the super class of the current table, 
 	* and pushes it to the parentArray
 	* @param  {string} tablename A name of a table
 	* @return {function|string}  Recursive, if there is a super class it tries to find the top level
 	*/
	getParentTable: function(tablename){
		var dbObject = new GlideRecord('sys_db_object');
		dbObject.addQuery('name', tablename);
		dbObject.query();
		if (dbObject.next()){
			if (dbObject.super_class != ''){
				var name = this.getFormalName(dbObject.super_class)
				this.parentArray.push('' + name)
				return this.getParentTable(name);
			} else {
				return dbObject.name;
			}
		}
	},
	/**
 	* getFormalName Since the super_class is a sys_id and the display value isn't the formal name, 
 	* we need to find the formal name of our tables to make our recursive query work
 	* @param  {string} tableSys a sys id of a table
 	* @return {string}          the display/formal name of the table
 	*/
	getFormalName: function(tableSys){
		var table = new GlideRecord('sys_db_object');
		if (table.get(tableSys)){
			return table.name;
		}
	},
	/**
 	* getRelevantCIDataFromAffectedCI Searches through Affected CI's for proposed changes
 	* @param  {GlideRecord} current the current Task record
 	*/
	getRelevantCIDataFromAffectedCI: function(current){
		var taskData = [];
		var taskCI = new GlideRecord('task_ci');
		taskCI.addQuery('task', current);
		taskCI.addNotNullQuery('xml');
		taskCI.query();
		while(taskCI.next()){
			this.changeArray.push(this.handleXML(taskCI));
			this.ciList.push(taskCI.ci_item.name + '');
		}
	},
	/**
 	* handleXML Handles the processing of the payload in the proposed change
 	* @param  {GlideRecord} record the TaskCI record
 	* @return {array} An Array of objects
 	*/
	handleXML: function(record){
		this.getDictionaryFields(record.ci_item.sys_class_name);
		var xmlString = record.xml;
		var xmlDoc = new XMLDocument(xmlString, true);	
		var items = [];
		for (var field in this.fieldNameArray) {
			try {
				var oldValue = xmlDoc.getNode("//" + 
					this.fieldNameArray[field]['element']).getAttribute("oldValue");
				var newValue = xmlDoc.getNode("//" + 
					this.fieldNameArray[field]['element']).getAttribute("newValue");
				if (this.fieldNameArray[field]['reference'] != '') {
					oldValue = this.dealWithReferences(oldValue, this.fieldNameArray[field]['reference']);			
					newValue = this.dealWithReferences(newValue, this.fieldNameArray[field]['reference']);
				}				
				items.push(
					{
					'field': this.fieldNameArray[field]['element'], 
					'label': this.fieldNameArray[field]['fieldName'],
					'_old' : oldValue,
					'_new' : newValue
					});
			} catch (e) { }
		}
		return items;
	},
	/**
	 * dealWithReferences Since some values are references, we don't want to present sys_ids to the user,
	 * but actual readable values
	 * @param  {string} value     A record sys_id
	 * @param  {[type]} reference A table that is referenced
	 * @return {[type]}           The "name" property of the table 
	 * *NOTE/TODO* - in the case of no name property available on the table, 
	 * we need a way to find what the look for exactly.  It's not needed for me yet.
	 */
	dealWithReferences: function(value, reference) {
		var table = new GlideRecord(reference);
		if (table.get(value)) {
			return table['name'];
		}
	},
	/**
	 * presentData Main method, presents the data in a printable format for emails and such
	 * @param  {GlideRecord} current The current record
	 * @return {string}         A printable list of data
	 */
	presentData: function(current){		
		getRelevantCIDataFromAffectedCI(current);
		var data = "<b>PROPOSED CHANGES:</b>\n\n"
		for (var item in changesArray){
			data += 'As part of this change request, a user has proposed a change to ' + ciList[item] + ":\n\n<ul>";			
			for (var piece in changesArray[item]) {
				data += "<li>" + changesArray[item][piece]['label'] + " is changing from \"" + 
				dealWithBlankChange(changesArray[item][piece]['_old']) + "\" to \"" + 
				dealWithBlankChange(changesArray[item][piece]['_new']) + "\".</li>"
			}
			data += "</ul>"
		}
		return data;
	},
	/**
	 * dealWithBlankChange Replaces an empty string with the word "Nothing"
	 * @param  {string} text a string to test
	 * @return {string}      the string if it's not empty or "Nothing" if it is empty
	 */
	dealWithBlankChange: function(text) {
		return text.toString().trim() == '' ? "Nothing" : text;
	},
	'type': 'ProposedChangeHandler'
};