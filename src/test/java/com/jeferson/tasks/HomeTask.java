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

    public void entrarSimpleFormDemo(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuSimpleFormDemoButton().click();
    }
    public void entrarCheckboxDemo(){
        homeApp.abaInputFormsButton().click();
        homeApp.menuCheckboxDemoButton().click();
    }
    public void entrarRadioButtonsDemo(){
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
        homeApp.abaInputFormsButton().click();
        homeApp.menuJQuerySelectDropdownButton().click();
    }

}