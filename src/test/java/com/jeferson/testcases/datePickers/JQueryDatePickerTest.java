package com.jeferson.testcases.datePickers;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.datePickers.JQueryDatePickerTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class JQueryDatePickerTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final JQueryDatePickerTask jQueryDatePickerTask = new JQueryDatePickerTask(driver);

    @Test
    public void jQueryDatePickerTest() {
        Report.createTest("Teste 'Date range picker' preenche no campo");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryDatePicker();
        jQueryDatePickerTask.dateRangePickerFromTo();
    }

}

