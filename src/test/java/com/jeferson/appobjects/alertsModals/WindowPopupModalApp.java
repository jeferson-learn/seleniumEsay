package com.jeferson.appobjects.alertsModals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPopupModalApp {
    private final WebDriver driver;

    public WindowPopupModalApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement followOnTwitterButton() {
        return driver.findElement(By.linkText("Follow On Twitter"));
    }
    public WebElement likeUsOnFacebookButton() {
        return driver.findElement(By.linkText("Like us On Facebook"));
    }
    public WebElement followTwitterAndFacebookButton() {
        return driver.findElement(By.linkText("Follow Twitter & Facebook"));
    }
    public WebElement followAllButton() {
        return driver.findElement(By.id("followall"));
    }
}
