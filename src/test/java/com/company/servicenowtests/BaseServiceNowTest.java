package com.company.servicenowtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Provides basic functionality for tests that don't use Sauce Labs
 * 
 * Need to override the setup method
 * 
 * @author Justin Bauguess
 */
@Ignore
public class BaseServiceNowTest {
    
    public WebDriver driver;
    public WebDriverWait wait;
    
    @Before
    public void setUp(){
        driver = new FirefoxDriver();        
    }
    
    @After
    public void tearDown(){
        driver.quit();
    }
    
}
