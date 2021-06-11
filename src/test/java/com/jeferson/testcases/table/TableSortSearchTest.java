package com.jeferson.testcases.table;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.table.TableSortSearchTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class TableSortSearchTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final TableSortSearchTask tableSortSearchTask = new TableSortSearchTask(driver);

    @Test
    public void numeroMostraLista() {
        String ten = "10", twentyFive = "25", fifty = "50", oneHundred = "100";
        Report.createTest("Teste 'Table show list'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableSortSearch();
        tableSortSearchTask.showEntries(oneHundred);
    }

    @Test
    public void pesquisaCampo() {
        Report.createTest("Teste 'Table search field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableSortSearch();
        tableSortSearchTask.search("satou");
    }

    @Test
    public void clicarTipos() {
        String name = "name", position = "position", office = "office", age = "age", startDate = "start date", salary = "salary";
        Report.createTest("Teste 'Table search field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableSortSearch();
        tableSortSearchTask.clickColumn(position);
    }
}
