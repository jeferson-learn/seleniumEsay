package com.jeferson.appobjects.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleFormDemoApp {
    private final WebDriver driver;

    public SimpleFormDemoApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement enterMessageTextField() {
        return driver.findElement(By.id("user-message"));
    }

    public WebElement showMessageButton() {
        return driver.findElement(By.cssSelector("#get-input button"));
    }

    public WebElement yourMessageText() {
        return driver.findElement(By.id("display"));
    }

    public WebElement enterATextField() {
        return driver.findElement(By.id("sum1"));
    }

    public WebElement enterBTextField() {
        return driver.findElement(By.id("sum2"));
    }

    public WebElement getTotalButton() {
        return driver.findElement(By.cssSelector("#gettotal button"));
    }

    public WebElement totalText() {
        return driver.findElement(By.id("displayvalue"));
    }
}
