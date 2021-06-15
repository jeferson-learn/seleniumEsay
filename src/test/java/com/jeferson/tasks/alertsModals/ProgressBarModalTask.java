package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.ProgressBarModalApp;
import org.openqa.selenium.WebDriver;

public class ProgressBarModalTask {
    private final WebDriver driver;
    private final ProgressBarModalApp progressBarModalApp;

    public ProgressBarModalTask(WebDriver driver) {
        this.driver = driver;
        this.progressBarModalApp = new ProgressBarModalApp(driver);
    }

    public void clickSimpleDialog() {
        progressBarModalApp.simpleDialogButton().click();
    }

    public void clickDialogMessage() {
        progressBarModalApp.dialogWithCustomMessageButton().click();
    }

    public void clickDialogSetting() {
        progressBarModalApp.dialogWithCustomSettingsButton().click();
    }
}
