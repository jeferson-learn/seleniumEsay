package com.jeferson.testcases.datePickers;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.datePickers.BootstrapDatePickerTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class BootstrapDatePickerTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final BootstrapDatePickerTask bootstrapDatePickerTask = new BootstrapDatePickerTask(driver);

    @Test
    public void dateExampleTest() throws InterruptedException {
        Report.createTest("Teste 'Date example' preenche no campo");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapDatePicker();
//        Thread.sleep(3000);
        bootstrapDatePickerTask.dateExampleButton();
    }

    @Test
    public void dateRangeExampleTest() throws InterruptedException {
        Report.createTest("Teste 'Date range example' preenche no campo");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapDatePicker();
//        Thread.sleep(3000);
        bootstrapDatePickerTask.dateRangeExample();
    }
}
