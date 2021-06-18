package com.jeferson.appobjects.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicDataLoadingApp {
    private final WebDriver driver;

    public DynamicDataLoadingApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNewUserButton() {
        return driver.findElement(By.id("save"));
    }
    public WebElement loadingImg() {
        return driver.findElement(By.id("loading"));
    }
}
