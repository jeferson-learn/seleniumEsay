package com.jeferson.testcases.table;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.table.TablePaginationTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class TablePaginationTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final TablePaginationTask tablePaginationTask = new TablePaginationTask(driver);

    @Test
    public void tableWithPaginationPrevLink123NextTest() {
        Report.createTest("Teste 'Table with pagination to next'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTablePagination();
        tablePaginationTask.tableNext();
        tablePaginationTask.tableNext();
        tablePaginationTask.tablePage1();
        tablePaginationTask.tablePage2();
        tablePaginationTask.tablePrev();
        tablePaginationTask.tablePage3();
    }
}
