package com.jeferson.testcases.table;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.table.TableDataDownloadTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class TableDataDownloadTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final TableDataDownloadTask tableDataDownloadTask = new TableDataDownloadTask(driver);

    @Test
    public void baixarTodosListaEscolheTipoArquivo(){
        String copy = "copy", csv = "csv", excel = "excel", pdf = "pdf", print = "print";
        Report.createTest("Teste 'Table search field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableDataDownload();
        tableDataDownloadTask.clickTypeDownload(excel);
    }

    @Test
    public void escolheOrdemBaixarTodosListaEscolheTipoArquivo(){
        String name = "name", position = "position", office = "office", age = "age", startDate = "start date", salary = "salary";
        String copy = "copy", csv = "csv", excel = "excel", pdf = "pdf", print = "print";
        Report.createTest("Teste 'Table search field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableDataDownload();
        tableDataDownloadTask.sortTable(age, copy);
    }

    @Test
    public void pesquisaCampoBaixarEscolheTipoArquivo(){
        String copy = "copy", csv = "csv", excel = "excel", pdf = "pdf", print = "print";
        Report.createTest("Teste 'Table search field'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarTableDataDownload();
        tableDataDownloadTask.searchDownload("Lon", copy);
    }
}
