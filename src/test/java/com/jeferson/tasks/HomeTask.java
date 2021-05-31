package com.jeferson.tasks;

import com.jeferson.appobjects.HomeApp;
import org.openqa.selenium.WebDriver;

public class HomeTask {

    private final WebDriver driver;
    private final HomeApp homeApp;

    public HomeTask(WebDriver driver){
        this.driver = driver;
        homeApp = new HomeApp(driver);
    }

    public void fecharPopup() {
        homeApp.fechaPopup().click();
    }
    public void entrarSimpleFormDemo(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuSimpleFormDemoButton().click();
    }
    public void entrarCheckboxDemo(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuCheckboxDemoButton().click();
    }
    public void entrarRadioButtonsDemo(){
        if (homeApp.fechaPopup().isDisplayed()){
            homeApp.fechaPopup().click();
            System.out.println("fechou popup");
        }
        homeApp.abaInputFormsButton().click();
        homeApp.menuRadioButtonsDemoButton().click();
    }
    public void entrarSelectDropdownList(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuSelectDropdownListButton().click();
    }
    public void entrarInputFormSubmit(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuInputFormSubmitButton().click();
    }
    public void entrarAjaxFormSubmit(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuAjaxFormSubmitButton().click();
    }
    public void entrarJQuerySelectDropdown(){
        if (homeApp.fechaPopup().isDisplayed()){
            homeApp.fechaPopup().click();
            System.out.println("fechou popup");
        }
        homeApp.abaInputFormsButton().click();
        homeApp.menuJQuerySelectDropdownButton().click();
    }
    public void entrarBootstrapDatePicker() {
        homeApp.abaDatePickersButton().click();
        homeApp.menuBootstrapDatePickerButton().click();
    }
    public void entrarJQueryDatePicker() {
        homeApp.abaDatePickersButton().click();
        homeApp.menuJQueryDatePickerButton().click();
    }
    public void entrarTablePagination() {
        homeApp.abaTableButton().click();
        homeApp.menuTablePaginationButton().click();
    }
    public void entrarTableDataSearch() {
        homeApp.abaTableButton().click();
        homeApp.menuTableDataSearchButton().click();
    }
    public void entrarTableFilter() {
        homeApp.abaTableButton().click();
        homeApp.menuTableFilterButton().click();
    }
    public void entrarTableSortSearch() {
        homeApp.abaTableButton().click();
        homeApp.menuTableSortSearchButton().click();
    }
    public void entrarTableDataDownload() {
        homeApp.abaTableButton().click();
        homeApp.menuTableDataDownloadButton().click();
    }
}
