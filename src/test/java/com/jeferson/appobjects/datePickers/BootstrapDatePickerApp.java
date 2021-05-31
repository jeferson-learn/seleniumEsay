package com.jeferson.appobjects.datePickers;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapDatePickerApp {
    private final WebDriver driver;
    private final Wait wait;
    public BootstrapDatePickerApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement selectDateTextField() {
        wait.waitVisibilityElement(By.cssSelector("#sandbox-container1 .form-control"));
        return driver.findElement(By.cssSelector("#sandbox-container1 .form-control"));
    }
    public WebElement selectDateIconeButton() {
        return driver.findElement(By.cssSelector("#sandbox-container1 .input-group-addon"));
//        return driver.findElement(By.cssSelector("#sandbox-container1 .glyphicon"));
    }
    public WebElement selectDateStartTextField() {
        return driver.findElement(By.cssSelector("#datepicker [placeholder='Start date']"));
    }
    public WebElement selectDateEndTextField() {
        return driver.findElement(By.cssSelector("#datepicker [placeholder='End date']"));
    }
}
