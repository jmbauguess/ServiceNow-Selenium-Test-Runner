package com.company.servicenowtests.tasks;

import com.company.servicenowtests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Contains all fields from a Requested Item
 * 
 * @author Justin Bauguess
 */
public class ScReqItem extends BaseTest {

    @FindBy(id = "ni.sc_req_item.backordered")
    public WebElement backordered;
    @FindBy(id = "status.sc_req_item.backordered")
    public WebElement backorderedSpan;

    @FindBy(id = "ni.sc_req_item.billable")
    public WebElement billable;
    @FindBy(id = "status.sc_req_item.billable")
    public WebElement billableSpan;

    @FindBy(id = "sys_display.sc_req_item.cat_item")
    public WebElement catItem;
    @FindBy(id = "status.sc_req_item.cat_item")
    public WebElement catItemSpan;

    @FindBy(id = "sys_display.sc_req_item.configuration_item")
    public WebElement configurationItem;
    @FindBy(id = "status.sc_req_item.configuration_item")
    public WebElement configurationItemSpan;

    @FindBy(id = "sys_display.sc_req_item.context")
    public WebElement context;
    @FindBy(id = "status.sc_req_item.context")
    public WebElement contextSpan;

    @FindBy(id = "sc_req_item.estimated_delivery")
    public WebElement estimatedDelivery;
    @FindBy(id = "status.sc_req_item.estimated_delivery")
    public WebElement estimatedDeliverySpan;

    @FindBy(id = "sc_req_item.price")
    public WebElement price;
    @FindBy(id = "status.sc_req_item.price")
    public WebElement priceSpan;

    @FindBy(id = "sc_req_item.quantity")
    public WebElement quantity;
    @FindBy(id = "status.sc_req_item.quantity")
    public WebElement quantitySpan;

    @FindBy(id = "sc_req_item.recurring_frequency")
    public WebElement recurringFrequency;
    @FindBy(id = "status.sc_req_item.recurring_frequency")
    public WebElement recurringFrequencySpan;

    @FindBy(id = "sc_req_item.recurring_price")
    public WebElement recurringPrice;
    @FindBy(id = "status.sc_req_item.recurring_price")
    public WebElement recurringPriceSpan;

    @FindBy(id = "sys_display.sc_req_item.request")
    public WebElement request;
    @FindBy(id = "status.sc_req_item.request")
    public WebElement requestSpan;

    @FindBy(id = "sys_display.sc_req_item.sc_catalog")
    public WebElement scCatalog;
    @FindBy(id = "status.sc_req_item.sc_catalog")
    public WebElement scCatalogSpan;

    @FindBy(id = "sc_req_item.stage")
    public WebElement stage;
    @FindBy(id = "status.sc_req_item.stage")
    public WebElement stageSpan;

    @FindBy(id = "sys_uniqueValue")
    public WebElement sysId;

    @FindBy(id = "ni.sc_req_item.active")
    public WebElement active;
    @FindBy(id = "status.sc_req_item.active")
    public WebElement activeSpan;

    @FindBy(id = "sc_req_item.activity_due")
    public WebElement activityDue;
    @FindBy(id = "status.sc_req_item.activity_due")
    public WebElement activityDueSpan;

    @FindBy(id = "sc_req_item.approval")
    public WebElement approval;
    @FindBy(id = "status.sc_req_item.approval")
    public WebElement approvalSpan;

    @FindBy(id = "sc_req_item.approval_history")
    public WebElement approvalHistory;
    @FindBy(id = "status.sc_req_item.approval_history")
    public WebElement approvalHistorySpan;

    @FindBy(id = "sc_req_item.approval_set")
    public WebElement approvalSet;
    @FindBy(id = "status.sc_req_item.approval_set")
    public WebElement approvalSetSpan;

    @FindBy(id = "sys_display.sc_req_item.assigned_to")
    public WebElement assignedTo;
    @FindBy(id = "status.sc_req_item.assigned_to")
    public WebElement assignedToSpan;

    @FindBy(id = "sys_display.sc_req_item.assignment_group")
    public WebElement assignmentGroup;
    @FindBy(id = "status.sc_req_item.assignment_group")
    public WebElement assignmentGroupSpan;

    @FindBy(id = "sc_req_item.business_duration")
    public WebElement businessDuration;
    @FindBy(id = "status.sc_req_item.business_duration")
    public WebElement businessDurationSpan;

    @FindBy(id = "sc_req_item.calendar_duration")
    public WebElement calendarDuration;
    @FindBy(id = "status.sc_req_item.calendar_duration")
    public WebElement calendarDurationSpan;

    @FindBy(id = "sc_req_item.closed_at")
    public WebElement closedAt;
    @FindBy(id = "status.sc_req_item.closed_at")
    public WebElement closedAtSpan;

    @FindBy(id = "sys_display.sc_req_item.closed_by")
    public WebElement closedBy;
    @FindBy(id = "status.sc_req_item.closed_by")
    public WebElement closedBySpan;

    @FindBy(id = "sc_req_item.close_notes")
    public WebElement closeNotes;
    @FindBy(id = "status.sc_req_item.close_notes")
    public WebElement closeNotesSpan;

    @FindBy(id = "sys_display.sc_req_item.cmdb_ci")
    public WebElement cmdbCi;
    @FindBy(id = "status.sc_req_item.cmdb_ci")
    public WebElement cmdbCiSpan;

    @FindBy(id = "sc_req_item.comments")
    public WebElement comments;
    @FindBy(id = "status.sc_req_item.comments")
    public WebElement commentsSpan;

    @FindBy(id = "sc_req_item.comments_and_work_notes")
    public WebElement commentsAndWorkNotes;
    @FindBy(id = "status.sc_req_item.comments_and_work_notes")
    public WebElement commentsAndWorkNotesSpan;

    @FindBy(id = "sys_display.sc_req_item.company")
    public WebElement company;
    @FindBy(id = "status.sc_req_item.company")
    public WebElement companySpan;

    @FindBy(id = "sc_req_item.contact_type")
    public WebElement contactType;
    @FindBy(id = "status.sc_req_item.contact_type")
    public WebElement contactTypeSpan;

    @FindBy(id = "sc_req_item.correlation_display")
    public WebElement correlationDisplay;
    @FindBy(id = "status.sc_req_item.correlation_display")
    public WebElement correlationDisplaySpan;

    @FindBy(id = "sc_req_item.correlation_id")
    public WebElement correlationId;
    @FindBy(id = "status.sc_req_item.correlation_id")
    public WebElement correlationIdSpan;

    @FindBy(id = "sys_display.sc_req_item.delivery_plan")
    public WebElement deliveryPlan;
    @FindBy(id = "status.sc_req_item.delivery_plan")
    public WebElement deliveryPlanSpan;

    @FindBy(id = "sys_display.sc_req_item.delivery_task")
    public WebElement deliveryTask;
    @FindBy(id = "status.sc_req_item.delivery_task")
    public WebElement deliveryTaskSpan;

    @FindBy(id = "sc_req_item.description")
    public WebElement description;
    @FindBy(id = "status.sc_req_item.description")
    public WebElement descriptionSpan;

    @FindBy(id = "sc_req_item.due_date")
    public WebElement dueDate;
    @FindBy(id = "status.sc_req_item.due_date")
    public WebElement dueDateSpan;

    @FindBy(id = "sc_req_item.escalation")
    public WebElement escalation;
    @FindBy(id = "status.sc_req_item.escalation")
    public WebElement escalationSpan;

    @FindBy(id = "sc_req_item.expected_start")
    public WebElement expectedStart;
    @FindBy(id = "status.sc_req_item.expected_start")
    public WebElement expectedStartSpan;

    @FindBy(id = "sc_req_item.follow_up")
    public WebElement followUp;
    @FindBy(id = "status.sc_req_item.follow_up")
    public WebElement followUpSpan;

    @FindBy(id = "sc_req_item.group_list")
    public WebElement groupList;
    @FindBy(id = "status.sc_req_item.group_list")
    public WebElement groupListSpan;

    @FindBy(id = "sc_req_item.impact")
    public WebElement impact;
    @FindBy(id = "status.sc_req_item.impact")
    public WebElement impactSpan;

    @FindBy(id = "ni.sc_req_item.knowledge")
    public WebElement knowledge;
    @FindBy(id = "status.sc_req_item.knowledge")
    public WebElement knowledgeSpan;

    @FindBy(id = "sys_display.sc_req_item.location")
    public WebElement location;
    @FindBy(id = "status.sc_req_item.location")
    public WebElement locationSpan;

    @FindBy(id = "ni.sc_req_item.made_sla")
    public WebElement madeSla;
    @FindBy(id = "status.sc_req_item.made_sla")
    public WebElement madeSlaSpan;

    @FindBy(id = "sc_req_item.number")
    public WebElement number;
    @FindBy(id = "status.sc_req_item.number")
    public WebElement numberSpan;

    @FindBy(id = "sc_req_item.opened_at")
    public WebElement openedAt;
    @FindBy(id = "status.sc_req_item.opened_at")
    public WebElement openedAtSpan;

    @FindBy(id = "sys_display.sc_req_item.opened_by")
    public WebElement openedBy;
    @FindBy(id = "status.sc_req_item.opened_by")
    public WebElement openedBySpan;

    @FindBy(id = "sc_req_item.order")
    public WebElement order;
    @FindBy(id = "status.sc_req_item.order")
    public WebElement orderSpan;

    @FindBy(id = "sys_display.sc_req_item.parent")
    public WebElement parent;
    @FindBy(id = "status.sc_req_item.parent")
    public WebElement parentSpan;

    @FindBy(id = "sc_req_item.priority")
    public WebElement priority;
    @FindBy(id = "status.sc_req_item.priority")
    public WebElement prioritySpan;

    @FindBy(id = "sc_req_item.reassignment_count")
    public WebElement reassignmentCount;
    @FindBy(id = "status.sc_req_item.reassignment_count")
    public WebElement reassignmentCountSpan;

    @FindBy(id = "sys_display.sc_req_item.rejection_goto")
    public WebElement rejectionGoto;
    @FindBy(id = "status.sc_req_item.rejection_goto")
    public WebElement rejectionGotoSpan;

    @FindBy(id = "sys_display.sc_req_item.service_offering")
    public WebElement serviceOffering;
    @FindBy(id = "status.sc_req_item.service_offering")
    public WebElement serviceOfferingSpan;

    @FindBy(id = "sc_req_item.short_description")
    public WebElement shortDescription;
    @FindBy(id = "status.sc_req_item.short_description")
    public WebElement shortDescriptionSpan;

    @FindBy(id = "sc_req_item.skills")
    public WebElement skills;
    @FindBy(id = "status.sc_req_item.skills")
    public WebElement skillsSpan;

    @FindBy(id = "sc_req_item.sla_due")
    public WebElement slaDue;
    @FindBy(id = "status.sc_req_item.sla_due")
    public WebElement slaDueSpan;

    @FindBy(id = "sc_req_item.state")
    public WebElement state;
    @FindBy(id = "status.sc_req_item.state")
    public WebElement stateSpan;

    @FindBy(id = "sc_req_item.sys_class_name")
    public WebElement sysClassName;
    @FindBy(id = "status.sc_req_item.sys_class_name")
    public WebElement sysClassNameSpan;

    @FindBy(id = "sc_req_item.sys_created_by")
    public WebElement sysCreatedBy;
    @FindBy(id = "status.sc_req_item.sys_created_by")
    public WebElement sysCreatedBySpan;

    @FindBy(id = "sc_req_item.sys_created_on")
    public WebElement sysCreatedOn;
    @FindBy(id = "status.sc_req_item.sys_created_on")
    public WebElement sysCreatedOnSpan;

    @FindBy(id = "sc_req_item.sys_domain")
    public WebElement sysDomain;
    @FindBy(id = "status.sc_req_item.sys_domain")
    public WebElement sysDomainSpan;

    @FindBy(id = "sc_req_item.sys_mod_count")
    public WebElement sysModCount;
    @FindBy(id = "status.sc_req_item.sys_mod_count")
    public WebElement sysModCountSpan;

    @FindBy(id = "sc_req_item.sys_updated_by")
    public WebElement sysUpdatedBy;
    @FindBy(id = "status.sc_req_item.sys_updated_by")
    public WebElement sysUpdatedBySpan;

    @FindBy(id = "sc_req_item.sys_updated_on")
    public WebElement sysUpdatedOn;
    @FindBy(id = "status.sc_req_item.sys_updated_on")
    public WebElement sysUpdatedOnSpan;

    @FindBy(id = "sc_req_item.time_worked")
    public WebElement timeWorked;
    @FindBy(id = "status.sc_req_item.time_worked")
    public WebElement timeWorkedSpan;

    @FindBy(id = "sc_req_item.upon_approval")
    public WebElement uponApproval;
    @FindBy(id = "status.sc_req_item.upon_approval")
    public WebElement uponApprovalSpan;

    @FindBy(id = "sc_req_item.upon_reject")
    public WebElement uponReject;
    @FindBy(id = "status.sc_req_item.upon_reject")
    public WebElement uponRejectSpan;

    @FindBy(id = "sc_req_item.urgency")
    public WebElement urgency;
    @FindBy(id = "status.sc_req_item.urgency")
    public WebElement urgencySpan;

    @FindBy(id = "sc_req_item.user_input")
    public WebElement userInput;
    @FindBy(id = "status.sc_req_item.user_input")
    public WebElement userInputSpan;

    @FindBy(id = "sc_req_item.variables")
    public WebElement variables;
    @FindBy(id = "status.sc_req_item.variables")
    public WebElement variablesSpan;

    @FindBy(id = "sc_req_item.watch_list")
    public WebElement watchList;
    @FindBy(id = "status.sc_req_item.watch_list")
    public WebElement watchListSpan;

    @FindBy(id = "sys_display.sc_req_item.wf_activity")
    public WebElement wfActivity;
    @FindBy(id = "status.sc_req_item.wf_activity")
    public WebElement wfActivitySpan;

    @FindBy(id = "sc_req_item.work_end")
    public WebElement workEnd;
    @FindBy(id = "status.sc_req_item.work_end")
    public WebElement workEndSpan;

    @FindBy(id = "sc_req_item.work_notes")
    public WebElement workNotes;
    @FindBy(id = "status.sc_req_item.work_notes")
    public WebElement workNotesSpan;

    @FindBy(id = "sc_req_item.work_notes_list")
    public WebElement workNotesList;
    @FindBy(id = "status.sc_req_item.work_notes_list")
    public WebElement workNotesListSpan;

    @FindBy(id = "sc_req_item.work_start")
    public WebElement workStart;
    @FindBy(id = "status.sc_req_item.work_start")
    public WebElement workStartSpan;
    
    @FindBy(id = "order_now")
    public WebElement orderNow;
    
    @FindBy(className = "linked")
    public WebElement linkToRITM;
    
    @FindBy(id = "add_to_cart_button")
    public WebElement addToCartButton;
    
    @FindBy(id = "catalog_cart_proceed_checkout")
    public WebElement checkOutButton;
    
    public String sys_id;

    public ScReqItem(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Extracts the sys_id from the landing page after you submit an order
     * NOTE: OOB there are two "linked" items on the page.  The first is "Bookmark Request" and the second
     * is the item you have ordered.  If you are testing an order guide, you will have to be more creative
     * @return The Sys_Id contained in the URL of the "linked" element
     */
    public String extractSysIDFromLink(){
        return driver.findElements(By.className("linked")).get(1).getAttribute("href").replace(getBASE_URL() + "sc_req_item.do?sys_id=", "");
    }
    
    /**
     * For a given list collector, takes selected items from the left list and moves them into the right list
     * @param listName A list collector
     */
    public void handleListCollector(String listName) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).
                    executeScript("moveOptionAndSort(gel('" + listName + 
                            "_select_0'), gel('" + listName + 
                            "_select_1'), '--None--', [], '--None--');");
        }
    }
    
    /**
     * For a given list collector, takes selected items from the right list and moves them into the left list
     * @param listName A list collector
     */
    public void handleListCollectorRemove(String listName) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).
                    executeScript("moveOptionAndSort(gel('" + listName + 
                            "_select_1'), gel('" + listName + 
                            "_select_0'), '--None--', ['home'], '--None--');");
        }
    }

}
