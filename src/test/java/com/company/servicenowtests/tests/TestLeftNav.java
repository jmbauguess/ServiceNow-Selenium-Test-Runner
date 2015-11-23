package com.company.servicenowtests.tests;

import com.company.servicenowtests.BaseServiceNowTestSauce;
import com.company.servicenowtests.LeftNavFilter;
import com.company.servicenowtests.ServiceNowLeftNav;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Justin Bauguess
 */
public class TestLeftNav extends BaseServiceNowTestSauce {
    
    ServiceNowLeftNav leftNav;

    public TestLeftNav(String os, String version, String browser) {
        super(os, version, browser);
    }
    
    @Override
    public void pageSpecificSetup() {
        PageFactory.initElements(driver, ServiceNowLeftNav.class);
        leftNav.login(0);
    }
    
    @Test
    public void testIncidentNavigation() {
        List<LeftNavFilter> elementFilters = leftNav.getIncidentFilters();
        for (LeftNavFilter current : elementFilters) {
            leftNav.navigateToElementAndCheckitsBreadcrumb(current.getModule(), current.getPageName(), current.getExpectedFilter());
        }
    }
    
}
