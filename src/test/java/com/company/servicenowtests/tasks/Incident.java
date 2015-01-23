package com.company.servicenowtests.tasks;

import com.company.servicenowtests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Contains all fields that could possible be on the Incident form
 * 
 * Generated via ClassGenerator Update Set, and was used on a OOB instance
 * 
 * @author Justin Bauguess
 */
public class Incident extends BaseTest {
    
    @FindBy(id = "ni.incident.active")
    public WebElement active;
    @FindBy(id = "status.incident.active")
    public WebElement activeSpan;

    @FindBy(id = "incident.activity_due")
    public WebElement activityDue;
    @FindBy(id = "status.incident.activity_due")
    public WebElement activityDueSpan;

    @FindBy(id = "incident.approval")
    public WebElement approval;
    @FindBy(id = "status.incident.approval")
    public WebElement approvalSpan;

    @FindBy(id = "incident.approval_history")
    public WebElement approvalHistory;
    @FindBy(id = "status.incident.approval_history")
    public WebElement approvalHistorySpan;

    @FindBy(id = "incident.approval_set")
    public WebElement approvalSet;
    @FindBy(id = "status.incident.approval_set")
    public WebElement approvalSetSpan;

    @FindBy(id = "sys_display.incident.assigned_to")
    public WebElement assignedTo;
    @FindBy(id = "status.incident.assigned_to")
    public WebElement assignedToSpan;

    @FindBy(id = "sys_display.incident.assignment_group")
    public WebElement assignmentGroup;
    @FindBy(id = "status.incident.assignment_group")
    public WebElement assignmentGroupSpan;

    @FindBy(id = "incident.business_duration")
    public WebElement businessDuration;
    @FindBy(id = "status.incident.business_duration")
    public WebElement businessDurationSpan;

    @FindBy(id = "incident.calendar_duration")
    public WebElement calendarDuration;
    @FindBy(id = "status.incident.calendar_duration")
    public WebElement calendarDurationSpan;

    @FindBy(id = "incident.closed_at")
    public WebElement closedAt;
    @FindBy(id = "status.incident.closed_at")
    public WebElement closedAtSpan;

    @FindBy(id = "sys_display.incident.closed_by")
    public WebElement closedBy;
    @FindBy(id = "status.incident.closed_by")
    public WebElement closedBySpan;

    @FindBy(id = "incident.close_notes")
    public WebElement closeNotes;
    @FindBy(id = "status.incident.close_notes")
    public WebElement closeNotesSpan;

    @FindBy(id = "sys_display.incident.cmdb_ci")
    public WebElement cmdbCi;
    @FindBy(id = "status.incident.cmdb_ci")
    public WebElement cmdbCiSpan;

    @FindBy(id = "incident.comments")
    public WebElement comments;
    @FindBy(id = "status.incident.comments")
    public WebElement commentsSpan;

    @FindBy(id = "incident.comments_and_work_notes")
    public WebElement commentsAndWorkNotes;
    @FindBy(id = "status.incident.comments_and_work_notes")
    public WebElement commentsAndWorkNotesSpan;

    @FindBy(id = "sys_display.incident.company")
    public WebElement company;
    @FindBy(id = "status.incident.company")
    public WebElement companySpan;

    @FindBy(id = "incident.contact_type")
    public WebElement contactType;
    @FindBy(id = "status.incident.contact_type")
    public WebElement contactTypeSpan;

    @FindBy(id = "incident.correlation_display")
    public WebElement correlationDisplay;
    @FindBy(id = "status.incident.correlation_display")
    public WebElement correlationDisplaySpan;

    @FindBy(id = "incident.correlation_id")
    public WebElement correlationId;
    @FindBy(id = "status.incident.correlation_id")
    public WebElement correlationIdSpan;

    @FindBy(id = "sys_display.incident.delivery_plan")
    public WebElement deliveryPlan;
    @FindBy(id = "status.incident.delivery_plan")
    public WebElement deliveryPlanSpan;

    @FindBy(id = "sys_display.incident.delivery_task")
    public WebElement deliveryTask;
    @FindBy(id = "status.incident.delivery_task")
    public WebElement deliveryTaskSpan;

    @FindBy(id = "incident.description")
    public WebElement description;
    @FindBy(id = "status.incident.description")
    public WebElement descriptionSpan;

    @FindBy(id = "incident.due_date")
    public WebElement dueDate;
    @FindBy(id = "status.incident.due_date")
    public WebElement dueDateSpan;

    @FindBy(id = "incident.escalation")
    public WebElement escalation;
    @FindBy(id = "status.incident.escalation")
    public WebElement escalationSpan;

    @FindBy(id = "incident.expected_start")
    public WebElement expectedStart;
    @FindBy(id = "status.incident.expected_start")
    public WebElement expectedStartSpan;

    @FindBy(id = "incident.follow_up")
    public WebElement followUp;
    @FindBy(id = "status.incident.follow_up")
    public WebElement followUpSpan;

    @FindBy(id = "incident.group_list")
    public WebElement groupList;
    @FindBy(id = "status.incident.group_list")
    public WebElement groupListSpan;

    @FindBy(id = "incident.impact")
    public WebElement impact;
    @FindBy(id = "status.incident.impact")
    public WebElement impactSpan;

    @FindBy(id = "ni.incident.knowledge")
    public WebElement knowledge;
    @FindBy(id = "status.incident.knowledge")
    public WebElement knowledgeSpan;

    @FindBy(id = "sys_display.incident.location")
    public WebElement location;
    @FindBy(id = "status.incident.location")
    public WebElement locationSpan;

    @FindBy(id = "ni.incident.made_sla")
    public WebElement madeSla;
    @FindBy(id = "status.incident.made_sla")
    public WebElement madeSlaSpan;

    @FindBy(id = "incident.number")
    public WebElement number;
    @FindBy(id = "status.incident.number")
    public WebElement numberSpan;

    @FindBy(id = "incident.opened_at")
    public WebElement openedAt;
    @FindBy(id = "status.incident.opened_at")
    public WebElement openedAtSpan;

    @FindBy(id = "sys_display.incident.opened_by")
    public WebElement openedBy;
    @FindBy(id = "status.incident.opened_by")
    public WebElement openedBySpan;

    @FindBy(id = "incident.order")
    public WebElement order;
    @FindBy(id = "status.incident.order")
    public WebElement orderSpan;

    @FindBy(id = "sys_display.incident.parent")
    public WebElement parent;
    @FindBy(id = "status.incident.parent")
    public WebElement parentSpan;

    @FindBy(id = "incident.priority")
    public WebElement priority;
    @FindBy(id = "status.incident.priority")
    public WebElement prioritySpan;

    @FindBy(id = "incident.reassignment_count")
    public WebElement reassignmentCount;
    @FindBy(id = "status.incident.reassignment_count")
    public WebElement reassignmentCountSpan;

    @FindBy(id = "sys_display.incident.rejection_goto")
    public WebElement rejectionGoto;
    @FindBy(id = "status.incident.rejection_goto")
    public WebElement rejectionGotoSpan;

    @FindBy(id = "sys_display.incident.service_offering")
    public WebElement serviceOffering;
    @FindBy(id = "status.incident.service_offering")
    public WebElement serviceOfferingSpan;

    @FindBy(id = "incident.short_description")
    public WebElement shortDescription;
    @FindBy(id = "status.incident.short_description")
    public WebElement shortDescriptionSpan;

    @FindBy(id = "incident.skills")
    public WebElement skills;
    @FindBy(id = "status.incident.skills")
    public WebElement skillsSpan;

    @FindBy(id = "incident.sla_due")
    public WebElement slaDue;
    @FindBy(id = "status.incident.sla_due")
    public WebElement slaDueSpan;

    @FindBy(id = "incident.state")
    public WebElement state;
    @FindBy(id = "status.incident.state")
    public WebElement stateSpan;

    @FindBy(id = "incident.sys_class_name")
    public WebElement sysClassName;
    @FindBy(id = "status.incident.sys_class_name")
    public WebElement sysClassNameSpan;

    @FindBy(id = "incident.sys_created_by")
    public WebElement sysCreatedBy;
    @FindBy(id = "status.incident.sys_created_by")
    public WebElement sysCreatedBySpan;

    @FindBy(id = "incident.sys_created_on")
    public WebElement sysCreatedOn;
    @FindBy(id = "status.incident.sys_created_on")
    public WebElement sysCreatedOnSpan;

    @FindBy(id = "incident.sys_domain")
    public WebElement sysDomain;
    @FindBy(id = "status.incident.sys_domain")
    public WebElement sysDomainSpan;

    @FindBy(id = "incident.sys_mod_count")
    public WebElement sysModCount;
    @FindBy(id = "status.incident.sys_mod_count")
    public WebElement sysModCountSpan;

    @FindBy(id = "incident.sys_updated_by")
    public WebElement sysUpdatedBy;
    @FindBy(id = "status.incident.sys_updated_by")
    public WebElement sysUpdatedBySpan;

    @FindBy(id = "incident.sys_updated_on")
    public WebElement sysUpdatedOn;
    @FindBy(id = "status.incident.sys_updated_on")
    public WebElement sysUpdatedOnSpan;

    @FindBy(id = "incident.time_worked")
    public WebElement timeWorked;
    @FindBy(id = "status.incident.time_worked")
    public WebElement timeWorkedSpan;

    @FindBy(id = "incident.upon_approval")
    public WebElement uponApproval;
    @FindBy(id = "status.incident.upon_approval")
    public WebElement uponApprovalSpan;

    @FindBy(id = "incident.upon_reject")
    public WebElement uponReject;
    @FindBy(id = "status.incident.upon_reject")
    public WebElement uponRejectSpan;

    @FindBy(id = "incident.urgency")
    public WebElement urgency;
    @FindBy(id = "status.incident.urgency")
    public WebElement urgencySpan;

    @FindBy(id = "incident.user_input")
    public WebElement userInput;
    @FindBy(id = "status.incident.user_input")
    public WebElement userInputSpan;

    @FindBy(id = "incident.variables")
    public WebElement variables;
    @FindBy(id = "status.incident.variables")
    public WebElement variablesSpan;

    @FindBy(id = "incident.watch_list")
    public WebElement watchList;
    @FindBy(id = "status.incident.watch_list")
    public WebElement watchListSpan;

    @FindBy(id = "sys_display.incident.wf_activity")
    public WebElement wfActivity;
    @FindBy(id = "status.incident.wf_activity")
    public WebElement wfActivitySpan;

    @FindBy(id = "incident.work_end")
    public WebElement workEnd;
    @FindBy(id = "status.incident.work_end")
    public WebElement workEndSpan;

    @FindBy(id = "incident.work_notes")
    public WebElement workNotes;
    @FindBy(id = "status.incident.work_notes")
    public WebElement workNotesSpan;

    @FindBy(id = "incident.work_notes_list")
    public WebElement workNotesList;
    @FindBy(id = "status.incident.work_notes_list")
    public WebElement workNotesListSpan;

    @FindBy(id = "incident.work_start")
    public WebElement workStart;
    @FindBy(id = "status.incident.work_start")
    public WebElement workStartSpan;

    @FindBy(id = "sys_uniqueValue")
    public WebElement sysId;

    @FindBy(id = "incident.business_stc")
    public WebElement businessStc;
    @FindBy(id = "status.incident.business_stc")
    public WebElement businessStcSpan;

    @FindBy(id = "incident.calendar_stc")
    public WebElement calendarStc;
    @FindBy(id = "status.incident.calendar_stc")
    public WebElement calendarStcSpan;

    @FindBy(id = "sys_display.incident.caller_id")
    public WebElement callerId;
    @FindBy(id = "status.incident.caller_id")
    public WebElement callerIdSpan;

    @FindBy(id = "incident.category")
    public WebElement category;
    @FindBy(id = "status.incident.category")
    public WebElement categorySpan;

    @FindBy(id = "sys_display.incident.caused_by")
    public WebElement causedBy;
    @FindBy(id = "status.incident.caused_by")
    public WebElement causedBySpan;

    @FindBy(id = "incident.child_incidents")
    public WebElement childIncidents;
    @FindBy(id = "status.incident.child_incidents")
    public WebElement childIncidentsSpan;

    @FindBy(id = "incident.close_code")
    public WebElement closeCode;
    @FindBy(id = "status.incident.close_code")
    public WebElement closeCodeSpan;

    @FindBy(id = "incident.incident_state")
    public WebElement incidentState;
    @FindBy(id = "status.incident.incident_state")
    public WebElement incidentStateSpan;

    @FindBy(id = "incident.notify")
    public WebElement notify;
    @FindBy(id = "status.incident.notify")
    public WebElement notifySpan;

    @FindBy(id = "sys_display.incident.parent_incident")
    public WebElement parentIncident;
    @FindBy(id = "status.incident.parent_incident")
    public WebElement parentIncidentSpan;

    @FindBy(id = "sys_display.incident.problem_id")
    public WebElement problemId;
    @FindBy(id = "status.incident.problem_id")
    public WebElement problemIdSpan;

    @FindBy(id = "incident.reopen_count")
    public WebElement reopenCount;
    @FindBy(id = "status.incident.reopen_count")
    public WebElement reopenCountSpan;

    @FindBy(id = "incident.resolved_at")
    public WebElement resolvedAt;
    @FindBy(id = "status.incident.resolved_at")
    public WebElement resolvedAtSpan;

    @FindBy(id = "sys_display.incident.resolved_by")
    public WebElement resolvedBy;
    @FindBy(id = "status.incident.resolved_by")
    public WebElement resolvedBySpan;

    @FindBy(id = "sys_display.incident.rfc")
    public WebElement rfc;
    @FindBy(id = "status.incident.rfc")
    public WebElement rfcSpan;

    @FindBy(id = "incident.severity")
    public WebElement severity;
    @FindBy(id = "status.incident.severity")
    public WebElement severitySpan;

    @FindBy(id = "incident.subcategory")
    public WebElement subcategory;
    @FindBy(id = "status.incident.subcategory")
    public WebElement subcategorySpan;

    @FindBy(id = "sys_display.incident.vendor")
    public WebElement vendor;
    @FindBy(id = "status.incident.vendor")
    public WebElement vendorSpan;

    @FindBy(id = "incident.vendor_closed_at")
    public WebElement vendorClosedAt;
    @FindBy(id = "status.incident.vendor_closed_at")
    public WebElement vendorClosedAtSpan;

    @FindBy(id = "incident.vendor_opened_at")
    public WebElement vendorOpenedAt;
    @FindBy(id = "status.incident.vendor_opened_at")
    public WebElement vendorOpenedAtSpan;

    @FindBy(id = "incident.vendor_point_of_contact")
    public WebElement vendorPointOfContact;
    @FindBy(id = "status.incident.vendor_point_of_contact")
    public WebElement vendorPointOfContactSpan;

    @FindBy(id = "incident.vendor_resolved_at")
    public WebElement vendorResolvedAt;
    @FindBy(id = "status.incident.vendor_resolved_at")
    public WebElement vendorResolvedAtSpan;

    @FindBy(id = "incident.vendor_ticket")
    public WebElement vendorTicket;
    @FindBy(id = "status.incident.vendor_ticket")
    public WebElement vendorTicketSpan;

    public Incident(WebDriver driver) {
        super(driver);
    }

    /**
     * Gets the current incident
     *
     * @return The URL to the current incident
     */
    public String getCurrentIncident() {
        return getBASE_URL() + "incident.do?sys_id=" + sysId.getAttribute("value");
    }

}
