package com.jeferson.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeApp {

    private final WebDriver driver;

    public HomeApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement abaInputFormsButton() {
        return driver.findElement(By.linkText("Input Forms"));
    }
    public WebElement menuSimpleFormDemoButton() {
        return driver.findElement(By.linkText("Simple Form Demo"));
    }
}
