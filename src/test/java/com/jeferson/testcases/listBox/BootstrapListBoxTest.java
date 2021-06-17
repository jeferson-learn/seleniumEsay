package com.jeferson.testcases.listBox;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.listBox.BootstrapListBoxTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class BootstrapListBoxTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final BootstrapListBoxTask bootstrapListBoxTask = new BootstrapListBoxTask(driver);

    @Test
    public void allSelectListBoxExample() {
        String right = "right", left = "left";
        Report.createTest("Teste 'Select all list box right to left or left to right example'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapListBox();
        bootstrapListBoxTask.selectAllToRightOrLeft(left);
    }

    @Test
    public void searchTextFiledListBoxExample() {
        String right = "right", left = "left";
        Report.createTest("Teste 'Search field left list box to right example'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarBootstrapListBox();
        bootstrapListBoxTask.searchTextFiled(right,"cras");
    }
}
