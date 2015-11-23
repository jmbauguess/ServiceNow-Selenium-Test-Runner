package com.company.servicenowtests;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Justin Bauguess
 */
public class ServiceNowLeftNav extends BaseTest {

    public ServiceNowLeftNav(WebDriver driver) {
        super(driver);
    }
        
    /**
     * Expands all applications in the left nav
     */
    public void expandAll() {
        switchToNavFrame();
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("ServiceNow Selenium Tests - The Left Nav");
        }
    }
    
    /**
     * Collapses all Applications in the left nav
     */
    public void collapseAll() {     
        switchToNavFrame();
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("$j(window).trigger(\"collapse_all\")");
        }
    }
    
    /**
     * Switches to the left nav frame of ServiceNow
     */
    public void switchToNavFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("gsft_nav");
    }
    
    /**
     * Switches to the main frame of ServiceNow
     */
    public void switchToMainFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("gsft_main");
    }
    
    /**
     * Switches frames to the left nav, clicks on a given element, then switches back to the main frame
     * @param element A link element to click on
     */
    public void navigateToElement(WebElement element) {
        switchToNavFrame();
        expandAll();
        element.click();
        switchToMainFrame();
    }
    
    /**
     * Finds the breadcrumb on the page and compares its filter text to see if it contains an expected value
     * @param page The name of the page (formal table name)
     * @param text The filter text expected
     * @return True if the filter text is present in the page's filter
     */
    public boolean checkForBreadcrumbText(String page, String text) {
        String filterText = driver.findElement(By.id(page + "_breadcrumb")).getText();
        return filterText.contains(text);
    }
    
    /**
     * Navigates to a page using the left nav, then compares the filter text to an expected value
     * @param element A link element to click on
     * @param page The name of the page (formal table name)
     * @param text The filter text expected
     */
    public void navigateToElementAndCheckitsBreadcrumb(WebElement element, String page, String text) {
        navigateToElement(element);
        assertTrue("The filter was correct", checkForBreadcrumbText(page, text));
    }    
    
    /**
     * Gets a list of LeftNavFilters to check for Incident
     * @return LeftNavFilters for incident
     */
    public List<LeftNavFilter> getIncidentFilters() {
        List<LeftNavFilter> incidentFilter = new ArrayList();
        incidentFilter.add(new LeftNavFilter(IncidentOpen, "incident", "active=true"));
        incidentFilter.add(new LeftNavFilter(IncidentClosed, "incident", "active=false"));
        return incidentFilter;
    }

    @FindBy(id = "app_bb42119aa9fea578002daa46510962d5")
    public WebElement IncidentOpen;
    
    @FindBy(id = "app_bb42119aa9fea578002daa46510962d7")
    public WebElement IncidentClosed;

    @FindBy(id = "f2df1571c0a801660174a14483e412c2")
    public WebElement SocialITChat;

    @FindBy(id = "f220395b4408110011489d934f72d3ae")
    public WebElement SocialITSupportDeskHelp;

    @FindBy(id = "bb465f23a9fea57800e006d6e26d7544")
    public WebElement SocialITLiveFeed;

    @FindBy(id = "960d909e0a6d475100549e0d420a1fe3")
    public WebElement SocialITChatAdministration;

    @FindBy(id = "8679136a0a0007dc002b1fef701266a9")
    public WebElement SocialITFeedAdministration;  

}
