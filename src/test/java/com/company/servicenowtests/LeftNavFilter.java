package com.company.servicenowtests;

import org.openqa.selenium.WebElement;

/**
 *
 * @author Justin Bauguess
 */
public class LeftNavFilter {
    
    private WebElement module;
    private String pageName;
    private String expectedFilter;
    
    public LeftNavFilter(WebElement module, String pageName, String expectedFilter) {
        this.module = module;
        this.pageName = pageName;
        this.expectedFilter = expectedFilter;
    }

    public WebElement getModule() {
        return module;
    }

    public void setModule(WebElement module) {
        this.module = module;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getExpectedFilter() {
        return expectedFilter;
    }

    public void setExpectedFilter(String expectedFilter) {
        this.expectedFilter = expectedFilter;
    }
    
}
