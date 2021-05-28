package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.AjaxFormSubmitApp;
import com.jeferson.framework.supports.Fakers;
import org.openqa.selenium.WebDriver;

public class AjaxFormSubmitTask {
    private final WebDriver driver;
    private final AjaxFormSubmitApp ajaxFormSubmitApp;
    private final Fakers fakers;

    public AjaxFormSubmitTask(WebDriver driver) {
        this.driver = driver;
        this.ajaxFormSubmitApp = new AjaxFormSubmitApp(driver);
        this.fakers = new Fakers();
    }

    public void ajaxForm() {
        String messagem = "Form submited Successfully!";
        ajaxFormSubmitApp.nameTextField().sendKeys(fakers.getFullName());
        ajaxFormSubmitApp.commentTextField().sendKeys("Teste de mensagem");
        ajaxFormSubmitApp.submitButton().click();
        while (true) {
            if (messagem.equals(ajaxFormSubmitApp.formsubmitedSuccessfullyText().getText())) {
                System.out.println("Enviou com sucesso");
                break;
            }
        }

    }
}
