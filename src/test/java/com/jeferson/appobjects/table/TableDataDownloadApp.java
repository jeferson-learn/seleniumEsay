package com.jeferson.appobjects.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableDataDownloadApp {
    private final WebDriver driver;

    public TableDataDownloadApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement copyButton(){
        return driver.findElement(By.linkText("Copy"));
    }
    public WebElement csvButton(){
        return driver.findElement(By.linkText("CSV"));
    }
    public WebElement excelButton(){
        return driver.findElement(By.linkText("Excel"));
    }
    public WebElement pdfButton(){
        return driver.findElement(By.linkText("PDF"));
    }
    public WebElement printButton(){
        return driver.findElement(By.linkText("Print"));
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
