package com.jeferson.tasks.progressBarsSliders;

import com.jeferson.appobjects.progressBarsSliders.BootstrapProgressBarApp;
import org.openqa.selenium.WebDriver;

public class BootstrapProgressBarTask {
    private final WebDriver driver;
    private final BootstrapProgressBarApp bootstrapProgressBarApp;

    public BootstrapProgressBarTask(WebDriver driver) {
        this.driver = driver;
        this.bootstrapProgressBarApp = new BootstrapProgressBarApp(driver);
    }

    public void downloadProgressPercentage() {
        bootstrapProgressBarApp.clickDownloadButton().click();
        while (true) {
            String text = bootstrapProgressBarApp.messagemPercentageText().getText();
            if (text.equals("100%")){
                System.out.println("COMPLETE!");
                break;
            }
        }
    }
}
