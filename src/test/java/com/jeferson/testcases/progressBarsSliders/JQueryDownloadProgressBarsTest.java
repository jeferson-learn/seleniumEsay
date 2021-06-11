package com.jeferson.testcases.progressBarsSliders;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.progressBarsSliders.JQueryDownloadProgressBarsTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class JQueryDownloadProgressBarsTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final JQueryDownloadProgressBarsTask progressBarsTask= new JQueryDownloadProgressBarsTask(driver);

    @Test
    public void downloadDialogComplete() {
        Report.createTest("Teste 'JQuery UI Progress bar - Download Dialog completo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryDownloadProgressBars();
        progressBarsTask.clickStartDownload();
    }

    @Test
    public void downloadDialogCancelDownload() {
        Report.createTest("Teste 'JQuery UI Progress bar - Download Dialog cancel'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryDownloadProgressBars();
        progressBarsTask.clickCancelDownload();
    }
}
