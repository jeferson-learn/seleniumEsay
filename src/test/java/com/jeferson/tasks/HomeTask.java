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

}
