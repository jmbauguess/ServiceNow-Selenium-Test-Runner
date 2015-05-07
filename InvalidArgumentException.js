var InvalidArgumentException = Class.create();
InvalidArgumentException.prototype = Error.prototype;
InvalidArgumentException.prototype = {
	initialize: function(argument, functionName) {
		this.name = this.type;
		this.message = "An invalid argument was given in function " + functionName + ": " + argument;
		gs.log(this.message);
	},
	type: 'InvalidArgumentException'
};