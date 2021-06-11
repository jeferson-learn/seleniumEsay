package com.jeferson.appobjects.progressBarsSliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapProgressBarApp {
    private final WebDriver driver;

    public BootstrapProgressBarApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickDownloadButton() {
        return driver.findElement(By.id("cricle-btn"));
    }

    public WebElement messagemPercentageText() {
        return driver.findElement(By.cssSelector(".percenttext"));
    }
}
