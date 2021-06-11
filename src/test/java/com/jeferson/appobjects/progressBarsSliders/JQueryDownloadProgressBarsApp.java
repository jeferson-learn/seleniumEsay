package com.jeferson.appobjects.progressBarsSliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDownloadProgressBarsApp {
    private final WebDriver driver;

    public JQueryDownloadProgressBarsApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement startDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }
    public WebElement messagemText() {
        return driver.findElement(By.cssSelector("#dialog .progress-label"));
    }
    public WebElement cancelDownloadORcloseButton() {
        return driver.findElement(By.cssSelector(".ui-dialog-buttonset button"));
    }
}
