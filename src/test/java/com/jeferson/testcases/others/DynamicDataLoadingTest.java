package com.jeferson.testcases.others;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.others.DynamicDataLoadingTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class DynamicDataLoadingTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final DynamicDataLoadingTask dynamicDataLoadingTask = new DynamicDataLoadingTask(driver);

    @Test
    public void getRandonUser() {
        Report.createTest("Teste 'Loading the data dynamically'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarDynamicDataLoading();
        dynamicDataLoadingTask.getRandomUser();
    }
}
