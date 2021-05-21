package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.SimpleFormDemoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.jeferson.framework.tools.Report.extentTest;

public class SimpleFormDemoTest extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final HomeTask homeTask = new HomeTask(driver);
    private final SimpleFormDemoTask simpleFormDemoTask = new SimpleFormDemoTask(driver);

    @Test
    public void singleInputField(){
        Report.createTest("Teste 'Single input field");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSimpleFormDemo();
        simpleFormDemoTask.singleInputField("Teste");
    }

    @Test
    public void twoInputFields(){
        Report.createTest("Teste 'Two input fields");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSimpleFormDemo();
        simpleFormDemoTask.twoInputFields("15", "10");
    }
}
