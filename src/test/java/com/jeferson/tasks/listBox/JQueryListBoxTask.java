package com.jeferson.tasks.listBox;

import com.jeferson.appobjects.listBox.JQueryListBoxApp;
import org.openqa.selenium.WebDriver;

public class JQueryListBoxTask {
    private final WebDriver driver;
    private final JQueryListBoxApp jQueryListBoxApp;

    public JQueryListBoxTask(WebDriver driver) {
        this.driver = driver;
        this.jQueryListBoxApp = new JQueryListBoxApp(driver);
    }

    public void pickListValueToAdd(String text) {
        jQueryListBoxApp.pickListSelect().selectByVisibleText(text);
        jQueryListBoxApp.addButton().click();
    }
    public void pickMultipleListValueToAdd(String [] text) {
        for (int i = 0; i<text.length; i++){
            jQueryListBoxApp.pickListSelect().selectByVisibleText(text[i]);
        }
        jQueryListBoxApp.addButton().click();
    }

    public void pickListAddAll() {
        jQueryListBoxApp.addAllButton().click();
        jQueryListBoxApp.removeAllButton().click();
    }


}
