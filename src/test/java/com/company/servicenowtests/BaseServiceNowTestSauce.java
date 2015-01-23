package com.company.servicenowtests;

import com.company.servicenowtests.tasks.Incident;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.junit.Parallelized;
import com.saucelabs.junit.SauceOnDemandTestWatcher;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Provides basic testing functionality for use with SauceLabs
 * 
 * @author Justin Bauguess
 */
@RunWith(Parallelized.class)
@Ignore
public class BaseServiceNowTestSauce implements SauceOnDemandSessionIdProvider {

    public WebDriver driver;
    public WebDriverWait wait;
    public @Rule
    TestName testName = new TestName();
    public String browser;
    public String os;
    public String version;
    public String sessionId;
    static public SauceOnDemandAuthentication authentication;
    public @Rule
    SauceOnDemandTestWatcher resultReportingTestWatcher = new SauceOnDemandTestWatcher(this, authentication);
    static Properties baseProps = new Properties();
    public BaseTest baseTest;
    public Incident incident;

    public BaseServiceNowTestSauce(String os, String version, String browser) {
        super();
        this.os = os;
        this.version = version;
        this.browser = browser;
    }

    @BeforeClass
    public static void oneTimeSetUp() {
        try {
            InputStream inputStream
                    = BaseServiceNowTestSauce.class.getClassLoader().getResourceAsStream("test_properties.properties");
            baseProps.load(inputStream);
            authentication = new SauceOnDemandAuthentication(baseProps.getProperty("sauce_user"), baseProps.getProperty("sauce_key"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, browser);
        capabilities.setCapability(CapabilityType.VERSION, version);
        capabilities.setCapability(CapabilityType.PLATFORM, os);
        capabilities.setCapability("name", testName.getMethodName());
        this.driver = new RemoteWebDriver(
                new URL("http://" + authentication.getUsername() + ":" + authentication.getAccessKey()
                        + "@ondemand.saucelabs.com:80/wd/hub"), capabilities);      
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);        
        baseTest = PageFactory.initElements(driver, BaseTest.class);                
    }

    @Parameterized.Parameters
    public static LinkedList browsersStrings() throws Exception {
        LinkedList browsers = new LinkedList();
        //browsers.add(new String[]{Platform.WIN8.toString(), "30", "firefox"});
        browsers.add(new String[]{Platform.WIN8.toString(), "37", "chrome"});
        //browsers.add(new String[]{Platform.WIN8.toString(), "10", "internet explorer"});
        return browsers;
    }

    @After
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception e){        
        }
    }

    @Override
    public String getSessionId() {
        return sessionId;
    }
}
