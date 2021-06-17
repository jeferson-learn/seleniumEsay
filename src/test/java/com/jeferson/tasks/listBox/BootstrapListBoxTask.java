package com.jeferson.tasks.listBox;

import com.jeferson.appobjects.listBox.BootstrapListBoxApp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BootstrapListBoxTask {
    private final WebDriver driver;
    private final BootstrapListBoxApp bootstrapListBoxApp;

    public BootstrapListBoxTask(WebDriver driver) {
        this.driver = driver;
        this.bootstrapListBoxApp = new BootstrapListBoxApp(driver);
    }

    public void selectAllToRightOrLeft(String text) {
        if (text.equals("right")){
            bootstrapListBoxApp.leftSelectAllButton().click();
            bootstrapListBoxApp.rightButton().click();
            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        } else if (text.equals("left")) {
            bootstrapListBoxApp.rightSelectAllButton().click();
            bootstrapListBoxApp.leftButton().click();
            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        }
    }

    public void searchTextFiled(String leftRight, String text) {
        if (leftRight.equals("left")){
            bootstrapListBoxApp.leftSearchTextField().sendKeys(text);
            bootstrapListBoxApp.leftSelectAllButton().click();
            bootstrapListBoxApp.rightButton().click();
            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        } else if (leftRight.equals("right")) {
            bootstrapListBoxApp.rightSearchTextField().sendKeys(text);
            bootstrapListBoxApp.rightSelectAllButton().click();
            bootstrapListBoxApp.leftButton().click();
            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        }
    }
}
