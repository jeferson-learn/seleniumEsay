package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.ProgressBarModalTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class ProgressBarModalTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final ProgressBarModalTask progressBarModalTask = new ProgressBarModalTask(driver);

    @Test
    public void modalDialogWithProgressBar() {
        Report.createTest("Teste 'Modal dialog with progress bar' ");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarProgressBarModal();
        progressBarModalTask.clickSimpleDialog();
        progressBarModalTask.clickDialogMessage();
        progressBarModalTask.clickDialogSetting();
    }
}
