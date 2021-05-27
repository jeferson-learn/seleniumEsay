package com.jeferson.appobjects.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdownListDemoApp {
    private final WebDriver driver;

    public SelectDropdownListDemoApp(WebDriver driver) {
        this.driver = driver;
    }

    public Select selectListDemoSelect() {
        return new Select (driver.findElement(By.id("select-demo")));
    }
    public WebElement messagemDaySelectText() {
        return driver.findElement(By.cssSelector(".panel-body .selected-value"));
    }
    public Select multiSelectListDemoSelect() {
        return new Select (driver.findElement(By.id("multi-select")));
    }
    public List<WebElement> listValueSelect(){
        return driver.findElements(By.cssSelector("select[name=States] option"));
    }
    public WebElement firstSelectedButton() {
        return driver.findElement(By.id("printMe"));
    }
    public WebElement getAllSelectedButton() {
        return driver.findElement(By.id("printAll"));
    }
}
