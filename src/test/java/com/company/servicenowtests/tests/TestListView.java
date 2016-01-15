package com.company.servicenowtests.tests;

import com.company.servicenowtests.BaseServiceNowTestSauce;
import com.company.servicenowtests.ListView;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author jbauguess
 */
public class TestListView extends BaseServiceNowTestSauce {
    
    public ListView listView;

    public TestListView(String os, String version, String browser) {
        super(os, version, browser);
    }
    
    @Override
    public void pageSpecificSetup() {
        listView = PageFactory.initElements(driver, ListView.class);
        listView.login(1);
    }
    
    @Test
    public void testChangeManagementListView() {
        driver.get(listView.getBASE_URL() + "change_request_list.do");
        if (listView.isListViewCustomized()) {
            listView.uncustomizeListView();
        }
        List<String> expectedValues = Arrays.asList("Number","Short description","Type","State","Planned start date","Planned end date","Assigned to");
        listView.compareHeadingsToExpectedValues(expectedValues);
    }
    
    @Test
    public void testIncidentListView() {
        driver.get(listView.getBASE_URL() + "incident_list.do");
        if (listView.isListViewCustomized()) {
            listView.uncustomizeListView();
        }
        List<String> expectedValues = Arrays.asList("Number", "Caller", "Short description", "Category", "Priority", "State", "Assignment group", "Assigned to");
        listView.compareHeadingsToExpectedValues(expectedValues);
    }
    
    @Test
    public void testProblemListView() {
        driver.get(listView.getBASE_URL() + "problem_list.do");
        if (listView.isListViewCustomized()) {
            listView.uncustomizeListView();
        }
        List<String> expectedValues = Arrays.asList("Number", "Short description", "State", "Assignment group", "Assigned to", "Configuration item", "Related Incidents");
        listView.compareHeadingsToExpectedValues(expectedValues);
    }
}
