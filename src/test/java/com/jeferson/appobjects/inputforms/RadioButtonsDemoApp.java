package com.jeferson.appobjects.inputforms;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsDemoApp {
    private final WebDriver driver;
    private final Wait wait;

    public RadioButtonsDemoApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
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
        wait.waitVisibilityElement(By.cssSelector(".panel-body .radiobutton"));
        return driver.findElement(By.cssSelector(".panel-body .radiobutton"));
    }
    public WebElement groupRadioSexMale() {
        return driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
    }
    public WebElement groupRadioSexFemale() {
        return driver.findElement(By.xpath("//input[@value='Female' and @name='gender']"));
    }
    public WebElement radioAgeGroup0Of5() {
        return driver.findElement(By.xpath("//input[@value='0 - 5' and @name='ageGroup']"));
    }
    public WebElement radioAgeGroup5Of15() {
        return driver.findElement(By.xpath("//input[@value='5 - 15' and @name='ageGroup']"));
    }
    public WebElement radioAgeGroup15Of50() {
        return driver.findElement(By.xpath("//input[@value='15 - 50' and @name='ageGroup']"));
    }
    public WebElement getValuesButton() {
        return driver.findElement(By.xpath("//button[text()='Get values']"));
    }
    public WebElement messagemSexAge() {
        wait.waitVisibilityElement(By.cssSelector(".panel-body .groupradiobutton"));
        return driver.findElement(By.cssSelector(".panel-body .groupradiobutton"));
    }
    public List<WebElement> radioSex() {
        List<WebElement> elements = driver.findElements(By.name("optradio"));
        return elements;
    }
    public List<WebElement> gruopRadioSex() {
        List<WebElement> elements = driver.findElements(By.name("gender"));
        return elements;
    }
    public List<WebElement> gruopRadioAge() {
        List<WebElement> elements = driver.findElements(By.name("ageGroup"));
        return elements;
    }


}
