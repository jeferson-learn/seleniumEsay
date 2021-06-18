package com.jeferson.testcases.others;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.others.DragAndDropTask;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.jeferson.framework.tools.Report.extentTest;

public class DragAndDropTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final DragAndDropTask dragAndDropTask = new DragAndDropTask(driver);

    @Test
    public void dragAndDropForAutomation() throws InterruptedException, AWTException {
        Report.createTest("Teste 'Drag and drop'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarDragAndDrop();
        dragAndDropTask.drapToDrop();
        Thread.sleep(5000);
    }
}
