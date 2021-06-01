package com.jeferson.appobjects;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeApp {

    private final WebDriver driver;
    private final Wait wait;

    public HomeApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement fechaPopup() {
        wait.waitElementToBeClickable(By.cssSelector("#at-cv-lightbox-header #at-cv-lightbox-close"));
        return driver.findElement(By.cssSelector("#at-cv-lightbox-header #at-cv-lightbox-close"));
    }
    public WebElement abaInputFormsButton() {
        return driver.findElement(By.linkText("Input Forms"));
    }
    public WebElement menuSimpleFormDemoButton() {
        return driver.findElement(By.linkText("Simple Form Demo"));
    }
    public WebElement menuCheckboxDemoButton() {
        return driver.findElement(By.linkText("Checkbox Demo"));
    }
    public WebElement menuRadioButtonsDemoButton() {
        return driver.findElement(By.linkText("Radio Buttons Demo"));
    }
    public WebElement menuSelectDropdownListButton() {
        return driver.findElement(By.linkText("Select Dropdown List"));
    }
    public WebElement menuInputFormSubmitButton() {
        return driver.findElement(By.linkText("Input Form Submit"));
    }
    public WebElement menuAjaxFormSubmitButton() {
        return driver.findElement(By.linkText("Ajax Form Submit"));
    }
    public WebElement menuJQuerySelectDropdownButton() {
        return driver.findElement(By.linkText("JQuery Select dropdown"));
    }

    public WebElement abaDatePickersButton() {
        return driver.findElement(By.linkText("Date pickers"));
    }
    public WebElement menuBootstrapDatePickerButton() {
        return driver.findElement(By.linkText("Bootstrap Date Picker"));
    }
    public WebElement menuJQueryDatePickerButton() {
        return driver.findElement(By.linkText("JQuery Date Picker"));
    }
    public WebElement abaTableButton() {
        return driver.findElement(By.linkText("Table"));
    }
    public WebElement menuTablePaginationButton() {
        return driver.findElement(By.linkText("Table Pagination"));
    }
    public WebElement menuTableDataSearchButton() {
        return driver.findElement(By.linkText("Table Data Search"));
    }
    public WebElement menuTableFilterButton() {
        return driver.findElement(By.linkText("Table Filter"));
    }
    public WebElement menuTableSortSearchButton() {
        return driver.findElement(By.linkText("Table Sort & Search"));
    }
    public WebElement menuTableDataDownloadButton() {
        return driver.findElement(By.linkText("Table Data Download"));
    }
    public WebElement abaProgressBarsButton() { return  driver.findElement(By.linkText("Progress Bars")); }
    public WebElement menuJQueryDownloadProgressBarsButton() { return  driver.findElement(By.linkText("JQuery Download Progress bars")); }
    public WebElement menuBootstrapProgressBarButton() { return  driver.findElement(By.linkText("Bootstrap Progress bar")); }
    public WebElement menuDragDropSlidersButton() { return  driver.findElement(By.linkText("Drag & Drop Sliders")); }
    public WebElement abaAlertsModalsButton() { return  driver.findElement(By.linkText("Alerts & Modals")); }
    public WebElement menuBootstrapAlertsButton() { return  driver.findElement(By.linkText("Bootstrap Alerts")); }
    public WebElement menuBootstrapModalsButton() { return  driver.findElement(By.linkText("Bootstrap Modals")); }
    public WebElement menuWindowPopupModalButton() { return  driver.findElement(By.linkText("Window Popup Modal")); }
    public WebElement menuProgressBarModalButton() { return  driver.findElement(By.linkText("Progress Bar Modal")); }
    public WebElement menuJavascriptAlertsButton() { return  driver.findElement(By.linkText("Javascript Alerts")); }
    public WebElement menuFileDownloadButton() { return  driver.findElement(By.linkText("File Download")); }
    public WebElement abaListBoxButton() { return  driver.findElement(By.linkText("List Box")); }
    public WebElement menuBootstrapListBoxButton() { return  driver.findElement(By.linkText("Bootstrap List Box")); }
    public WebElement menuJQueryListBoxButton() { return  driver.findElement(By.linkText("JQuery List Box")); }
    public WebElement menuDataListFilterButton() { return  driver.findElement(By.linkText("Data List Filter")); }
    public WebElement abaOthersButton() { return  driver.findElement(By.linkText("Others")); }
    public WebElement menuDragAndDropButton() { return  driver.findElement(By.linkText("Drag and Drop")); }
    public WebElement menuDynamicDataLoadingButton() { return  driver.findElement(By.linkText("Dynamic Data Loading")); }
    public WebElement menuChartsDemoButton() { return  driver.findElement(By.linkText("Charts Demo")); }
}
