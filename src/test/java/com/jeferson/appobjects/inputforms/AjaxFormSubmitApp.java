package com.jeferson.appobjects.inputforms;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AjaxFormSubmitApp {
    private final WebDriver driver;
    private final Wait wait;

    public AjaxFormSubmitApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement nameTextField() {
        return driver.findElement(By.id("title"));
    }
    public WebElement commentTextField() {
        return driver.findElement(By.id("description"));
    }
    public WebElement submitButton() {
        return driver.findElement(By.id("btn-submit"));
    }
    public WebElement formsubmitedSuccessfullyText() {
//        wait.waitVisibilityElement(By.id("submit-control"));
        return driver.findElement(By.id("submit-control"));
    }
}
