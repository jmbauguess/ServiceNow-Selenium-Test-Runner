# ServiceNow Selenium Test Runner #

This is a [maven](http://maven.apache.org/) project to run browser tests for [ServiceNow](http://www.service-now.com).  It supports running tests in [SauceLabs](http://www.saucelabs.com), or natively on your machine.  If you want to run browsers other than Firefox on your machine, you will need to download the appropriate drivers and either add them to the classpath or update the pom.xml file with the location.  You will also need the [Java 8 sdk](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed, because some of the helper methods use its Date API.

Operate your tests in the command line by entering the following command in the base directory of your project:


```

mvn clean test -Dpassword="yourpassword" -Denvironment="yourenvironment"
```


An example class and test are included.  The test uses the [PageObject](https://code.google.com/p/selenium/wiki/PageObjects) and [PageFactory](https://code.google.com/p/selenium/wiki/PageFactory) pattern.

I've created an update set, which is also in this repo, that contains Script Includes, Scheduled Jobs and a table to generate the appropriate locators in Java, Javascript, C#, Ruby and Python.  Install the update set and run the job.  (By default it runs some time in the afternoon.)  To change what language you want the classes to be, change one of the system properties that came with the update set.  The same thing applies to whether you prefer camel case variables or ones with underscores.

If you would rather avoid installing an update set, use the following script (with appropriate arguments) in background scripts:


```

function getTableVariables(tableName){
	var gr = new GlideRecord('sys_dictionary');
	gr.addEncodedQuery('nameIN' + tableName + ',task^element!=sys_id');
	gr.query();
	while (gr.next()){
		if (gr.internal_type.getDisplayValue() == "Reference"){
			gs.log("@FindBy(id=\"sys_display." + tableName + "." + gr.element + "\")\npublic WebElement " + gr.element + ";");
		} else if (gr.internal_type == "boolean"){
			gs.log("@FindBy(id=\"ni." + tableName + "." + gr.element + "\")\npublic WebElement " + gr.element + ";");
		} else{
			gs.log("@FindBy(id=\"" + tableName + "." + gr.element + "\")\npublic WebElement " + gr.element + ";");
		}
			gs.log("@FindBy(id=\"status." + tableName + "." + gr.element + "\")\npublic WebElement " + gr.element + "Span;\n");
	}
}
```


Copy the output into a text editor, and replace the "*** Script: " with "".  Now you have java variables for the input fields and status spans for each element.  Reference fields have to have sys_display appended to the id.  ServiceNow generates a tablename.element input, however, it is not editable on the screen.  Sometimes, using reference fields can cause an error, so be cautious when writing statements to send text to those elements.

If you are creating a page object for page that extends something other than task (cmdb_ci, for instance), adjust the script accordingly.  We exclude the sys_id, because that should be manually generated with the following @FindBy code:


```

@FindBy(id = "sys_uniqueValue")
public WebElement sysId;
```


ServiceCatalog items are a bit different.  I have my Service Catalog Item classes extend the Requested Item (Sc_Req_Item) class, since once ordered the page object needs those fields.  Modify and use the following script to get the variables:


```

function getServiceCatalogVariables(){
	var gr = new GlideRecord('item_option_new');
	gr.addEncodedQuery('typeNOT IN19,20');
	//add a query for the catalog item or variable set here
	gr.query();
	while (gr.next()){
	if (gr.type.getDisplayValue() == "Reference"){
		gs.log("@FindBy(id=\"sys_display.IO:" + gr.sys_id + "\")\npublic WebElement " + gr.name + ";\n");
	} else if (gr.type.getDisplayValue() == "CheckBox"){
		gs.log("@FindBy(id=\"ni.IO:" + gr.sys_id + "\")\npublic WebElement " + gr.name + ";\n");
	} else if (gr.type.getDisplayValue() == "Multiple Choice" || gr.type.getDisplayValue() == "Lookup Multiple Choice"){
		gs.log("@FindAll({@FindBy(name=\"IO:" + gr.sys_id + "\")})\npublic List<WebElement> " + gr.name + ";\n");
	} else {
		gs.log("@FindBy(id=\"IO:" + gr.sys_id + "\")\npublic WebElement " + gr.name + ";\n");
	}
		gs.log("@FindBy(id=\"status.IO:" + gr.sys_id + "\")\npublic WebElement " + gr.name + "Span;\n");
}
}
```


Now you can use Selenium to easily interact with elements.

The following script will take any UI Policies and turn them into assertions.  It will even look through the conditional scripts (if any) to get the g_form statements and make them assertions.

```

function uiPoliciesForTable(tableName){
	var policy = new GlideRecord('sys_ui_policy');
	policy.addQuery('table', tableName);
	policy.addActiveQuery();
	policy.query();
	while(policy.next()){
		var actions = new GlideRecord('sys_ui_policy_action');
		actions.addQuery('ui_policy', policy.sys_id);
		actions.query();
		gs.log("/**Assertions for UI Policy: " + policy.short_description );
		gs.log(" * When: " + policy.conditions);
		gs.log(" */");
		gs.log("public void assertFor" + policy.short_description.replace(/\s/g, "") + "() {");
		while (actions.next()){
			if (actions.disabled == "true"){
				gs.log("assertTrue(\"" + actions.field + " should be read-only\", isReadOnly(" + actions.field + "Span));");
			} else if (actions.disabled == "false"){
				gs.log("assertTrue(\"" + actions.field + " should not be read-only\", !isReadOnly(" + actions.field + "Span));");
			}
			if (actions.mandatory == "true"){
				gs.log("assertTrue(\"" + actions.field + " should be mandatory\", isMandatory(" + actions.field + "Span));");
			} else if (actions.mandatory == "false"){
				gs.log("assertTrue(\"" + actions.field + " should be mandatory\", !isMandatory(" + actions.field + "Span));");
			}
			if (actions.visible == "true"){
				gs.log("assertTrue(\"" + actions.field + " should be displayed\", " + actions.field + ".isDisplayed());");
			} else if (actions.visible == "false"){
				gs.log("assertTrue(\"" + actions.field + " should not be displayed\", !" + actions.field + ".isDisplayed());");
			}
		}
		if (policy.run_scripts == true){
			gs.log("//ON TRUE SCRIPTS");
			parseConditionalScript(policy.script_true);
			gs.log("//ON FALSE SCRIPTS");
			parseConditionalScript(policy.script_false);
		}
		gs.log("\n}\n");
	}

	function parseConditionalScript(script){
		var regexMandatory = /g_form\.setMandatory\((.*),(.*)\)/g
		var match = regexMandatory.exec(script);
		while (match != null){
			if (match.toString().indexOf('true') > -1){
				if (match.toString().indexOf('ReadOnly') > -1 || match.toString().indexOf('Disabled') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should be read-only\", isReadOnly(" + match[1].replace(/'/g, "") + "Span));");
				} else if (match.toString().indexOf('Mandatory') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should be mandatory\", isMandatory(" + match[1].replace(/'/g, "") + "Span));");
				} else if (match.toString().indexOf('Visible') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should be visible\", " + match[1].replace(/'/g, "") + ".isDisplayed());");
				}			
			} else {
				if (match.toString().indexOf('ReadOnly') > -1 || match.toString().indexOf('Disabled') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should not be read-only\", !isReadOnly(" + match[1].replace(/'/g, "") + "Span));");
				} else if (match.toString().indexOf('Mandatory') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should not be mandatory\", !isMandatory(" + match[1].replace(/'/g, "") + "Span));");
				} else if (match.toString().indexOf('Visible') > -1){
					gs.log("assertTrue(\"" + match[1].replace(/'/g, "") + " should be visible\", !" + match[1].replace(/'/g, "") + ".isDisplayed());");
				}
			}
			match = regexMandatory.exec(script);		
		}
	}
}

```

The following script will take Client Scripts and look for any g_form statements that alter fields

```

function createClientScriptAssertions(tableName){
	var gr = new GlideRecord('sys_script_client');
	gr.addQuery('table', tableName);
	gr.addActiveQuery();
	gr.query();
	while (gr.next()){
		gs.log("/**Assertions for UI Policy: " + gr.name );
		gs.log(" * ");
		gs.log(" */");
		gs.log("public void assertFor" + gr.name.replace(/\s/g, "") + "() {");
		parseConditionalScript(gr.script);
		gs.log("}\n");
	}
	
	function parseConditionalScript(script){
	var regexMandatory = /g_form\.(setMandatory|setReadOnly|setVisible|setDisabled|showFieldMsg|showErrorBox)\((.*),(.*)\)/g
	var match = regexMandatory.exec(script);
	while (match != null){
		if (match.toString().indexOf('true') > -1){
			if (match.toString().indexOf('ReadOnly') > -1 || match.toString().indexOf('Disabled') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should be read-only\", isReadOnly(" + match[2].replace(/'/g, "") + "Span));");
			} else if (match.toString().indexOf('Mandatory') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should be mandatory\", isMandatory(" + match[2].replace(/'/g, "") + "Span));");
			} else if (match.toString().indexOf('Visible') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should be visible\", " + match[2].replace(/'/g, "") + ".isDisplayed());");
			}			
		} else if (match.toString().indexOf('false') > -1) {
			if (match.toString().indexOf('ReadOnly') > -1 || match.toString().indexOf('Disabled') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should not be read-only\", !isReadOnly(" + match[2].replace(/'/g, "") + "Span));");
			} else if (match.toString().indexOf('Mandatory') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should not be mandatory\", !isMandatory(" + match[2].replace(/'/g, "") + "Span));");
			} else if (match.toString().indexOf('Visible') > -1){
				gs.log("assertTrue(\"" + match[2].replace(/'/g, "") + " should be visible\", !" + match[2].replace(/'/g, "") + ".isDisplayed());");
			}
		} else if (match.toString().indexOf('showFieldMsg') > -1 || match.toString().indexOf('showErrorBox') > -1){
			gs.log("assertEquals(\"" + match[2] + "\", driver.fineElement(By.cssSelector(\"div.outputmsg_info\")).getText());");
		}
		match = regexMandatory.exec(script);
	}
}
}
```
