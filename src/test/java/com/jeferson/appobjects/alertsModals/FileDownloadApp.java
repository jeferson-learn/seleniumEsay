package com.jeferson.appobjects.alertsModals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownloadApp {
    private final WebDriver driver;

    public FileDownloadApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement enterDataTextField() {
        return driver.findElement(By.id("textbox"));
    }

    public WebElement generateFileButton() {
        return driver.findElement(By.id("create"));
    }

    public WebElement downloadButton() {
        return driver.findElement(By.id("link-to-download"));
    }
}
