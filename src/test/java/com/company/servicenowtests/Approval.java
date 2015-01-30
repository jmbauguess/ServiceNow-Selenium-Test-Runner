package com.company.servicenowtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author 162107
 */
public class Approval extends BaseTest {

    public Approval(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id = "sys_display.sysapproval_approver.approver")
    public WebElement approver;
    
    @FindBy(id = "sysapproval_approver.state")
    public WebElement state;
    
    @FindBy(id = "sysapproval_approver.document_id")
    public WebElement approving;
    
    @FindBy(id = "sysapproval_approver.comments")
    public WebElement comments;    
    
    @FindBy(id = "sysverb_update")
    public WebElement update;
    
    @FindBy(id = "sysverb_update_and_stay")
    public WebElement save;
    
    /**
     * Changes the approval on a task
     * @param sys_id The Sys_id of the task to approve or reject
     * @param approval True if the record is to be approved;  False for rejection
     */
    public void approveTask(String sys_id, boolean approval){
        driver.get(getBASE_URL() + "sysapproval_approver.do?sysparm_query=sysapproval=" + sys_id + "^state=requested");
        if (approval == true){
            useSelectElement(state, "Approved");      
        } else {
            useSelectElement(state, "Rejected");
            comments.sendKeys("Because it's not a good idea.");
        }
        update.click();
    }
    
    /**
     * Changes the approval on a task to rework
     * @param sys_id The sys_id of the task to rework
     */
    public void reworkTask(String sys_id){
        login(ADMIN);
        driver.get(getBASE_URL() + "sysapproval_approver.do?sysparm_query=sysapproval=" + sys_id + "^state=requested");
        useSelectElement(state, "Rework");
        update.click();
        login(ITIL);
    }
    
    /**
     * Since many times, an approval is done multiple times, use this function to reduce the number of logins
     * @param count How many approvals to perform
     * @param sys_id The sys_id of the record we're approving for
     */
    public void approveTasks(int count, String sys_id){
        login(ADMIN);
        for (int i = 0; i < count; i++){
            approveTask(sys_id, true);
        }
        login(ITIL);
    }
    
    /**
     * Rejects an approval record
     * @param sys_id The record to reject
     */
    public void rejectTasks(String sys_id){
        login(ADMIN);
        approveTask(sys_id, false);
        login(ITIL);
    }
    
}
