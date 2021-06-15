package com.jeferson.appobjects.alertsModals;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapAlertsApp {
    private final WebDriver driver;
    private final Wait wait;

    public BootstrapAlertsApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }
    /** SUCCESS **/
    public WebElement autoCloseableSuccessButton() {
        return driver.findElement(By.id("autoclosable-btn-success"));
    }
    public WebElement autoCloseableSuccessMessageText() {
        return driver.findElement(By.cssSelector(".alert-autocloseable-success"));
    }
    public WebElement normalSuccessButton() {
        return driver.findElement(By.id("normal-btn-success"));
    }
    public WebElement normalSuccessMessage() {
        return driver.findElement(By.cssSelector(".alert-normal-success"));
    }
    public WebElement normalSuccessMessageCloseButton() {
        return driver.findElement(By.cssSelector(".alert-normal-success button"));
    }
    /** WARNING **/
    public WebElement autoCloseableWarningButton() {
        return driver.findElement(By.id("autoclosable-btn-warning"));
    }
    public WebElement autoCloseableWarningMessageText() {
        return driver.findElement(By.cssSelector(".alert-autocloseable-warning"));
    }
    public WebElement normalWarningButton() {
        return driver.findElement(By.id("normal-btn-warning"));
    }
    public WebElement normalWarningMessageCloseButton() {
        return driver.findElement(By.cssSelector(".alert-normal-warning button"));
    }
    /** DANGER **/
    public WebElement autoCloseableDangerButton() {
        return driver.findElement(By.id("autoclosable-btn-danger"));
    }
    public WebElement autoCloseableDangerMessageText() {
        return driver.findElement(By.cssSelector(".alert-autocloseable-danger"));
    }
    public WebElement normalDangerButton() {
        return driver.findElement(By.id("normal-btn-danger"));
    }
    public WebElement normalDangerMessageCloseButton() {
        return driver.findElement(By.cssSelector(".alert-normal-danger button"));
    }
    /** INFO **/
    public WebElement autoCloseableInfoButton() {
        return driver.findElement(By.id("autoclosable-btn-info"));
    }
    public WebElement autoCloseableInfoMessageText() {
        return driver.findElement(By.cssSelector(".alert-autocloseable-info"));
    }
    public WebElement normalInfoButton() {
        return driver.findElement(By.id("normal-btn-info"));
    }
    public WebElement normalInfoMessageCloseButton() {
        return driver.findElement(By.cssSelector(".alert-normal-info button"));
    }
}
