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
        if (homeApp.fechaPopup().isDisplayed()){
            homeApp.fechaPopup().click();
            System.out.println("fechou popup");
        }
    }
    public void entrarSimpleFormDemo(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuSimpleFormDemoButton().click();
    }
    public void entrarCheckboxDemo(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuCheckboxDemoButton().click();
    }
    public void entrarRadioButtonsDemo(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuRadioButtonsDemoButton().click();
    }
    public void entrarSelectDropdownList(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuSelectDropdownListButton().click();
    }
    public void entrarInputFormSubmit(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuInputFormSubmitButton().click();
    }
    public void entrarAjaxFormSubmit(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuAjaxFormSubmitButton().click();
    }
    public void entrarJQuerySelectDropdown(){
        fecharPopup();
        homeApp.abaInputFormsButton().click();
        homeApp.menuJQuerySelectDropdownButton().click();
    }
    public void entrarBootstrapDatePicker() {
        fecharPopup();
        homeApp.abaDatePickersButton().click();
        homeApp.menuBootstrapDatePickerButton().click();
    }
    public void entrarJQueryDatePicker() {
        fecharPopup();
        homeApp.abaDatePickersButton().click();
        homeApp.menuJQueryDatePickerButton().click();
    }
    public void entrarTablePagination() {
        fecharPopup();
        homeApp.abaTableButton().click();
        homeApp.menuTablePaginationButton().click();
    }
    public void entrarTableDataSearch() {
        fecharPopup();
        homeApp.abaTableButton().click();
        homeApp.menuTableDataSearchButton().click();
    }
    public void entrarTableFilter() {
        fecharPopup();
        homeApp.abaTableButton().click();
        homeApp.menuTableFilterButton().click();
    }
    public void entrarTableSortSearch() {
        fecharPopup();
        homeApp.abaTableButton().click();
        homeApp.menuTableSortSearchButton().click();
    }
    public void entrarTableDataDownload() {
        fecharPopup();
        homeApp.abaTableButton().click();
        homeApp.menuTableDataDownloadButton().click();
    }
    public void entrarJQueryDownloadProgressBars() {
        fecharPopup();
        homeApp.abaProgressBarsButton().click();
        homeApp.menuJQueryDownloadProgressBarsButton().click();
    }
    public void entrarBootstrapProgressBar() {
        fecharPopup();
        homeApp.abaProgressBarsButton().click();
        homeApp.menuBootstrapProgressBarButton().click();
    }
    public void entrarDragDropSliders() {
        fecharPopup();
        homeApp.abaProgressBarsButton().click();
        homeApp.menuDragDropSlidersButton().click();
    }
    public void entrarBootstrapAlerts() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuBootstrapAlertsButton().click();
    }
    public void entrarBootstrapModals() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuBootstrapModalsButton().click();
    }
    public void entrarWindowPopup() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuWindowPopupModalButton().click();
    }
    public void entrarProgressBarModal() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuProgressBarModalButton().click();
    }
    public void entrarJavascriptAlerts() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuJavascriptAlertsButton().click();
    }
    public void entrarFileDownload() {
        fecharPopup();
        homeApp.abaAlertsModalsButton().click();
        homeApp.menuFileDownloadButton().click();
    }
    public void entrarBootstrapListBox() {
        fecharPopup();
        homeApp.abaListBoxButton().click();
        homeApp.menuBootstrapListBoxButton().click();
    }
    public void entrarJQueryListBox() {
        fecharPopup();
        homeApp.abaListBoxButton().click();
        homeApp.menuJQueryListBoxButton().click();
    }
    public void entrarDataListFilter() {
        fecharPopup();
        homeApp.abaListBoxButton().click();
        homeApp.menuDataListFilterButton().click();
    }
    public void entrarDragAndDrop() {
        fecharPopup();
        homeApp.abaOthersButton().click();
        homeApp.menuDragAndDropButton().click();
    }
    public void entrarDynamicDataLoading() {
        fecharPopup();
        homeApp.abaOthersButton().click();
        homeApp.menuDynamicDataLoadingButton().click();
    }
    public void entrarChartsDemo() {
        fecharPopup();
        homeApp.abaOthersButton().click();
        homeApp.menuChartsDemoButton().click();
    }
}
