package com.jeferson.appobjects.table;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableFilterApp {
    private final WebDriver driver;
    private final Wait wait;

    public TableFilterApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement greenButton(){
        return driver.findElement(By.cssSelector(".btn-success"));
    }
    public WebElement orangeButton(){
        return driver.findElement(By.cssSelector(".btn-warning"));
    }
    public WebElement redButton(){
        return driver.findElement(By.cssSelector(".btn-group .btn-danger"));
    }
    public WebElement allButton(){
        return driver.findElement(By.cssSelector(".btn-default"));
    }
    public List<WebElement> checkboxs(String tipos){
        return driver.findElements(By.cssSelector("[data-status='"+tipos+"'] label"));
    }
    public List<WebElement> checkboxAll(){
        return driver.findElements(By.cssSelector("label"));
    }
}
