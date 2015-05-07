var SNValidator = Class.create();
SNValidator.prototype = {
	/**
 	* checkValidStringArgument Validates that an argument is, in fact, a string
 	* @param  {string} string A string to test
 	* @return {boolean}        true if an object
 	*/
	checkValidStringArgument: function(string) {
		return typeof string === 'string';
	},
	/**
 	* checkValidObjectArgument Validates that an argument is, in fact, an object
 	* @param  {Object} object An object to test
 	* @return {Boolean}        true if an object
 	*/
	checkValidObjectArgument: function(object) {
		return typeof object === 'object';		
	},
	/**
 	* checkValidNumberArgumentLoose Validates than an argument is, in fact, a valid number, but uses == instead of ===
 	* @param  {number} number A number to test
 	* @return {boolean}        true if the value is a number
 	*/
	checkValidNumberArgumentLoose: function(number) {
		return Number(number) == 'number' && !isNaN(Number(number));		
	},
	/**
 	* checkValidNumberArgumentStric Validates than an argument is, in fact, a valid number, uses ===
 	* @param  {number} number A number to test
 	* @return {boolean}        true if the value is a number
 	*/
	checkValidNumberArgumentStrict: function(number) {
		return typeof number === 'number' && !isNaN(number);		
	},
	/**
 	* checkValidSysIDArgument Validates that an argument is, in fact, a sys_id
 	* @param  {string} sys_id A string to test
 	* @return {Boolean}        true if a sys_id
 	*/
	checkValidSysIDArgument: function(sys_id) {		
		this.checkValidStringArgument(sys_id);
		return sys_id.match(/^[0-9a-f]{32}$/);		
	},
	/**
	 * checkValidCallbackArgument Validates that an argument is, in fact, a function to callback
	 * @param  {Function} callback     A function to test
	 * @return {boolean}                true if a valid function (or object)
	 */
	checkValidCallbackArgument: function(callback) {
		return typeof callback === 'function';
	},
	type: 'SNValidator'
};