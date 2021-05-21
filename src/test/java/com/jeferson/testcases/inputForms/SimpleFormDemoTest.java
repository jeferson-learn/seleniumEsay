package com.jeferson.testcases;

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

public class InputFormsTest extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final HomeTask homeTask = new HomeTask(driver);
    private final SimpleFormDemoTask simpleFormDemoTask = new SimpleFormDemoTask(driver);

    @Test
    public void SimpleFormDemoTest(){
        Report.createTest("Teste 'Input Forms");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSimpleFormDemo();
        simpleFormDemoTask.singleInputField("Teste");
        simpleFormDemoTask.twoInputFields("15", "10");
    }
    
    @Test
    public void SimpleFormDemoTest(){
        Report.createTest("Teste 'Input Forms");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSimpleFormDemo();
        simpleFormDemoTask.singleInputField("Teste");
        simpleFormDemoTask.twoInputFields("15", "10");
    }
}
