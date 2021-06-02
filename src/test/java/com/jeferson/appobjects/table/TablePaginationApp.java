package com.jeferson.appobjects.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePaginationApp {
    private final WebDriver driver;

    public TablePaginationApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement pageLinkPrev() {
        return driver.findElement(By.linkText("«"));
    }
    public WebElement pageLink1() {
        return driver.findElement(By.linkText("1"));
    }
    public WebElement pageLink2() {
        return driver.findElement(By.linkText("2"));
    }
    public WebElement pageLink3() {
        return driver.findElement(By.linkText("3"));
    }
    public WebElement pageLinkNext() {
        return driver.findElement(By.linkText("»"));
    }
}
