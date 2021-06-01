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
    public void entrarJQueryDownloadProgressBars() {
        homeApp.abaProgressBarsButton().click();
        homeApp.menuJQueryDownloadProgressBarsButton().click();
    }
    public void entrarBootstrapProgressBar() {
        homeApp.abaProgressBarsButton().click();
        homeApp.menuBootstrapProgressBarButton().click();
    }
    public void entrarDragDropSliders() {
        homeApp.abaProgressBarsButton().click();
        homeApp.menuDragDropSlidersButton().click();
    }
    public void entrarBootstrapAlerts() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuBootstrapAlertsButton().click();
    }
    public void entrarBootstrapModals() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuBootstrapModalsButton().click();
    }
    public void entrarWindowPopup() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuWindowPopupModalButton().click();
    }
    public void entrarProgressBarModal() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuProgressBarModalButton().click();
    }
    public void entrarJavascriptAlerts() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuJavascriptAlertsButton().click();
    }
    public void entrarFileDownload() {
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuFileDownloadButton().click();
    }
    public void entrarBootstrapListBox() {
        homeApp.abaListBoxButton().click();
        homeApp.menuBootstrapListBoxButton().click();
    }
    public void entrarJQueryListBox() {
        homeApp.abaListBoxButton().click();
        homeApp.menuJQueryListBoxButton().click();
    }
    public void entrarDataListFilter() {
        homeApp.abaListBoxButton().click();
        homeApp.menuDataListFilterButton().click();
    }
    public void entrarDragAndDrop() {
        homeApp.abaOthersButton().click();
        homeApp.menuDragAndDropButton().click();
    }
    public void entrarDynamicDataLoading() {
        homeApp.abaOthersButton().click();
        homeApp.menuDynamicDataLoadingButton().click();
    }
    public void entrarChartsDemo() {
        homeApp.abaOthersButton().click();
        homeApp.menuChartsDemoButton().click();
    }
}
