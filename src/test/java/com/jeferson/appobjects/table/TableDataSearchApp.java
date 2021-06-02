package com.jeferson.appobjects.table;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableDataSearchApp {
    private final WebDriver driver;
    private final Wait wait;

    public TableDataSearchApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement tasksTextField() {
        return driver.findElement(By.id("task-table-filter"));
    }
    public WebElement filterButton() {
        return driver.findElement(By.cssSelector(".btn-xs"));
    }
    public WebElement numberTextFiled() {
        wait.waitVisibilityElement(By.cssSelector(".filters [placeholder='#']"));
        return driver.findElement(By.cssSelector(".filters [placeholder='#']"));
    }
    public WebElement userNameTextFiled() {
        wait.waitVisibilityElement(By.cssSelector(".filters [placeholder='Username']"));
        return driver.findElement(By.cssSelector(".filters [placeholder='Username']"));
    }
    public WebElement firstNameTextField() {
        wait.waitVisibilityElement(By.cssSelector(".filters [placeholder='First Name']"));
        return driver.findElement(By.cssSelector(".filters [placeholder='First Name']"));
    }
    public WebElement LastNameTextField() {
        wait.waitVisibilityElement(By.cssSelector(".filters [placeholder='Last Name']"));
        return driver.findElement(By.cssSelector(".filters [placeholder='Last Name']"));
    }
}
