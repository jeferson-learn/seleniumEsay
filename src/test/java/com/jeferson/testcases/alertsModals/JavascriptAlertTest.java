package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.JavascriptAlertTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class JavascriptAlertTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final JavascriptAlertTask javascriptAlertTask = new JavascriptAlertTask(driver);

    @Test
    public void javaScriptAlertBox() {
        Report.createTest("Teste 'JavaScript has three kind of popup boxes: Alert box'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJavascriptAlerts();
        javascriptAlertTask.clickButtonAlertBox();
    }

    @Test
    public void javaScriptConfirmBox() {
        String ok = "ok", cancel = "cancel";
        Report.createTest("Teste 'JavaScript has three kind of popup boxes: Confirm box");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJavascriptAlerts();
        javascriptAlertTask.clickButtonConfirmBox(ok);
    }

    @Test
    public void javaScriptAlertBoxPrompt() {
        Report.createTest("Teste 'JavaScript has three kind of popup boxes: Confirm box");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJavascriptAlerts();
        javascriptAlertTask.clickButtonAndFillPrompt("Jeferson");
    }
}
