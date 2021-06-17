package com.jeferson.appobjects.listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataListFilterApp {
    private final WebDriver driver;

    public DataListFilterApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement searchAttendeesTextFiled() {
        return driver.findElement(By.id("input-search"));
    }
}
