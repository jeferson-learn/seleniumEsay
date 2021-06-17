package com.jeferson.testcases.listBox;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.listBox.JQueryListBoxTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class JQueryListBoxTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final JQueryListBoxTask jQueryListBoxTask = new JQueryListBoxTask(driver);

    @Test
    public void jQueryPickListBoxToAdd() {
        Report.createTest("Teste 'JQuery pick value list add to other list'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryListBox();
        jQueryListBoxTask.pickListValueToAdd("Julia");
    }

    @Test
    public void jQueryPickMultipleListBoxToAdd() {
        String [] names = {"Lara", "Luiza", "Laura"};
        Report.createTest("Teste 'JQuery pick multiple list add to other list'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryListBox();
        jQueryListBoxTask.pickMultipleListValueToAdd(names);
    }

    @Test
    public void jQueryListBoxAddAll() {
        Report.createTest("Teste 'JQuery list add all to other list'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQueryListBox();
        jQueryListBoxTask.pickListAddAll();
    }
}
