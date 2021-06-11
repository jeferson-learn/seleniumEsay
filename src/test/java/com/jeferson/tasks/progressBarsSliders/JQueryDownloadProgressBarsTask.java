package com.jeferson.tasks.progressBarsSliders;

import com.jeferson.appobjects.progressBarsSliders.JQueryDownloadProgressBarsApp;
import org.openqa.selenium.WebDriver;

public class JQueryDownloadProgressBarsTask {
    private final WebDriver driver;
    private final JQueryDownloadProgressBarsApp progressBarsApp;

    public JQueryDownloadProgressBarsTask(WebDriver driver) {
        this.driver = driver;
        this.progressBarsApp = new JQueryDownloadProgressBarsApp(driver);
    }

    public void clickStartDownload() {
        progressBarsApp.startDownloadButton().click();
        while (true){
            String text = progressBarsApp.messagemText().getText();
            if (text.equals("Complete!")){
                break;
            }
        }
        progressBarsApp.cancelDownloadORcloseButton();
    }
    public void clickCancelDownload() {
        progressBarsApp.startDownloadButton().click();
        progressBarsApp.cancelDownloadORcloseButton();
    }
}
