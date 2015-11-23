package com.company.servicenowtests.tasks.testcases;

import com.company.servicenowtests.BaseServiceNowTestSauce;
import com.company.servicenowtests.tasks.Incident;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Uses Saucelabs to test Incident Management
 * 
 * @author Juustin Bauguess
 */
public class TestIncidentNormalFlow extends BaseServiceNowTestSauce implements SauceOnDemandSessionIdProvider  {
   
    public TestIncidentNormalFlow(String os, String version, String browser) {
        super(os, version, browser);
    }

    @Override
    public void pageSpecificSetup() {
        incident = PageFactory.initElements(driver, Incident.class);        
        incident.login(0);
    }
    
    @Test
    public void testIncidentFlow(){
        createIncident();
        resolveIncident();
    }    
    
    /**
     * Creates a new incident
     */
    public void createIncident(){
        driver.get(incident.getBASE_URL() + "incident.do");
        incidentCreationAssertions();
        incident.assignmentGroup.sendKeys("Service Desk");
        incident.callerId.sendKeys("ITIL User");
        incident.useSelectElement(incident.contactType, "Walk-in");
        incident.workNotes.click();
        incident.shortDescription.sendKeys("Testing Incident with Selenium");
        incident.insertAndStayButton.click();        
    }
    
    /**
     * Resolves the current incident
     */
    public void resolveIncident(){
        driver.get(incident.getCurrentIncident());
        incident.useSelectElement(incident.state, "Resolved");
        incidentResolveAssertions();
        incident.useSelectElement(incident.closeCode, "Solved (Permanently)");      
        incident.closeNotes.sendKeys("Resolved this incident.");
        incident.updateButton.click();
    }
        
    /**
     * Checks the fields of an incident form during creation
     */
    public void incidentCreationAssertions(){
        //Replace statements like what is below with something useful for your company
        //assertTrue("Assignment group is mandatory", incident.isMandatory(incident.assignmentGroupSpan));
        //assertTrue("Number is read only", incident.isReadOnly(incident.numberSpan));
    }    
       
    /**
     * Checks the fields of an incident during resolution
     */
    public void incidentResolveAssertions(){
        assertTrue("Close Code is mandatory", incident.isMandatory(incident.closeCodeSpan));
        assertTrue("Close Notes are mandatory", incident.isMandatory(incident.closeNotesSpan));
    }
}
