package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.RadioButtonsDemoApp;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.core.StringContains.containsString;

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
    public void radioButtonsDemoSex(String opcoes) {
        for (int x = 0; x < radioButtonsDemoApp.radioSex().size(); x++) {
            String value = radioButtonsDemoApp.radioSex().get(x).getAttribute("value");
            if (opcoes.equals(value)) {
                String message = "Radio button '" + value + "' is checked";
                radioButtonsDemoApp.radioSex().get(x).click();
                radioButtonsDemoApp.getCheckedValueButton().click();
                String messageAtual = radioButtonsDemoApp.messagemRadioButton().getText();
                Assertions.assertEquals(message, messageAtual);
            }
        }

        /**--------------------------------------------------------**/

//        if (opcoes.equals("male")) {
//            String messageAtual = "Radio button 'Male' is checked";
//            radioButtonsDemoApp.radioButtonDemoMale().click();
//            radioButtonsDemoApp.getCheckedValueButton().click();
//            String message = radioButtonsDemoApp.messagemRadioButton().getText();
//            Assertions.assertEquals(message,messageAtual);
//        } else if (opcoes.equals("female")) {
//            String messageAtual = "Radio button 'Female' is checked";
//            radioButtonsDemoApp.radioButtonDemoFemale().click();
//            radioButtonsDemoApp.getCheckedValueButton().click();
//            String message = radioButtonsDemoApp.messagemRadioButton().getText();
//            Assertions.assertEquals(message,messageAtual);
//        }
    }
    public void groupRadioButtonDemoSexAge(String opcoes, int num) {
        for (int x = 0; x < radioButtonsDemoApp.gruopRadioSex().size(); x++) {
            String value = radioButtonsDemoApp.gruopRadioSex().get(x).getAttribute("value");
            if (opcoes.equals(value)) {
                radioButtonsDemoApp.gruopRadioSex().get(x).click();
            }
        }

        String [] value = new String[radioButtonsDemoApp.gruopRadioAge().size()];
        for (int x = 0 ; x < radioButtonsDemoApp.gruopRadioAge().size(); x++) {
            value[x] = radioButtonsDemoApp.gruopRadioAge().get(x).getAttribute("value");
        }
        for (String valor : value) {
            if (valor.equals(value[num])) {
                radioButtonsDemoApp.gruopRadioAge().get(num).click();
            }
        }
        radioButtonsDemoApp.getValuesButton().click();
        String message = opcoes + "\nAge group: " + value[num];
        String messageAtual = radioButtonsDemoApp.messagemSexAge().getText();
        MatcherAssert.assertThat(messageAtual, containsString(message));
    }
}
