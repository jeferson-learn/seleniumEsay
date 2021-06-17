package com.jeferson.tasks.listBox;

import com.jeferson.appobjects.listBox.DataListFilterApp;
import org.openqa.selenium.WebDriver;

public class DataListFilterTask {
    private final WebDriver driver;
    private final DataListFilterApp dataListFilterApp;

    public DataListFilterTask(WebDriver driver) {
        this.driver = driver;
        this.dataListFilterApp = new DataListFilterApp(driver);
    }

    public void searchAttendess(String text) {
        dataListFilterApp.searchAttendeesTextFiled().sendKeys(text);
    }
}
