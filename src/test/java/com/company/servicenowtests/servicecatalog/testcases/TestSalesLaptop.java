package com.company.servicenowtests.servicecatalog.testcases;

import com.company.servicenowtests.BaseServiceNowTestSauce;
import static com.company.servicenowtests.BaseServiceNowTestSauce.authentication;
import com.company.servicenowtests.servicecatalog.SalesLaptop;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Tests the Sales Laptop service catalog item
 * 
 * @author Justin Bauguess
 */
public class TestSalesLaptop extends BaseServiceNowTestSauce {

    private SalesLaptop ritm;
    private String url = "com.glideapp.servicecatalog_cat_item_view.do?sysparm_id=e212a942c0a80165008313c59764eea1";
    
    public TestSalesLaptop(String os, String version, String browser) {
        super(os, version, browser);
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
        ritm = PageFactory.initElements(driver, SalesLaptop.class);
        ritm.login(0);
    }
    
    @Test
    public void testCreationOfOrder(){
        driver.get(ritm.getBASE_URL() + url);
        ritm.acrobat.click();
        ritm.orderNow.click();
        ritm.sys_id = ritm.extractSysIDFromLink();
        driver.get(ritm.getBASE_URL() + "sc_req_item.do?sys_id=" + ritm.sys_id);
    }
    
}
