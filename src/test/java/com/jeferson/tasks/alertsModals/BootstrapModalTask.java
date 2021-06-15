package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.BootstrapModalApp;
import org.openqa.selenium.WebDriver;

public class BootstrapModalTask {
    private final WebDriver driver;
    private final BootstrapModalApp bootstrapModalApp;

    public BootstrapModalTask(WebDriver driver) {
        this.driver = driver;
        this.bootstrapModalApp = new BootstrapModalApp(driver);
    }

    public void singleModalCloseOrSave(String texto) {
        if (texto.equals("close")) {
            bootstrapModalApp.singleModalLaunchModalButton().click();
            bootstrapModalApp.singleModalCloseButton().click();
        } else if (texto.equals("save")) {
            bootstrapModalApp.singleModalLaunchModalButton().click();
            bootstrapModalApp.singleModalSaveChangesButton().click();
        }
    }

    public void multipleModalCloseOrSabe(String texto) {
        if (texto.equals("close")) {
            bootstrapModalApp.multipleModalLaunchModalButton().click();
            bootstrapModalApp.secondModalLaunchModalButton().click();
            bootstrapModalApp.secoundModalCloseButton().click();
        } else if (texto.equals("save")) {
            bootstrapModalApp.multipleModalLaunchModalButton().click();
            bootstrapModalApp.secondModalLaunchModalButton().click();
            bootstrapModalApp.secoundModalSaveButton().click();
        }

    }
}
