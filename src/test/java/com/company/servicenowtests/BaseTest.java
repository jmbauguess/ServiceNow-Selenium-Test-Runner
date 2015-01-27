package com.company.servicenowtests;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

/**
 * Contains the basic functions needed for testing (saving, logging in, etc.)
 *
 * @author Justin Bauguess
 */
public class BaseTest {

    protected WebDriver driver;

    @FindBy(id = "user_name")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(id = "sysverb_login")
    public WebElement loginButton;

    @FindBy(id = "sysverb_insert")
    public WebElement insertButton;

    @FindBy(id = "sysverb_insert_and_stay")
    public WebElement insertAndStayButton;

    @FindBy(id = "sysverb_update")
    public WebElement updateButton;

    @FindBy(id = "sysverb_update_and_stay")
    public WebElement updateAndStayButton;

    private boolean acceptNextAlert = true;

    private final String BASE_URL = "https://" + System.getProperty("environment") + ".service-now.com/";
    private final String ITIL_NAME = "Itil";
    private final String ADMIN_NAME = "Admin";
    private final String ESS_NAME = "Ess";
    private final String CONTRACTOR_NAME = "9.Selenium.Contractor";
    public final int ITIL = 0;
    public final int ADMIN = 1;
    public final int ESS = 2;
    public final int CONTRACTOR = 3;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Makes the page wait using the Sleeper class
     * @param duration The number of seconds to wait
     */
    public void makeThePageWait(int duration) {
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(new Duration(duration, TimeUnit.SECONDS));
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
    
    /**
     * @return returns the base URL of the ServiceNow instance
     */
    public String getBASE_URL() {
        return BASE_URL;
    }

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Returns a Select Element, based on a WebElement
     *
     * @param pageElement The element on the page which is a select box
     * @return A select box
     */
    public Select getSelectElement(WebElement pageElement) {
        return new Select(pageElement);
    }

    /**
     * Interacts with a Select box on the page
     *
     * @param pageElement The element on the page which is a select box
     * @param value The value to set the Select Box to
     */
    public void useSelectElement(WebElement pageElement, String value) {
        List<WebElement> options = getSelectElement(pageElement).getOptions();
        for (WebElement item : options) {
            if (item.getText().equalsIgnoreCase(value)) {
                item.click();
            }
        }
    }

    /**
     * Logs into ServiceNow using the Login page, avoiding single sign on
     *
     * @param as An integer value representing a role
     */
    public void login(int as) {
        driver.get(BASE_URL + "login.do");
        switch (as) {
            case ITIL:
                loginAsITIL();
                break;
            case ADMIN:
                loginAsAdmin();
                break;
            case ESS:
                loginAsESS();
                break;
            case CONTRACTOR:
                loginAsContractor();
                break;
            default:
                loginAsITIL();
                break;
        }
        password.sendKeys(System.getProperty("password"));
        loginButton.click();
    }

    /**
     * Logs in as an ITIL user (Selenium Itil)
     */
    private void loginAsITIL() {
        username.sendKeys(ITIL_NAME);
    }

    /**
     * Logs in as a system admin (Selenium Admin)
     */
    private void loginAsAdmin() {
        username.sendKeys(ADMIN_NAME);
    }

    /**
     * Logs into the system as a roleless user (Selenium User)
     */
    private void loginAsESS() {
        username.sendKeys(ESS_NAME);
    }

    /**
     * Logs into the system as a roleless contractor (Selenium Contractor)
     */
    private void loginAsContractor() {
        username.sendKeys(CONTRACTOR_NAME);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * Determines if a field is mandatory by checking the span next to the label
     *
     * @param element The label span next to the element
     * @return True if the element is mandatory
     */
    public boolean isMandatory(WebElement element) {
        return element.getAttribute("mandatory").contains("true");
    }

    /**
     * Determines if a field is mandatory on Service Catalog forms
     *
     * @param element The label span next to the element
     * @return True if the element is mandatory
     */
    public boolean ritmMandatory(WebElement element) {
        return element.getAttribute("class").contains("mandatory");
    }

    /**
     * Determines if a value on the form has changed (ie: turned green)
     *
     * @param element The label span next to the element
     * @return True if the element has changed
     */
    public boolean valueChange(WebElement element) {
        return element.getAttribute("class").contains("changed");
    }

    /**
     * Determines if a field is read only on the form
     *
     * @param element The label span next to the element
     * @return True if the element is read only
     */
    public boolean isReadOnly(WebElement element) {
        return element.getAttribute("class").contains("read_only");
    }

    /**
     * Returns a date and time, formated in the ServiceNow system default
     * setting
     *
     * @return A date and time formatted in the ServiceNow system default
     * setting
     */
    public String dateFetcher() {
        ZonedDateTime zoneNow = ZonedDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        return format.format(zoneNow);
    }

    /**
     * Returns a date, formated in the ServiceNow system default setting
     *
     * @return A date formatted in the ServiceNow system default setting
     */
    public String dateFetcherNoTime() {
        ZonedDateTime zoneNow = ZonedDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return format.format(zoneNow);
    }

    /**
     * Returns a future date, formated in the ServiceNow system default setting
     *
     * @param days An integer that says how many days in the future
     * @return A future date formatted in the ServiceNow system default setting
     */
    public String dateFetcherFuture(int days) {
        ZonedDateTime zoneNow = ZonedDateTime.now().plusDays(days);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return format.format(zoneNow);
    }

    /**
     * Determines if an alert box is present on the screen
     *
     * @return True if an alert is present
     */
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    /**
     * Closes an alert, returning any text in the box
     *
     * @return Any text in the alert box
     */
    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    /**
     * Akin to pressing the "OK" button on an alert/popup
     */
    public void acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {

        }
    }

    /**
     * Akin to pressing the "Cancel" button on an alert/popup
     */
    public void dismissAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {

        }
    }
}
