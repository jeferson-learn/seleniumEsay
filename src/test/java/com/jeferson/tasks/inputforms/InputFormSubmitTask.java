package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.InputFormSubmitApp;
import com.jeferson.framework.supports.Fakers;
import org.openqa.selenium.WebDriver;

public class InputFormSubmitTask {
    private final WebDriver driver;
    private final InputFormSubmitApp inputFormSubmitApp;
    private final Fakers fakers;

    public InputFormSubmitTask(WebDriver driver) {
        this.driver = driver;
        this.inputFormSubmitApp = new InputFormSubmitApp(driver);
        this.fakers = new Fakers();
    }

    public void contactUsToday() throws InterruptedException {
        inputFormSubmitApp.firstNameTextField().sendKeys(fakers.getFirstName());
        inputFormSubmitApp.lastNameTextField().sendKeys(fakers.getLastName());
        inputFormSubmitApp.emailTextField().sendKeys(fakers.getEmail());
        inputFormSubmitApp.phoneTextField().sendKeys(fakers.getPhone());
        inputFormSubmitApp.addressTextField().sendKeys(fakers.getAddress1());
        inputFormSubmitApp.cityTextField().sendKeys(fakers.getCity());
        inputFormSubmitApp.stateSelect().selectByVisibleText("Alaska");
        inputFormSubmitApp.zipCodeTextField().sendKeys(fakers.getPostalCode());
        inputFormSubmitApp.websiteTextField().sendKeys("www.google.com");
        for (int i = 0; i < inputFormSubmitApp.doYouHaveHostingRadio().size(); i++) {
            String valor = inputFormSubmitApp.doYouHaveHostingRadio().get(i).getText();
            if ("No".equals(valor)) {
                inputFormSubmitApp.doYouHaveHostingRadio().get(i).click();
            }
        }
        inputFormSubmitApp.projectDescriptionTextField().sendKeys("descricao de teste");
        inputFormSubmitApp.sendButton().click();
    }
}
