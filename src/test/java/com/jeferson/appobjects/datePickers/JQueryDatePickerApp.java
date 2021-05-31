package com.jeferson.appobjects.datePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDatePickerApp {
    private final WebDriver driver;

    public JQueryDatePickerApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement fromTextField() {
        return driver.findElement(By.cssSelector(".panel-body #from"));
    }
    public WebElement toTextField() {
        return driver.findElement(By.cssSelector(".panel-body #to"));
    }
}
