package com.jeferson.appobjects.progressBarsSliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragDropSlidersApp {
    private final WebDriver driver;

    public DragDropSlidersApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement rangeSlidersGray() {
        return driver.findElement(By.cssSelector("#slider1 input"));
    }
    public WebElement rangeSlidersGreen() {
        return driver.findElement(By.cssSelector("#slider3 input"));
    }
    public WebElement rangeSlidersOrange() {
        return driver.findElement(By.cssSelector("#slider5 input"));
    }
    public WebElement rangeSlidersDarkBlue() {
        return driver.findElement(By.cssSelector("#slider2 input"));
    }
    public WebElement rangeSlidersLightBlue() {
        return driver.findElement(By.cssSelector("#slider4 input"));
    }
    public WebElement rangeSlidersRed() {
        return driver.findElement(By.cssSelector("#slider6 input"));
    }
}
