package com.jeferson.testcases;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.Task;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.jeferson.framework.tools.Report.extentTest;

public class TestCase extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final Task task = new Task(driver);

    @Test /* opcional Junit ou TestNg */
    public void fulanoTituloTest(){
        Report.createTest("Nome de titulo para teste");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "google"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'FULANO'", Screenshot.screenshotBase64(driver));
        task.fulanoParteAcoes();
        extentTest.log(Status.INFO, "Finalmente de teste", Screenshot.screenshotBase64(driver));
    }
}
