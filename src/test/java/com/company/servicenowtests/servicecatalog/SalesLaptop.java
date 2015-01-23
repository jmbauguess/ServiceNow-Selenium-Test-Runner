package com.company.servicenowtests.servicecatalog;

import com.company.servicenowtests.tasks.ScReqItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Contains variables found on the Sales Laptop Catalog Item
 * 
 * @author Justin Bauguess
 */
public class SalesLaptop extends ScReqItem {
    
@FindBy(id="IO:3cfda5080a0a0a6a0033827cfef2f691")
public WebElement optionalLabel;
@FindBy(id="status.IO:3cfda5080a0a0a6a0033827cfef2f691")
public WebElement optionalLabelSpan;

@FindBy(id="ni.IO:3cfe1f290a0a0a6a01ee1623f4982abd")
public WebElement powerpoint;
@FindBy(id="status.IO:3cfe1f290a0a0a6a01ee1623f4982abd")
public WebElement powerpointSpan;

@FindBy(id="ni.IO:3cfe5b190a0a0a6a0022478237b2ef53")
public WebElement acrobat;
@FindBy(id="status.IO:3cfe5b190a0a0a6a0022478237b2ef53")
public WebElement acrobatSpan;

@FindBy(id="ni.IO:3cfe98700a0a0a6a00773dc2907bde89")
public WebElement photoshop;
@FindBy(id="status.IO:3cfe98700a0a0a6a00773dc2907bde89")
public WebElement photoshopSpan;

@FindBy(id="ni.IO:3cffe5240a0a0a6a01e72991342fde1c")
public WebElement siebel;
@FindBy(id="status.IO:3cffe5240a0a0a6a01e72991342fde1c")
public WebElement siebelSpan;

    public SalesLaptop(WebDriver driver) {
        super(driver);
    }

}


