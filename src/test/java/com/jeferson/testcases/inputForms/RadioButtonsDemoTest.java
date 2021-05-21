package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.RadioButtonsDemoTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class RadioButtonsDemoTest extends BaseTest {

    private final HomeTask homeTask = new HomeTask(driver);
    private final RadioButtonsDemoTask radioButtonsDemoTask = new RadioButtonsDemoTask(driver);

    @Test
    public void radioButtonDemoMale() {
        Report.createTest("Teste 'Radio buttons demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarRadioButtonsDemo();
        radioButtonsDemoTask.radioButtonDemoMale();
    }

    @Test
    public void radioButtonDemoFemale() {
        Report.createTest("Teste 'Radio buttons demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarRadioButtonsDemo();
        radioButtonsDemoTask.radioButtonDemoFemale();
    }
}
