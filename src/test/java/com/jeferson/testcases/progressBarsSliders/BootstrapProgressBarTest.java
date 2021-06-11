package com.jeferson.testcases.progressBarsSliders;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.progressBarsSliders.BootstrapProgressBarTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class BootstrapProgressBarTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final BootstrapProgressBarTask bootstrapProgressBarTask = new BootstrapProgressBarTask(driver);

    @Test
    public void progressBarForDownload() {
        Report.createTest("Teste 'Stylish progress bar demo for the automation'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapProgressBar();
        bootstrapProgressBarTask.downloadProgressPercentage();
    }
}
