package com.jeferson.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {

    private final WebDriver driver;

    public App (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement fulanoElementoTipo() {
        return driver.findElement(By.cssSelector("fulano_elemento"));
    }
}
