package com.jeferson.appobjects.listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapListBoxApp {
    private final WebDriver driver;

    public BootstrapListBoxApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement leftSearchTextField() {
        return driver.findElement(By.cssSelector("div[class='well text-right'] #listhead input[name='SearchDualList']"));
    }
    public WebElement leftSelectAllButton() {
        return driver.findElement(By.cssSelector("div[class='well text-right'] #listhead .btn-default"));
    }
    public WebElement rightSearchTextField() {
        return driver.findElement(By.cssSelector("div[class='well'] #listhead input[name='SearchDualList']"));
    }
    public WebElement rightSelectAllButton() {
        return driver.findElement(By.cssSelector("div[class='well'] #listhead .btn-default"));
    }
    public WebElement rightButton() {
        return driver.findElement(By.cssSelector(".move-right"));
    }
    public WebElement leftButton() {
        return driver.findElement(By.cssSelector(".move-left"));
    }
}
