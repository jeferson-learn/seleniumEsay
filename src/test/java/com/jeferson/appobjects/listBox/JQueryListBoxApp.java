package com.jeferson.appobjects.listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JQueryListBoxApp {
    private final WebDriver driver;

    public JQueryListBoxApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addButton() {
        return driver.findElement(By.cssSelector(".pAdd"));
    }
    public WebElement addAllButton() {
        return driver.findElement(By.cssSelector(".pAddAll"));
    }
    public WebElement removeButton() {
        return driver.findElement(By.cssSelector(".pRemove"));
    }
    public WebElement removeAllButton() {
        return driver.findElement(By.cssSelector(".pRemoveAll"));
    }
    public Select pickListSelect() {
        return new Select(driver.findElement(By.cssSelector("#pickList select")));
    }
}
