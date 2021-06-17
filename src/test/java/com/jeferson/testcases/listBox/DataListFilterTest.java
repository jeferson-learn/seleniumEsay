package com.jeferson.testcases.listBox;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.listBox.DataListFilterTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class DataListFilterTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final DataListFilterTask dataListFilterTask = new DataListFilterTask(driver);

    @Test
    public void dataListFilter(){
        Report.createTest("Teste 'Data list filter search attendess field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarDataListFilter();
        dataListFilterTask.searchAttendess("Brenda");
    }
}
