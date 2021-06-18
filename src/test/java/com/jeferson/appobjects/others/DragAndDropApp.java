package com.jeferson.appobjects.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropApp {
    private final WebDriver driver;

    public DragAndDropApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement itemDraggable1Button() {
        return driver.findElement(By.xpath("//div[@id='todrag']/span[text()='Draggable 1']"));
    }
    public WebElement itemDraggable2Button() {
        return driver.findElement(By.xpath("//div[@id='todrag']/span[text()='Draggable 2']"));
    }
    public WebElement itemDraggable3Button() {
        return driver.findElement(By.xpath("//div[@id='todrag']/span[text()='Draggable 3']"));
    }
    public WebElement itemDraggable4Button() {
        return driver.findElement(By.xpath("//div[@id='todrag']/span[text()='Draggable 4']"));
    }
    public WebElement dropHereFiled() {
        return driver.findElement(By.id("mydropzone"));
    }
}
