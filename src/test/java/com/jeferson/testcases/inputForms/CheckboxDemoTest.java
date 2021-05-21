package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.CheckboxDemoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.jeferson.framework.tools.Report.extentTest;

public class CheckboxDemoTest extends BaseTest {

    private final HomeTask homeTask = new HomeTask(driver);
    private final CheckboxDemoTask checkboxDemoTask = new CheckboxDemoTask(driver);

    @Test
    public void singleCheckboxDemo() {
        Report.createTest("Teste 'Single checkbox demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarCheckboxDemo();
        checkboxDemoTask.singleCheckboxDemo();
    }

    @Test
    public void multipleCheckboxDemo() {
        Report.createTest("Teste 'Multiple checkbox demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarCheckboxDemo();
        checkboxDemoTask.multipleCheckboxDemo();
    }
}
