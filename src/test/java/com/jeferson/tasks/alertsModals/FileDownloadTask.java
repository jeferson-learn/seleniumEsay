package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.FileDownloadApp;
import org.openqa.selenium.WebDriver;

public class FileDownloadTask {
    private final WebDriver driver;
    private final FileDownloadApp fileDownloadApp;

    public FileDownloadTask(WebDriver driver) {
        this.driver = driver;
        this.fileDownloadApp = new FileDownloadApp(driver);
    }

    public void fillTextFiledAndGeneratedFileToDownload(String text) {
        fileDownloadApp.enterDataTextField().sendKeys(text);
        fileDownloadApp.generateFileButton().click();
        fileDownloadApp.downloadButton().click();
    }
}
