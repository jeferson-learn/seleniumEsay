package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.FileDownloadTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class FileDownloadTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final FileDownloadTask fileDownloadTask = new FileDownloadTask(driver);

    @Test
    public void fileDownloadDemoForAutomation() {
        Report.createTest("Teste 'JavaScript has three kind of popup boxes: Confirm box");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarFileDownload();
        fileDownloadTask.fillTextFiledAndGeneratedFileToDownload("Boa tarde, eu sou atletas do The Guris.");
    }
}
