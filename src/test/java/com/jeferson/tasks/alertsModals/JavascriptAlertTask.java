package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.JavascriptAlertApp;
import com.jeferson.framework.supports.Wait;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class JavascriptAlertTask {
    private final WebDriver driver;
    private final Wait wait;
    private final JavascriptAlertApp javascriptAlertApp;

    public JavascriptAlertTask(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
        this.javascriptAlertApp = new JavascriptAlertApp(driver);
    }

    public void clickButtonAlertBox() {
        javascriptAlertApp.javaScriptAlertBoxButton().click();
        driver.switchTo().alert().accept();
    }

    public void clickButtonConfirmBox(String text) {
        javascriptAlertApp.javaScriptConfirmBoxButton().click();
        if (text.equals("ok")) {
            driver.switchTo().alert().accept();
            Assertions.assertEquals("You pressed OK!", javascriptAlertApp.javaScriptConfirmBoxText().getText());
        } else if (text.equals("cancel")) {
            driver.switchTo().alert().dismiss();
            Assertions.assertEquals("You pressed Cancel!", javascriptAlertApp.javaScriptConfirmBoxText().getText());
        }
    }

    public void clickButtonAndFillPrompt(String text) {
        javascriptAlertApp.javaScriptAlertPromptBoxButton().click();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", javascriptAlertApp.javaScriptAlertPromptBoxText());
        assertThat(javascriptAlertApp.javaScriptAlertPromptBoxText().getText(), containsString(text));
    }
}

