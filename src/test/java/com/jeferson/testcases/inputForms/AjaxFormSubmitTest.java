package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.AjaxFormSubmitTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class AjaxFormSubmitTest extends BaseTest {

    private final HomeTask homeTask = new HomeTask(driver);
    private final AjaxFormSubmitTask ajaxFormSubmitTask = new AjaxFormSubmitTask(driver);

    @Test
    public void AjaxFormTest() {
        Report.createTest("Teste 'Ajax form submit with loading icon'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarAjaxFormSubmit();
        ajaxFormSubmitTask.ajaxForm();
    }
}
