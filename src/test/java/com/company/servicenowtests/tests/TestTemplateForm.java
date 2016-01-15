package com.company.servicenowtests.tests;

import com.company.servicenowtests.BaseServiceNowTestSauce;
import com.company.servicenowtests.TemplateForm;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author 162107
 */
public class TestTemplateForm extends BaseServiceNowTestSauce {
    
    public TemplateForm templateForm;

    public TestTemplateForm(String os, String version, String browser) {
        super(os, version, browser);
    }
    
    @Override
    public void pageSpecificSetup() {
        templateForm = PageFactory.initElements(driver, TemplateForm.class);
        templateForm.login(1);
    }
    
    @Test
    public void createAChangeTemplate() {
        templateForm.createATemplateRecord("change_request");
        templateForm.updateATaskTemplate();
    }
}
