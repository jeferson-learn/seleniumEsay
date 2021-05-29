package com.jeferson.appobjects;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeApp {

    private final WebDriver driver;
    private final Wait wait;

    public HomeApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement abaInputFormsButton() {
        return driver.findElement(By.linkText("Input Forms"));
    }
    public WebElement menuSimpleFormDemoButton() {
        return driver.findElement(By.linkText("Simple Form Demo"));
    }
    public WebElement menuCheckboxDemoButton() {
        return driver.findElement(By.linkText("Checkbox Demo"));
    }
    public WebElement menuRadioButtonsDemoButton() {
        return driver.findElement(By.linkText("Radio Buttons Demo"));
    }
    public WebElement menuSelectDropdownListButton() {
        return driver.findElement(By.linkText("Select Dropdown List"));
    }
    public WebElement menuInputFormSubmitButton() {
        return driver.findElement(By.linkText("Input Form Submit"));
    }
    public WebElement menuAjaxFormSubmitButton() {
        return driver.findElement(By.linkText("Ajax Form Submit"));
    }
    public WebElement menuJQuerySelectDropdownButton() {
        return driver.findElement(By.linkText("JQuery Select dropdown"));
    }
    public WebElement fechaPopup() {
        wait.waitElementToBeClickable(By.cssSelector("#at-cv-lightbox-header #at-cv-lightbox-close"));
        return driver.findElement(By.cssSelector("#at-cv-lightbox-header #at-cv-lightbox-close"));
    }
}
