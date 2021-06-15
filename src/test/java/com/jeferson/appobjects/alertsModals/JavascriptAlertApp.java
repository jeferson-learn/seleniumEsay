package com.jeferson.appobjects.alertsModals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptAlertApp {
    private final WebDriver driver;

    public JavascriptAlertApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement javaScriptAlertBoxButton() {
        return driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
    }
    public WebElement javaScriptConfirmBoxButton() {
        return driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
    }
    public WebElement javaScriptConfirmBoxText() {
        return driver.findElement(By.id("confirm-demo"));
    }
    public WebElement javaScriptAlertPromptBoxButton() {
        return driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
    }
    public WebElement javaScriptAlertPromptBoxText() {
        return driver.findElement(By.id("prompt-demo"));
    }
}
