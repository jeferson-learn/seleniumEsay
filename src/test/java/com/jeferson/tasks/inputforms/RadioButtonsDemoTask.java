package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.RadioButtonsDemoApp;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class RadioButtonsDemoTask {
    private final WebDriver driver;
    private final RadioButtonsDemoApp radioButtonsDemoApp;

    public RadioButtonsDemoTask(WebDriver driver) {
        this.driver = driver;
        this.radioButtonsDemoApp = new RadioButtonsDemoApp(driver);
    }

    public void radioButtonDemoMale() {
        String messageAtual = "Radio button 'Male' is checked";
        radioButtonsDemoApp.radioButtonDemoMale().click();
        radioButtonsDemoApp.getCheckedValueButton().click();
        String message = radioButtonsDemoApp.messagemRadioButton().getText();
        Assertions.assertEquals(message,messageAtual);
    }
    public void radioButtonDemoFemale() {
        String messageAtual = "Radio button 'Female' is checked";
        radioButtonsDemoApp.radioButtonDemoFemale().click();
        radioButtonsDemoApp.getCheckedValueButton().click();
        String message = radioButtonsDemoApp.messagemRadioButton().getText();
        Assertions.assertEquals(message,messageAtual);
    }
}
