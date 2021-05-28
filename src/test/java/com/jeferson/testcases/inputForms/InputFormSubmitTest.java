package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.InputFormSubmitTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class InputFormSubmitTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final InputFormSubmitTask inputFormSubmitTask = new InputFormSubmitTask(driver);

    @Test
    public void inputFormSubmitTest() throws InterruptedException {
        Report.createTest("Teste 'Input form submit'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarInputFormSubmit();
        inputFormSubmitTask.contactUsToday();
    }
}
