package com.jeferson.testcases.table;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.table.TableDataSearchTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class TableDataSearchTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final TableDataSearchTask tableDataSearchTask = new TableDataSearchTask(driver);

    @Test
    public void searchFilterTaskAssigneeStatusTest() {
        Report.createTest("Teste 'Type your search to filter by TASKS/ASSIGNEE/STATUS'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableDataSearch();
        tableDataSearchTask.tasksSearch("bootstrap");
    }
    @Test
    public void clickActivateFiltersAndFillField() throws InterruptedException {
        Report.createTest("Teste 'Click the filter icon to activate column filters inputs'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableDataSearch();
//        tableDataSearchTask.listedUsersNumber();
        tableDataSearchTask.listedUsersUsername();
//        tableDataSearchTask.listedUsersFirstName();
//        tableDataSearchTask.listedUsersLastName();
    }
}
