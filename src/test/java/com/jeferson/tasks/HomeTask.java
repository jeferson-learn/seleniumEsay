package com.jeferson.tasks;

import com.jeferson.appobjects.HomeApp;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoTask {

    private final WebDriver driver;
    private final HomeApp homeApp;

    public SimpleFormDemoTask(WebDriver driver){
        this.driver = driver;
        homeApp = new HomeApp(driver);
    }

    public void fulanoParteAcoes(){
        homeApp.abaInputFormsButton().click();
    }

}
