package com.company.servicenowtests.tasks;

import com.company.servicenowtests.BaseTest;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author 162107
 */
public class CatalogTask extends BaseTest {
    
    public CatalogTask(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sc_task.calendar_stc")
    public WebElement calendar_stc;
    @FindBy(id = "status.sc_task.calendar_stc")
    public WebElement calendar_stcSpan;

    @FindBy(id = "sys_display.sc_task.request")
    public WebElement request;
    @FindBy(id = "status.sc_task.request")
    public WebElement requestSpan;

    @FindBy(id = "sys_display.sc_task.request_item")
    public WebElement request_item;
    @FindBy(id = "status.sc_task.request_item")
    public WebElement request_itemSpan;

    @FindBy(id = "ni.sc_task.active")
    public WebElement active;
    @FindBy(id = "status.sc_task.active")
    public WebElement activeSpan;

    @FindBy(id = "sc_task.activity_due")
    public WebElement activity_due;
    @FindBy(id = "status.sc_task.activity_due")
    public WebElement activity_dueSpan;

    @FindBy(id = "sc_task.approval")
    public WebElement approval;
    @FindBy(id = "status.sc_task.approval")
    public WebElement approvalSpan;

    @FindBy(id = "sc_task.approval_history")
    public WebElement approval_history;
    @FindBy(id = "status.sc_task.approval_history")
    public WebElement approval_historySpan;

    @FindBy(id = "sc_task.approval_set")
    public WebElement approval_set;
    @FindBy(id = "status.sc_task.approval_set")
    public WebElement approval_setSpan;

    @FindBy(id = "sys_display.sc_task.assigned_to")
    public WebElement assigned_to;
    @FindBy(id = "status.sc_task.assigned_to")
    public WebElement assigned_toSpan;

    @FindBy(id = "sys_display.sc_task.assignment_group")
    public WebElement assignment_group;
    @FindBy(id = "status.sc_task.assignment_group")
    public WebElement assignment_groupSpan;

    @FindBy(id = "sc_task.business_duration")
    public WebElement business_duration;
    @FindBy(id = "status.sc_task.business_duration")
    public WebElement business_durationSpan;

    @FindBy(id = "sc_task.calendar_duration")
    public WebElement calendar_duration;
    @FindBy(id = "status.sc_task.calendar_duration")
    public WebElement calendar_durationSpan;

    @FindBy(id = "sc_task.closed_at")
    public WebElement closed_at;
    @FindBy(id = "status.sc_task.closed_at")
    public WebElement closed_atSpan;

    @FindBy(id = "sys_display.sc_task.closed_by")
    public WebElement closed_by;
    @FindBy(id = "status.sc_task.closed_by")
    public WebElement closed_bySpan;

    @FindBy(id = "sc_task.close_notes")
    public WebElement close_notes;
    @FindBy(id = "status.sc_task.close_notes")
    public WebElement close_notesSpan;

    @FindBy(id = "sys_display.sc_task.cmdb_ci")
    public WebElement cmdb_ci;
    @FindBy(id = "status.sc_task.cmdb_ci")
    public WebElement cmdb_ciSpan;

    @FindBy(id = "sc_task.comments")
    public WebElement comments;
    @FindBy(id = "status.sc_task.comments")
    public WebElement commentsSpan;

    @FindBy(id = "sc_task.comments_and_work_notes")
    public WebElement comments_and_work_notes;
    @FindBy(id = "status.sc_task.comments_and_work_notes")
    public WebElement comments_and_work_notesSpan;

    @FindBy(id = "sys_display.sc_task.company")
    public WebElement company;
    @FindBy(id = "status.sc_task.company")
    public WebElement companySpan;

    @FindBy(id = "sc_task.contact_type")
    public WebElement contact_type;
    @FindBy(id = "status.sc_task.contact_type")
    public WebElement contact_typeSpan;

    @FindBy(id = "sc_task.correlation_display")
    public WebElement correlation_display;
    @FindBy(id = "status.sc_task.correlation_display")
    public WebElement correlation_displaySpan;

    @FindBy(id = "sc_task.correlation_id")
    public WebElement correlation_id;
    @FindBy(id = "status.sc_task.correlation_id")
    public WebElement correlation_idSpan;

    @FindBy(id = "sys_display.sc_task.delivery_plan")
    public WebElement delivery_plan;
    @FindBy(id = "status.sc_task.delivery_plan")
    public WebElement delivery_planSpan;

    @FindBy(id = "sys_display.sc_task.delivery_task")
    public WebElement delivery_task;
    @FindBy(id = "status.sc_task.delivery_task")
    public WebElement delivery_taskSpan;

    @FindBy(id = "sc_task.description")
    public WebElement description;
    @FindBy(id = "status.sc_task.description")
    public WebElement descriptionSpan;

    @FindBy(id = "sc_task.due_date")
    public WebElement due_date;
    @FindBy(id = "status.sc_task.due_date")
    public WebElement due_dateSpan;

    @FindBy(id = "sc_task.escalation")
    public WebElement escalation;
    @FindBy(id = "status.sc_task.escalation")
    public WebElement escalationSpan;

    @FindBy(id = "sc_task.expected_start")
    public WebElement expected_start;
    @FindBy(id = "status.sc_task.expected_start")
    public WebElement expected_startSpan;

    @FindBy(id = "sc_task.follow_up")
    public WebElement follow_up;
    @FindBy(id = "status.sc_task.follow_up")
    public WebElement follow_upSpan;

    @FindBy(id = "sc_task.group_list")
    public WebElement group_list;
    @FindBy(id = "status.sc_task.group_list")
    public WebElement group_listSpan;

    @FindBy(id = "sc_task.impact")
    public WebElement impact;
    @FindBy(id = "status.sc_task.impact")
    public WebElement impactSpan;

    @FindBy(id = "ni.sc_task.knowledge")
    public WebElement knowledge;
    @FindBy(id = "status.sc_task.knowledge")
    public WebElement knowledgeSpan;

    @FindBy(id = "sys_display.sc_task.location")
    public WebElement location;
    @FindBy(id = "status.sc_task.location")
    public WebElement locationSpan;

    @FindBy(id = "ni.sc_task.made_sla")
    public WebElement made_sla;
    @FindBy(id = "status.sc_task.made_sla")
    public WebElement made_slaSpan;

    @FindBy(id = "sc_task.number")
    public WebElement number;
    @FindBy(id = "status.sc_task.number")
    public WebElement numberSpan;

    @FindBy(id = "sc_task.opened_at")
    public WebElement opened_at;
    @FindBy(id = "status.sc_task.opened_at")
    public WebElement opened_atSpan;

    @FindBy(id = "sys_display.sc_task.opened_by")
    public WebElement opened_by;
    @FindBy(id = "status.sc_task.opened_by")
    public WebElement opened_bySpan;

    @FindBy(id = "sc_task.order")
    public WebElement order;
    @FindBy(id = "status.sc_task.order")
    public WebElement orderSpan;

    @FindBy(id = "sys_display.sc_task.parent")
    public WebElement parent;
    @FindBy(id = "status.sc_task.parent")
    public WebElement parentSpan;

    @FindBy(id = "sc_task.priority")
    public WebElement priority;
    @FindBy(id = "status.sc_task.priority")
    public WebElement prioritySpan;

    @FindBy(id = "sc_task.reassignment_count")
    public WebElement reassignment_count;
    @FindBy(id = "status.sc_task.reassignment_count")
    public WebElement reassignment_countSpan;

    @FindBy(id = "sys_display.sc_task.rejection_goto")
    public WebElement rejection_goto;
    @FindBy(id = "status.sc_task.rejection_goto")
    public WebElement rejection_gotoSpan;

    @FindBy(id = "sc_task.short_description")
    public WebElement short_description;
    @FindBy(id = "status.sc_task.short_description")
    public WebElement short_descriptionSpan;

    @FindBy(id = "sc_task.skills")
    public WebElement skills;
    @FindBy(id = "status.sc_task.skills")
    public WebElement skillsSpan;

    @FindBy(id = "sc_task.sla_due")
    public WebElement sla_due;
    @FindBy(id = "status.sc_task.sla_due")
    public WebElement sla_dueSpan;

    @FindBy(id = "sc_task.state")
    public WebElement state;
    @FindBy(id = "status.sc_task.state")
    public WebElement stateSpan;

    @FindBy(id = "sc_task.sys_class_name")
    public WebElement sys_class_name;
    @FindBy(id = "status.sc_task.sys_class_name")
    public WebElement sys_class_nameSpan;

    @FindBy(id = "sc_task.sys_created_by")
    public WebElement sys_created_by;
    @FindBy(id = "status.sc_task.sys_created_by")
    public WebElement sys_created_bySpan;

    @FindBy(id = "sc_task.sys_created_on")
    public WebElement sys_created_on;
    @FindBy(id = "status.sc_task.sys_created_on")
    public WebElement sys_created_onSpan;

    @FindBy(id = "sc_task.sys_domain")
    public WebElement sys_domain;
    @FindBy(id = "status.sc_task.sys_domain")
    public WebElement sys_domainSpan;

    @FindBy(id = "sc_task.sys_mod_count")
    public WebElement sys_mod_count;
    @FindBy(id = "status.sc_task.sys_mod_count")
    public WebElement sys_mod_countSpan;

    @FindBy(id = "sc_task.sys_updated_by")
    public WebElement sys_updated_by;
    @FindBy(id = "status.sc_task.sys_updated_by")
    public WebElement sys_updated_bySpan;

    @FindBy(id = "sc_task.sys_updated_on")
    public WebElement sys_updated_on;
    @FindBy(id = "status.sc_task.sys_updated_on")
    public WebElement sys_updated_onSpan;

    @FindBy(id = "sc_task.time_worked")
    public WebElement time_worked;
    @FindBy(id = "status.sc_task.time_worked")
    public WebElement time_workedSpan;

    @FindBy(id = "sc_task.upon_approval")
    public WebElement upon_approval;
    @FindBy(id = "status.sc_task.upon_approval")
    public WebElement upon_approvalSpan;

    @FindBy(id = "sc_task.upon_reject")
    public WebElement upon_reject;
    @FindBy(id = "status.sc_task.upon_reject")
    public WebElement upon_rejectSpan;

    @FindBy(id = "sc_task.urgency")
    public WebElement urgency;
    @FindBy(id = "status.sc_task.urgency")
    public WebElement urgencySpan;

    @FindBy(id = "sc_task.user_input")
    public WebElement user_input;
    @FindBy(id = "status.sc_task.user_input")
    public WebElement user_inputSpan;

    @FindBy(id = "sc_task.variables")
    public WebElement variables;
    @FindBy(id = "status.sc_task.variables")
    public WebElement variablesSpan;

    @FindBy(id = "sc_task.watch_list")
    public WebElement watch_list;
    @FindBy(id = "status.sc_task.watch_list")
    public WebElement watch_listSpan;

    @FindBy(id = "sys_display.sc_task.wf_activity")
    public WebElement wf_activity;
    @FindBy(id = "status.sc_task.wf_activity")
    public WebElement wf_activitySpan;

    @FindBy(id = "sc_task.work_end")
    public WebElement work_end;
    @FindBy(id = "status.sc_task.work_end")
    public WebElement work_endSpan;

    @FindBy(id = "sc_task.work_notes")
    public WebElement work_notes;
    @FindBy(id = "status.sc_task.work_notes")
    public WebElement work_notesSpan;

    @FindBy(id = "sc_task.work_notes_list")
    public WebElement work_notes_list;
    @FindBy(id = "status.sc_task.work_notes_list")
    public WebElement work_notes_listSpan;

    @FindBy(id = "sc_task.work_start")
    public WebElement work_start;
    @FindBy(id = "status.sc_task.work_start")
    public WebElement work_startSpan;
           
    /**
     * Changes the state of the task.  If the task is changing to closed, adds work notes
     * @param newState A string containing a state value
     */
    public void changeState(String newState){
        useSelectElement(state, newState);
        if (newState.contains("Closed")){
            work_notes.sendKeys("This task is now closed");
        }
        updateButton.click();
    }
    
    /**
     * Asserts that fields are mandatory that should be
     * Added a wait because of the inherent lagging from adding variables/ui policies/etc.
     */
    public void catalogTaskAssertions(){
        assertTrue("Short Description is Mandatory", isMandatory(short_descriptionSpan));
        makeThePageWait(5);
        assertTrue("Description is Mandatory", isMandatory(descriptionSpan));
        assertTrue("Assignment Group is Mandatory", isMandatory(assignment_groupSpan));
    }
    
    /**
     * Gets a list of all variables on screen
     * The variables are identified by their Question Text, not their name.  So "name" may be "Employee Name".
     * @return A list of all variables on screen
     */
    public List<String> getVariablesOnScreen() {
        List<WebElement> variableElements = driver.findElements(By.className("io_table"));
        List<String> variableNames = new ArrayList<>();
        for (WebElement row : variableElements) {
            List<WebElement> rows = row.findElements(By.tagName("tr"));
            variableNames.add(rows.get(0).getText().trim());
        }
        return variableNames;
    }
    
    /**
     * Given a list of variables, asserts that they equal what is on screen
     * @param expected A list of expected catalog variables
     */
    public void compareVariablesOnScreenToExpected(List<String> expected) {
        List<String> variablesOnScreen = getVariablesOnScreen();
        assertTrue("The variables give " + expected.toString() + " equal what's on screen " + variablesOnScreen.toString(), variablesOnScreen.equals(expected));
    }
    
}
