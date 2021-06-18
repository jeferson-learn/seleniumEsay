package com.jeferson.tasks.others;

import com.jeferson.appobjects.others.DynamicDataLoadingApp;
import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.WebDriver;

public class DynamicDataLoadingTask {
    private final WebDriver driver;
    private final Wait wait;
    private final DynamicDataLoadingApp dynamicDataLoadingApp;

    public DynamicDataLoadingTask(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
        this.dynamicDataLoadingApp = new DynamicDataLoadingApp(driver);
    }

    public void getRandomUser(){
        dynamicDataLoadingApp.getNewUserButton().click();
        String text;
        do {
            text = dynamicDataLoadingApp.loadingImg().getText();
        } while (text.equals("loading..."));
        System.out.println(text);
    }
}
