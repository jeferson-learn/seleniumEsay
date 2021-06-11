package com.jeferson.appobjects.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TableSortSearchApp {
    private final WebDriver driver;

    public TableSortSearchApp(WebDriver driver) {
        this.driver = driver;
    }

    public Select showEntriesPaginaSelect() {
        return new Select(driver.findElement(By.name("example_length")));
    }

    public WebElement searchTextField() {
        return driver.findElement(By.cssSelector("#example_filter input"));
    }

    public WebElement nameButton() {
        return driver.findElement(By.xpath("//th[text()='Name']"));
    }
    public WebElement positionButton() {
        return driver.findElement(By.xpath("//th[text()='Position']"));
    }
    public WebElement officeButton() {
        return driver.findElement(By.xpath("//th[text()='Office']"));
    }
    public WebElement ageButton() {
        return driver.findElement(By.xpath("//th[text()='Age']"));
    }
    public WebElement startDateButton() {
        return driver.findElement(By.xpath("//th[text()='Start date']"));
    }
    public WebElement salaryButton() {
        return driver.findElement(By.xpath("//th[text()='Salary']"));
    }
}
