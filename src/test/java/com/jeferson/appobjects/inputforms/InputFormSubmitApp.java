package com.jeferson.appobjects.inputforms;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InputFormSubmitApp {
    private final WebDriver driver;
    private final Wait wait;

    public InputFormSubmitApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement firstNameTextField() {
        wait.waitElementToBeClickable(By.name("first_name"));
        return driver.findElement(By.name("first_name"));
    }
    public WebElement lastNameTextField() {
        return driver.findElement(By.name("last_name"));
    }
    public WebElement emailTextField() {
        return driver.findElement(By.name("email"));
    }
    public WebElement phoneTextField() {
        return driver.findElement(By.name("phone"));
    }
    public WebElement addressTextField() {
        return driver.findElement(By.name("address"));
    }
    public WebElement cityTextField() {
        return driver.findElement(By.name("city"));
    }
    public Select stateSelect() {
        return new Select(driver.findElement(By.name("state")));
    }
    public WebElement zipCodeTextField() {
        return driver.findElement(By.name("zip"));
    }
    public WebElement websiteTextField() {
        return driver.findElement(By.name("website"));
    }
    public List<WebElement> doYouHaveHostingRadio() {
        return driver.findElements(By.cssSelector(".radio label"));
    }
    public WebElement projectDescriptionTextField() {
        return driver.findElement(By.name("comment"));
    }
    public WebElement sendButton() {
        return driver.findElement(By.cssSelector(".form-group button"));
    }
}
