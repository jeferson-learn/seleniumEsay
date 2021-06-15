package com.jeferson.testcases.alertsModals;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.alertsModals.WindowPopupModalTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class WindowPopupModalTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final WindowPopupModalTask windowPopupModalTask = new WindowPopupModalTask(driver);

    @Test
    public void singleWindowPopupTwitterOrFacebook() throws InterruptedException {
        String twitter = "twitter", facebook = "facebook";
        Report.createTest("Teste 'Single window popup to TWITTER or FACEBOOK'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarWindowPopup();
        windowPopupModalTask.singleWindowPopupTwitterOrFacebook(facebook);
        Thread.sleep(5000);
    }
    @Test
    public void multipleWindowModalTwitterAndFacebookOrFollowAll() throws InterruptedException {
        String two = "two", all = "all";
        Report.createTest("Teste 'Multiple window modal TWITTER and FACEBOOK or follow all ");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarWindowPopup();
        windowPopupModalTask.multiWindowModalFollowTwitterAndFacebookOrFollowAll(two);
        Thread.sleep(5000);
    }
}
