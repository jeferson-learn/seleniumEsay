package com.jeferson.appobjects.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxDemoApp {
    private final WebDriver driver;

    public CheckboxDemoApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickOnThisCheckBox() {
        return driver.findElement(By.id("isAgeSelected"));
    }

    public WebElement messageSuccess() {
        return driver.findElement(By.id("txtAge"));
    }

    public WebElement option1() {
        return driver.findElement(By.xpath("//label[text()='Option 1']"));
    }
    public WebElement option2() {
        return driver.findElement(By.xpath("//label[text()='Option 2']"));
    }
    public WebElement option3() {
        return driver.findElement(By.xpath("//label[text()='Option 3']"));
    }
    public WebElement option4() {
        return driver.findElement(By.xpath("//label[text()='Option 4']"));
    }


}
