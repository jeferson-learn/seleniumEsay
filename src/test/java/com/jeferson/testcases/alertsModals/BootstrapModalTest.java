package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.BootstrapModalTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class BootstrapModalTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final BootstrapModalTask bootstrapModalTask = new BootstrapModalTask(driver);

    @Test
    public void singleModalCloseOrSave() {
        String close = "close", save = "save";
        Report.createTest("Teste 'Bootstrap single modal close or save'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapModals();
        bootstrapModalTask.singleModalCloseOrSave(save);
    }

    @Test
    public void multipleModalCloseOrSave() {
        String close = "close", save = "save";
        Report.createTest("Teste 'Bootstrap multiple modal close or save'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapModals();
        bootstrapModalTask.multipleModalCloseOrSabe(close);
    }
}
