package com.company.servicenowtests;


import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author jbauguess
 */
public class SysEmail extends BaseTest {

    @FindBy(id = "sys_email.blind_copied")
    public WebElement blind_copied;
    @FindBy(id = "status.sys_email.blind_copied")
    public WebElement blind_copiedSpan;

    @FindBy(id = "sys_email.body")
    public WebElement body;
    @FindBy(id = "status.sys_email.body")
    public WebElement bodySpan;

    @FindBy(id = "sys_email.body_text")
    public WebElement body_text;
    @FindBy(id = "status.sys_email.body_text")
    public WebElement body_textSpan;

    @FindBy(id = "sys_email.checkpoint")
    public WebElement checkpoint;
    @FindBy(id = "status.sys_email.checkpoint")
    public WebElement checkpointSpan;

    @FindBy(id = "sys_email.content_type")
    public WebElement content_type;
    @FindBy(id = "status.sys_email.content_type")
    public WebElement content_typeSpan;

    @FindBy(id = "sys_email.copied")
    public WebElement copied;
    @FindBy(id = "status.sys_email.copied")
    public WebElement copiedSpan;

    @FindBy(id = "ni.sys_email.deleted")
    public WebElement deleted;
    @FindBy(id = "status.sys_email.deleted")
    public WebElement deletedSpan;

    @FindBy(id = "sys_email.direct")
    public WebElement direct;
    @FindBy(id = "status.sys_email.direct")
    public WebElement directSpan;

    @FindBy(id = "sys_email.error_string")
    public WebElement error_string;
    @FindBy(id = "status.sys_email.error_string")
    public WebElement error_stringSpan;

    @FindBy(id = "sys_email.headers")
    public WebElement headers;
    @FindBy(id = "status.sys_email.headers")
    public WebElement headersSpan;

    @FindBy(id = "sys_email.importance")
    public WebElement importance;
    @FindBy(id = "status.sys_email.importance")
    public WebElement importanceSpan;

    @FindBy(id = "sys_email.instance")
    public WebElement instance;
    @FindBy(id = "status.sys_email.instance")
    public WebElement instanceSpan;

    @FindBy(id = "sys_display.sys_email.mailbox")
    public WebElement mailbox;
    @FindBy(id = "status.sys_email.mailbox")
    public WebElement mailboxSpan;

    @FindBy(id = "sys_email.message_id")
    public WebElement message_id;
    @FindBy(id = "status.sys_email.message_id")
    public WebElement message_idSpan;

    @FindBy(id = "sys_email.notification_type")
    public WebElement notification_type;
    @FindBy(id = "status.sys_email.notification_type")
    public WebElement notification_typeSpan;

    @FindBy(id = "sys_email.receive_type")
    public WebElement receive_type;
    @FindBy(id = "status.sys_email.receive_type")
    public WebElement receive_typeSpan;

    @FindBy(id = "sys_email.recipients")
    public WebElement recipients;
    @FindBy(id = "status.sys_email.recipients")
    public WebElement recipientsSpan;

    @FindBy(id = "sys_email.reply_to")
    public WebElement reply_to;
    @FindBy(id = "status.sys_email.reply_to")
    public WebElement reply_toSpan;

    @FindBy(id = "sys_email.state")
    public WebElement state;
    @FindBy(id = "status.sys_email.state")
    public WebElement stateSpan;

    @FindBy(id = "sys_email.status")
    public WebElement status;
    @FindBy(id = "status.sys_email.status")
    public WebElement statusSpan;

    @FindBy(id = "sys_email.subject")
    public WebElement subject;
    @FindBy(id = "status.sys_email.subject")
    public WebElement subjectSpan;

    @FindBy(id = "sys_email.sys_created_by")
    public WebElement sys_created_by;
    @FindBy(id = "status.sys_email.sys_created_by")
    public WebElement sys_created_bySpan;

    @FindBy(id = "sys_email.sys_created_on")
    public WebElement sys_created_on;
    @FindBy(id = "status.sys_email.sys_created_on")
    public WebElement sys_created_onSpan;

    @FindBy(id = "sys_email.sys_mod_count")
    public WebElement sys_mod_count;
    @FindBy(id = "status.sys_email.sys_mod_count")
    public WebElement sys_mod_countSpan;

    @FindBy(id = "sys_email.sys_updated_by")
    public WebElement sys_updated_by;
    @FindBy(id = "status.sys_email.sys_updated_by")
    public WebElement sys_updated_bySpan;

    @FindBy(id = "sys_email.sys_updated_on")
    public WebElement sys_updated_on;
    @FindBy(id = "status.sys_email.sys_updated_on")
    public WebElement sys_updated_onSpan;

    @FindBy(id = "sys_email.target_table")
    public WebElement target_table;
    @FindBy(id = "status.sys_email.target_table")
    public WebElement target_tableSpan;

    @FindBy(id = "sys_email.type")
    public WebElement type;
    @FindBy(id = "status.sys_email.type")
    public WebElement typeSpan;

    @FindBy(id = "sys_email.uid")
    public WebElement uid;
    @FindBy(id = "status.sys_email.uid")
    public WebElement uidSpan;

    @FindBy(id = "sys_email.user")
    public WebElement user;
    @FindBy(id = "status.sys_email.user")
    public WebElement userSpan;

    @FindBy(id = "sys_display.sys_email.user_id")
    public WebElement user_id;
    @FindBy(id = "status.sys_email.user_id")
    public WebElement user_idSpan;

    @FindBy(id = "sys_email.weight")
    public WebElement weight;
    @FindBy(id = "status.sys_email.weight")
    public WebElement weightSpan;
    
    public String getSendMailURL = "sys.scripts.do?action=run_module&sys_id=b34eb34f0a0a0b2400567289254742c9";

    public SysEmail(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Runs the "Get/Send email action"
     */
    public void getSendEmail() {
        driver.get(getBASE_URL() + getSendMailURL);
    }
    
    /**
     * Navigates to a list of sent emails for a record
     * @param recordSysId 
     */
    public void navigateToSentItemsForRecord(String recordSysId) {
        driver.get(getBASE_URL() + "sys_email_list.do?sysparm_query=mailbox=sent^instance=" + recordSysId);        
    }    
    
    /**
     * Gets the event information from the form
     * @return A list of elements that have links, which are usually the event registry entry and the notification record
     */
    public List<WebElement> getEventInformation() {
        return driver.findElements(By.className("list_embedded")).get(0).findElements(By.className("linked"));
    }
    
    /**
     * Validates that an event happened and the appropriate notification was associated with it
     * @param event An event that is expected
     * @param notification A notification record that is expected
     */
    public void validateEventInformation(String event, String notification) {
        List<WebElement> eventInfo = getEventInformation();
        validateEvent(event, eventInfo.get(0));
        validateNotificationName(notification, eventInfo.get(1));
    }
    
    /**
     * Ensures that an event name is equal to what is on the form
     * @param expected The event name expected
     * @param link The element containing a link to the event that actually happened
     */
    public void validateEvent(String expected, WebElement link) {
        assertTrue("The link contains the valid event name", expected.equals(link.getText()));
    }
    
    /**
     * Ensures that a notification name is equal to what is on the form
     * @param expected The notification record name we expect
     * @param link The element containing a link to the notification record
     */
    public void validateNotificationName(String expected, WebElement link) {
        assertTrue("The link contains the valid notification name", expected.equals(link.getText()));
    }
    
    /**
     * Checks the subject to ensure it contains text we expect
     * @param expected Expected text in the subject of an email
     */
    public void validateSubjectIsCorrect(String expected) {
        assertTrue("The subject " + subject.getText() + " contains " + expected, subject.getText().contains(expected));
    }
    
    /**
     * Checks the recipients list for expected recipient email addresses
     * @param expected A list of email addresses that should have received an email
     */
    public void validateRecipients(List<String> expected) {
        List<String> received = Arrays.asList(recipients.getText().split(","));
        assertTrue("Received list " + received.toString() + " contains the expected " + expected.toString(), received.containsAll(expected));
    }
}
