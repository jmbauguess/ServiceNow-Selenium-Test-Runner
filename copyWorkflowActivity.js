/**
 * Step 1: Copy a Workflow Activity from the wf_activity_definition table
 * Step 2: Get the Sys IDs of the copied workflow and the new copy and set the wf1/wf2 variables
 * Step 3: Unlock Security Admin and run this script to completely* copy it
 */
 var wf1 = '', wf2 = '';
 copyWorkflowActivities(wf1, wf2);
 copyConditionDefaults(wf1, wf2);
 copyWorkflowUIScripts(wf1, wf2);
 /**
  * Copies all activity variables from a workflow activity
  * @param {String} workflow1 - The Sys ID of the workflow activity to copy from
  * @param {String} workflow2 - The Sys ID of the workflow activity to copy to
  */
function copyWorkflowActivities(workflow1, workflow2) {
	var workflowActivities = new GlideRecord('wf_activity_variable');
	workflowActivities.addQuery('model', workflow1);
	workflowActivities.query();
	while (workflowActivities.next()){
		var copyRecord = new GlideRecord('wf_activity_variable');
		copyRecord.initialize();
		for (var item in workflowActivities) {
			copyRecord.setValue(item, workflowActivities[item]);
		}
		copyRecord.model = workflow2;
		copyRecord.name = '';
		copyRecord.insert();
	}	
}

 /**
  * Copies all condition defaults from a workflow activity
  * @param {String} workflow1 - The Sys ID of the workflow activity to copy from
  * @param {String} workflow2 - The Sys ID of the workflow activity to copy to
  */
function copyWorkflowConditionDefaults(workflow1, workflow2){
	var conditions = new GlideRecord('wf_condition_default');
	conditions.addQuery('activity_definition', workflow1);
	conditions.query();
	while (conditions.next()){
		var copyCondition = new GlideRecord('wf_condition_default');
		copyCondition.initialize();
		for (var item in conditions){
			copyCondition.setValue(item, conditions[item]);
		}
		copyCondition.activity_definition = workflow2;
		copyCondition.insert();
	}
}
/**
 * Copies all activity variables from a workflow activity
 * NOTE: You will need to go back and change the FIELD value of the UI Policy Actions
 * @param {String} workflow1 - The Sys ID of the workflow activity to copy from
 * @param {String} workflow2 - The Sys ID of the workflow activity to copy to
 */
function copyWorkflowUIScripts(workflow1,workflow2) {
	var copied = [], toCopy = [];
	var uiScripts = new GlideRecord('sys_ui_policy');
	uiScripts.addQuery('model_id', workflow1);
	uiScripts.query();
	while (uiScripts.next()){
		var copyRecord = new GlideRecord('sys_ui_policy');
		copyRecord.initialize();
		for (var item in uiScripts){
			copyRecord.setValue(item, uiScripts[item]);
		}
		copyRecord.model = workflow2;
		toCopy.push(uiScripts.sys_id + '');
		copied.push(copyRecord.insert() + '');
	}
	for(var i = 0; i < toCopy.length; i++){
		var uiPolicyAction = new GlideRecord('sys_ui_policy_action');
		uiPolicyAction.addQuery('ui_policy', toCopy[i]);
		uiPolicyAction.query();
		while (uiPolicyAction.next()){
			var newPolicyAction = new GlideRecord('sys_ui_policy_action');
			newPolicyAction.initialize();
			for (var item in uiPolicyAction){
				newPolicyAction.setValue(item, uiPolicyAction[item]);
			}
			newPolicyAction.ui_policy = copied[i];
			newPolicyAction.insert();
		}
	}
}