package com.jeferson.testcases.progressBarsSliders;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.progressBarsSliders.DragDropSlidersTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class DragDropSlidersTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final DragDropSlidersTask dragDropSlidersTask = new DragDropSlidersTask(driver);

    @Test
    public void rangeSliders() {
        Report.createTest("Teste 'Range Sliders'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarDragDropSliders();
        dragDropSlidersTask.allRangesSliders();
    }
}
