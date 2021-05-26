package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.CheckboxDemoApp;
import org.junit.jupiter.api.Assertions;
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
        String messageSuccess = checkboxDemoApp.messageSuccess().getText();
        Assertions.assertEquals("Success - Check box is checked", messageSuccess);
    }

    public void multipleCheckboxDemo() {
        checkboxDemoApp.option1().click();
        checkboxDemoApp.option2().click();
        checkboxDemoApp.option3().click();
        checkboxDemoApp.option4().click();
    }

    public void multipleCheckboxDemoCheckAll(){
        checkboxDemoApp.checkAllButton().click();
    }

    public void chooseSelectCheckboxDemo(int num1) {
        String [] value = new String[checkboxDemoApp.checkboxs().size()];
        for (int i = 0; i<checkboxDemoApp.checkboxs().size(); i++) {
            value[i] = checkboxDemoApp.checkboxs().get(i).getText();
            if (num1 == i) {
                checkboxDemoApp.checkboxs().get(i).click();
            }
        }
    }
    public void chooseSelectCheckboxDemo(int num1, int num2) {
        String [] value = new String[checkboxDemoApp.checkboxs().size()];
        for (int i = 0; i<checkboxDemoApp.checkboxs().size(); i++) {
            value[i] = checkboxDemoApp.checkboxs().get(i).getText();
            if (num1 == i || num2 == i) {
                checkboxDemoApp.checkboxs().get(i).click();
            }
        }
    }
    public void chooseSelectCheckboxDemo(int num1, int num2, int num3) {
        String [] value = new String[checkboxDemoApp.checkboxs().size()];
        for (int i = 0; i<checkboxDemoApp.checkboxs().size(); i++) {
            value[i] = checkboxDemoApp.checkboxs().get(i).getText();
            if (num1 == i || num2 == i || num3 == i) {
                checkboxDemoApp.checkboxs().get(i).click();
            }
        }
    }
    public void chooseSelectCheckboxDemo(int num1, int num2, int num3, int num4) {
        String [] value = new String[checkboxDemoApp.checkboxs().size()];
        for (int i = 0; i<checkboxDemoApp.checkboxs().size(); i++) {
            value[i] = checkboxDemoApp.checkboxs().get(i).getText();
            if (num1 == i || num2 == i || num3 == i || num4 == i) {
                checkboxDemoApp.checkboxs().get(i).click();
            }
        }
    }
}
