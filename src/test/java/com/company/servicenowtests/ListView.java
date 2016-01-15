package com.company.servicenowtests;

/**
 *
 * @author jbauguess
 */
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author 162107
 */
public class ListView extends BaseTest {

    public ListView(WebDriver driver) {
        super(driver);
    }
    
    public List<WebElement> headerCells;
    
    /**
     * Gets all TH tags on the page
     * @return A collection of all TH tags on the page
     */
    private List<WebElement> getHeaderCells() {
        return driver.findElements(By.tagName("th"));
    }
    
    /**
     * Gets all displayed header cells
     * @return A collection of all displayed header cell elemenets
     */
    private List<WebElement> getDisplayedHeaderCells() {
        List<WebElement> cells = getHeaderCells(),
                returnList = new ArrayList<>();
        for (WebElement cell : cells) {
            if (cell.isDisplayed()) {
                returnList.add(cell);
            }
        }
        return returnList;
    }
    
    /**
     * Gets all column header cells that start with the appropriate text
     * @return A collection of all column headings
     */
    private List<WebElement> getColumnHeadings() {
        List<WebElement> displayedCells = getDisplayedHeaderCells(),
                returnList = new ArrayList<>();
        for (WebElement cell : displayedCells) {
            if (cell.getText().startsWith("Column control menu")) {
                returnList.add(cell);
            }
        }
        return returnList;
    }
    
    /**
     * Eliminates the unnecessary text captured in the TH elements of the column headers
     * @return A list of all column headers on the list view IE: [Number, Active, Short Description]
     */
    public List<String> getColumnHeadingList() {
        List<String> returnList = new ArrayList<>();
        List<WebElement> columnHeadings = getColumnHeadings();
        for (WebElement cell : columnHeadings) {
            String cellText = cell.getText().replaceAll("Column control menu\n", "");
            cellText = cellText.replaceAll("\nSort", "").trim();
            returnList.add(cellText);
        }
        return returnList;
    }
    
    /**
     * Validates that the columns on screen match what we expect
     * @param values A list of expected column values
     */
    public void compareHeadingsToExpectedValues(List<String> values) {
        List<String> columns = getColumnHeadingList();
        assertTrue("The expected values " + values.toString() + " match the actual values " + columns.toString(), columns.equals(values));
    }
    
    /**
     * Determines if the list view has been customized by the user
     * @return True if the list view has changed, false otherwise
     */
    public boolean isListViewCustomized() {
        WebElement icon = driver.findElements(By.tagName("i")).get(0);
        if (icon.getAttribute("class").contains("icon-cog-changes")) {
            return true;
        }
        return false;
    }
    
    /**
     * Resets the list view to the default
     */
    public void uncustomizeListView() {
        WebElement icon = driver.findElements(By.tagName("i")).get(0);
        icon.click();
        driver.findElement(By.id("reset_column_defaults")).click();
    }
    
}

