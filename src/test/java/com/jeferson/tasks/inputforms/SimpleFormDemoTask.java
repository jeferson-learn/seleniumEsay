package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.HomeApp;
import com.jeferson.appobjects.inputforms.SimpleFormDemoApp;
import com.jeferson.tasks.HomeTask;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoTask {
    private final WebDriver driver;
    private final HomeApp homeApp;
    private final HomeTask homeTask;
    private final SimpleFormDemoApp simpleFormDemoApp;

    public SimpleFormDemoTask(WebDriver driver) {
        this.driver = driver;
        homeApp = new HomeApp(driver);
        homeTask = new HomeTask(driver);
        simpleFormDemoApp = new SimpleFormDemoApp(driver);
    }

    public void singleInputField(String text) {
        simpleFormDemoApp.enterMessageTextField().sendKeys(text);
        simpleFormDemoApp.showMessageButton().click();
        Assertions.assertEquals(text, simpleFormDemoApp.yourMessageText().getText());
        Assertions.assertTrue(text.equals(simpleFormDemoApp.yourMessageText().getText()));
    }

    public void twoInputFields(String a, String b) {
        simpleFormDemoApp.enterATextField().sendKeys(a);
        simpleFormDemoApp.enterBTextField().sendKeys(b);
        simpleFormDemoApp.getTotalButton().click();
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        Assertions.assertEquals(Integer.toString(numA+numB) , simpleFormDemoApp.totalText().getText());
    }

    public SimpleFormDemoTask singleInputFieldR(String texto) {
        homeTask.entrarSimpleFormDemo();
        String url = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
        Assertions.assertEquals(url, driver.getCurrentUrl());
        simpleFormDemoApp.enterMessageTextField().sendKeys(texto);
        simpleFormDemoApp.showMessageButton().click();
        Assertions.assertEquals(texto, simpleFormDemoApp.yourMessageText().getText());
        return this;
    }

}
