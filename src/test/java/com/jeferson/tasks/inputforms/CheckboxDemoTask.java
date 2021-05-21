package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.CheckboxDemoApp;
import org.openqa.selenium.WebDriver;

public class CheckboxDemoTask {
    private final WebDriver driver;
    private final CheckboxDemoApp checkboxDemoApp;

    public CheckboxDemoTask(WebDriver driver) {
        this.driver = driver;
        checkboxDemoApp = new CheckboxDemoApp(driver);
    }

    public void singleCheckboxDemo() {
        checkboxDemoApp.clickOnThisCheckBox().click();
    }

    public void multipleCheckboxDemo() {
        checkboxDemoApp.option1().click();
        checkboxDemoApp.option2().click();
        checkboxDemoApp.option3().click();
        checkboxDemoApp.option4().click();
    }
}
