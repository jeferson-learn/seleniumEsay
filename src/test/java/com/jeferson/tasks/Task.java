package com.jeferson.tasks;

import com.jeferson.appobjects.App;
import org.openqa.selenium.WebDriver;

public class Task {

    private final WebDriver driver;
    private final App app;

    public Task(WebDriver driver){
        this.driver = driver;
        app = new App(driver);
    }

    public void fulanoParteAcoes(){
        app.fulanoElementoTipo();
    }

}
