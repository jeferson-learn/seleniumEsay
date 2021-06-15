package com.jeferson.appobjects.alertsModals;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressBarModalApp {
    private final WebDriver driver;
    private final Wait wait;

    public ProgressBarModalApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement simpleDialogButton() {
        return driver.findElement(By.cssSelector(".btn-primary"));
    }
    public WebElement dialogWithCustomMessageButton() {
        wait.waitVisibilityElement(By.cssSelector(".btn-success"));
        return driver.findElement(By.cssSelector(".btn-success"));
    }
    public WebElement dialogWithCustomSettingsButton() {
        wait.waitVisibilityElement(By.cssSelector(".btn-warning"));
        return driver.findElement(By.cssSelector(".btn-warning"));
    }

    public WebElement showMessageText() {
        wait.waitVisibilityElement(By.cssSelector(".modal-header h3"));
        return driver.findElement(By.cssSelector(".modal-header h3"));
    }
}
