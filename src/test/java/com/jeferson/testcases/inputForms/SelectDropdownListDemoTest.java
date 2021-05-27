package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.SelectDropdownListDemoTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class SelectDropdownListDemoTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final SelectDropdownListDemoTask selectDropdownListDemoTask = new SelectDropdownListDemoTask(driver);

    @Test
    public void selectListDemoTest() {
        Report.createTest("Teste 'Select list demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSelectDropdownList();
        selectDropdownListDemoTask.selectListDemo("Friday");
    }

    @Test
    public void multiSelectListDemoTest() throws InterruptedException {
        Report.createTest("Teste 'Multi select list demo'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarSelectDropdownList();
//        selectDropdownListDemoTask.multiSelectListDemo();
        selectDropdownListDemoTask.teste();
    }

}
