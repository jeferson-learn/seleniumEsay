package com.jeferson.testcases.table;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.table.TableFilterTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class TableFilterTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final TableFilterTask tableFilterTask = new TableFilterTask(driver);

    @Test
    public void chooseColorTableFilterTest() {
        String green = "green", orange = "orange", red = "red", all = "all";
        Report.createTest("Teste 'Click on green/orange/red to filter OR click on all to view all records'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableFilter();
        tableFilterTask.filterRecordsCorButton(red);
    }

    /** Escolhe um cor (green(verde), orange(laranja) e red(vermelho) ou all(tudo))
     * se for escolhe um cor e vai marcar todos checkbox que escolheu cor
     **/
    @Test
    public void chooseCheckboxTableFilterTest() {
        String green = "pagado", orange = "pendiente", red = "cancelado", all = "all";
        Report.createTest("Teste ''");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableFilter();
        tableFilterTask.filterRecordsCheckbox(red);
    }
}
