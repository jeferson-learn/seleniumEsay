package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.BootstrapAlertsApp;
import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.WebDriver;

public class BootstrapAlertsTask {
    private final WebDriver driver;
    private final BootstrapAlertsApp bootstrapAlertsApp;
    private final Wait wait;

    public BootstrapAlertsTask(WebDriver driver) {
        this.driver = driver;
        this.bootstrapAlertsApp = new BootstrapAlertsApp(driver);
        this.wait = new Wait(driver);
    }

    public void autoCloseableTypeStatus() {
//        WebDriverWait wait = new WebDriverWait(driver,20);
        bootstrapAlertsApp.autoCloseableSuccessButton().click();
//        wait.until(ExpectedConditions.stalenessOf(bootstrapAlertsApp.autoCloseableSuccessMessageText()));
//        wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(bootstrapAlertsApp.autoCloseableSuccessMessageText().isDisplayed());
//        if (bootstrapAlertsApp.autoCloseableSuccessMessageText().isDisplayed()){
//            System.out.println("Dentro");
//        }
//        bootstrapAlertsApp.autoCloseableSuccessMessageText();
//        bootstrapAlertsApp.autoCloseableWarningButton().click();
//        bootstrapAlertsApp.autoCloseableDangerButton().click();
//        bootstrapAlertsApp.autoCloseableInfoButton().click();
    }

    public void normalMessageCloseTypeStatus(String text) {
        if (text.equals("success")){
            bootstrapAlertsApp.normalSuccessButton().click();
            bootstrapAlertsApp.normalSuccessMessageCloseButton().click();
        } else if (text.equals("warning")) {
            bootstrapAlertsApp.normalWarningButton().click();
            bootstrapAlertsApp.normalWarningMessageCloseButton().click();
        } else if (text.equals("danger")) {
            bootstrapAlertsApp.normalDangerButton().click();
            bootstrapAlertsApp.normalDangerMessageCloseButton().click();
        } else if (text.equals("info")) {
            bootstrapAlertsApp.normalInfoButton().click();
            bootstrapAlertsApp.normalInfoMessageCloseButton().click();
        }
    }
}
