package com.jeferson.appobjects.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsDemoApp {
    private final WebDriver driver;

    public RadioButtonsDemoApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement radioButtonDemoMale() {
        return driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
    }
    public WebElement radioButtonDemoFemale() {
        return driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
    }
    public WebElement getCheckedValueButton() {
        return driver.findElement(By.id("buttoncheck"));
    }
    public WebElement messagemRadioButton() {
        return driver.findElement(By.cssSelector(".panel-body .radiobutton"));
    }
}
