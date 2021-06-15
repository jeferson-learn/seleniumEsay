package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.BootstrapAlertsTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class BootstrapAlertsTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final BootstrapAlertsTask bootstrapAlertsTask = new BootstrapAlertsTask(driver);

    @Test
    public void bootstrapAlertMessagesAutoClose() {
        Report.createTest("Teste 'Bootstrap alert messages auto close'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapAlerts();
        bootstrapAlertsTask.autoCloseableTypeStatus();
    }
    @Test
    public void bootstrapAlertMessagesCloseButton() throws InterruptedException {
        String success = "success", warning = "warning", danger = "danger", info = "info";
        Report.createTest("Teste 'Bootstrap alert messages click to close'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapAlerts();
        bootstrapAlertsTask.normalMessageCloseTypeStatus(success);
    }
}
