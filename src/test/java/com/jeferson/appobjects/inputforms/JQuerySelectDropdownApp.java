package com.jeferson.appobjects.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JQuerySelectDropdownApp {
    private final WebDriver driver;

    public JQuerySelectDropdownApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement selectCountryClickSelect() {
        return driver.findElement(By.xpath("//*[@id='select2-country-container']/following-sibling::span"));
    }
    public WebElement selectCountryTextField() {
        return driver.findElement(By.cssSelector(".select2-search.select2-search--dropdown .select2-search__field"));
    }
    public List<WebElement> selectCountryListText() {
        return driver.findElements(By.cssSelector(".select2-results #select2-country-results li"));
    }
    public WebElement selectStateTextField() {
        return driver.findElement(By.cssSelector(".select2-search__field"));
    }
    public List<WebElement> selectStatesListText() {
        return driver.findElements(By.cssSelector(".select2-results__options li"));
    }
}
