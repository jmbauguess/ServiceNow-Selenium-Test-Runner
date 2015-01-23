package com.company.servicenowtests.tasks;

import com.company.servicenowtests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Contains the fields from the base Task table
 * 
 * @author Justin Bauguess
 */
public class Task extends BaseTest {
    
    @FindBy(id = "ni.task.active")
    public WebElement active;
    @FindBy(id = "status.task.active")
    public WebElement activeSpan;

    @FindBy(id = "task.activity_due")
    public WebElement activityDue;
    @FindBy(id = "status.task.activity_due")
    public WebElement activityDueSpan;

    @FindBy(id = "task.approval")
    public WebElement approval;
    @FindBy(id = "status.task.approval")
    public WebElement approvalSpan;

    @FindBy(id = "task.approval_history")
    public WebElement approvalHistory;
    @FindBy(id = "status.task.approval_history")
    public WebElement approvalHistorySpan;

    @FindBy(id = "task.approval_set")
    public WebElement approvalSet;
    @FindBy(id = "status.task.approval_set")
    public WebElement approvalSetSpan;

    @FindBy(id = "sys_display.task.assigned_to")
    public WebElement assignedTo;
    @FindBy(id = "status.task.assigned_to")
    public WebElement assignedToSpan;

    @FindBy(id = "sys_display.task.assignment_group")
    public WebElement assignmentGroup;
    @FindBy(id = "status.task.assignment_group")
    public WebElement assignmentGroupSpan;

    @FindBy(id = "task.business_duration")
    public WebElement businessDuration;
    @FindBy(id = "status.task.business_duration")
    public WebElement businessDurationSpan;

    @FindBy(id = "task.calendar_duration")
    public WebElement calendarDuration;
    @FindBy(id = "status.task.calendar_duration")
    public WebElement calendarDurationSpan;

    @FindBy(id = "task.closed_at")
    public WebElement closedAt;
    @FindBy(id = "status.task.closed_at")
    public WebElement closedAtSpan;

    @FindBy(id = "sys_display.task.closed_by")
    public WebElement closedBy;
    @FindBy(id = "status.task.closed_by")
    public WebElement closedBySpan;

    @FindBy(id = "task.close_notes")
    public WebElement closeNotes;
    @FindBy(id = "status.task.close_notes")
    public WebElement closeNotesSpan;

    @FindBy(id = "sys_display.task.cmdb_ci")
    public WebElement cmdbCi;
    @FindBy(id = "status.task.cmdb_ci")
    public WebElement cmdbCiSpan;

    @FindBy(id = "task.comments")
    public WebElement comments;
    @FindBy(id = "status.task.comments")
    public WebElement commentsSpan;

    @FindBy(id = "task.comments_and_work_notes")
    public WebElement commentsAndWorkNotes;
    @FindBy(id = "status.task.comments_and_work_notes")
    public WebElement commentsAndWorkNotesSpan;

    @FindBy(id = "sys_display.task.company")
    public WebElement company;
    @FindBy(id = "status.task.company")
    public WebElement companySpan;

    @FindBy(id = "task.contact_type")
    public WebElement contactType;
    @FindBy(id = "status.task.contact_type")
    public WebElement contactTypeSpan;

    @FindBy(id = "task.correlation_display")
    public WebElement correlationDisplay;
    @FindBy(id = "status.task.correlation_display")
    public WebElement correlationDisplaySpan;

    @FindBy(id = "task.correlation_id")
    public WebElement correlationId;
    @FindBy(id = "status.task.correlation_id")
    public WebElement correlationIdSpan;

    @FindBy(id = "sys_display.task.delivery_plan")
    public WebElement deliveryPlan;
    @FindBy(id = "status.task.delivery_plan")
    public WebElement deliveryPlanSpan;

    @FindBy(id = "sys_display.task.delivery_task")
    public WebElement deliveryTask;
    @FindBy(id = "status.task.delivery_task")
    public WebElement deliveryTaskSpan;

    @FindBy(id = "task.description")
    public WebElement description;
    @FindBy(id = "status.task.description")
    public WebElement descriptionSpan;

    @FindBy(id = "task.due_date")
    public WebElement dueDate;
    @FindBy(id = "status.task.due_date")
    public WebElement dueDateSpan;

    @FindBy(id = "task.escalation")
    public WebElement escalation;
    @FindBy(id = "status.task.escalation")
    public WebElement escalationSpan;

    @FindBy(id = "task.expected_start")
    public WebElement expectedStart;
    @FindBy(id = "status.task.expected_start")
    public WebElement expectedStartSpan;

    @FindBy(id = "task.follow_up")
    public WebElement followUp;
    @FindBy(id = "status.task.follow_up")
    public WebElement followUpSpan;

    @FindBy(id = "task.group_list")
    public WebElement groupList;
    @FindBy(id = "status.task.group_list")
    public WebElement groupListSpan;

    @FindBy(id = "task.impact")
    public WebElement impact;
    @FindBy(id = "status.task.impact")
    public WebElement impactSpan;

    @FindBy(id = "ni.task.knowledge")
    public WebElement knowledge;
    @FindBy(id = "status.task.knowledge")
    public WebElement knowledgeSpan;

    @FindBy(id = "sys_display.task.location")
    public WebElement location;
    @FindBy(id = "status.task.location")
    public WebElement locationSpan;

    @FindBy(id = "ni.task.made_sla")
    public WebElement madeSla;
    @FindBy(id = "status.task.made_sla")
    public WebElement madeSlaSpan;

    @FindBy(id = "task.number")
    public WebElement number;
    @FindBy(id = "status.task.number")
    public WebElement numberSpan;

    @FindBy(id = "task.opened_at")
    public WebElement openedAt;
    @FindBy(id = "status.task.opened_at")
    public WebElement openedAtSpan;

    @FindBy(id = "sys_display.task.opened_by")
    public WebElement openedBy;
    @FindBy(id = "status.task.opened_by")
    public WebElement openedBySpan;

    @FindBy(id = "task.order")
    public WebElement order;
    @FindBy(id = "status.task.order")
    public WebElement orderSpan;

    @FindBy(id = "sys_display.task.parent")
    public WebElement parent;
    @FindBy(id = "status.task.parent")
    public WebElement parentSpan;

    @FindBy(id = "task.priority")
    public WebElement priority;
    @FindBy(id = "status.task.priority")
    public WebElement prioritySpan;

    @FindBy(id = "task.reassignment_count")
    public WebElement reassignmentCount;
    @FindBy(id = "status.task.reassignment_count")
    public WebElement reassignmentCountSpan;

    @FindBy(id = "sys_display.task.rejection_goto")
    public WebElement rejectionGoto;
    @FindBy(id = "status.task.rejection_goto")
    public WebElement rejectionGotoSpan;

    @FindBy(id = "sys_display.task.service_offering")
    public WebElement serviceOffering;
    @FindBy(id = "status.task.service_offering")
    public WebElement serviceOfferingSpan;

    @FindBy(id = "task.short_description")
    public WebElement shortDescription;
    @FindBy(id = "status.task.short_description")
    public WebElement shortDescriptionSpan;

    @FindBy(id = "task.skills")
    public WebElement skills;
    @FindBy(id = "status.task.skills")
    public WebElement skillsSpan;

    @FindBy(id = "task.sla_due")
    public WebElement slaDue;
    @FindBy(id = "status.task.sla_due")
    public WebElement slaDueSpan;

    @FindBy(id = "task.state")
    public WebElement state;
    @FindBy(id = "status.task.state")
    public WebElement stateSpan;

    @FindBy(id = "task.sys_class_name")
    public WebElement sysClassName;
    @FindBy(id = "status.task.sys_class_name")
    public WebElement sysClassNameSpan;

    @FindBy(id = "task.sys_created_by")
    public WebElement sysCreatedBy;
    @FindBy(id = "status.task.sys_created_by")
    public WebElement sysCreatedBySpan;

    @FindBy(id = "task.sys_created_on")
    public WebElement sysCreatedOn;
    @FindBy(id = "status.task.sys_created_on")
    public WebElement sysCreatedOnSpan;

    @FindBy(id = "task.sys_domain")
    public WebElement sysDomain;
    @FindBy(id = "status.task.sys_domain")
    public WebElement sysDomainSpan;

    @FindBy(id = "task.sys_mod_count")
    public WebElement sysModCount;
    @FindBy(id = "status.task.sys_mod_count")
    public WebElement sysModCountSpan;

    @FindBy(id = "task.sys_updated_by")
    public WebElement sysUpdatedBy;
    @FindBy(id = "status.task.sys_updated_by")
    public WebElement sysUpdatedBySpan;

    @FindBy(id = "task.sys_updated_on")
    public WebElement sysUpdatedOn;
    @FindBy(id = "status.task.sys_updated_on")
    public WebElement sysUpdatedOnSpan;

    @FindBy(id = "task.time_worked")
    public WebElement timeWorked;
    @FindBy(id = "status.task.time_worked")
    public WebElement timeWorkedSpan;

    @FindBy(id = "task.upon_approval")
    public WebElement uponApproval;
    @FindBy(id = "status.task.upon_approval")
    public WebElement uponApprovalSpan;

    @FindBy(id = "task.upon_reject")
    public WebElement uponReject;
    @FindBy(id = "status.task.upon_reject")
    public WebElement uponRejectSpan;

    @FindBy(id = "task.urgency")
    public WebElement urgency;
    @FindBy(id = "status.task.urgency")
    public WebElement urgencySpan;

    @FindBy(id = "task.user_input")
    public WebElement userInput;
    @FindBy(id = "status.task.user_input")
    public WebElement userInputSpan;

    @FindBy(id = "task.variables")
    public WebElement variables;
    @FindBy(id = "status.task.variables")
    public WebElement variablesSpan;

    @FindBy(id = "task.watch_list")
    public WebElement watchList;
    @FindBy(id = "status.task.watch_list")
    public WebElement watchListSpan;

    @FindBy(id = "sys_display.task.wf_activity")
    public WebElement wfActivity;
    @FindBy(id = "status.task.wf_activity")
    public WebElement wfActivitySpan;

    @FindBy(id = "task.work_end")
    public WebElement workEnd;
    @FindBy(id = "status.task.work_end")
    public WebElement workEndSpan;

    @FindBy(id = "task.work_notes")
    public WebElement workNotes;
    @FindBy(id = "status.task.work_notes")
    public WebElement workNotesSpan;

    @FindBy(id = "task.work_notes_list")
    public WebElement workNotesList;
    @FindBy(id = "status.task.work_notes_list")
    public WebElement workNotesListSpan;

    @FindBy(id = "task.work_start")
    public WebElement workStart;
    @FindBy(id = "status.task.work_start")
    public WebElement workStartSpan;

    @FindBy(id = "sys_uniqueValue")
    public WebElement sysId;

    public Task(WebDriver driver) {
        super(driver);
    }

}
