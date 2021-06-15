package com.jeferson.tasks.alertsModals;

import com.jeferson.appobjects.alertsModals.WindowPopupModalApp;
import org.openqa.selenium.WebDriver;

public class WindowPopupModalTask {
    private final WebDriver driver;
    private final WindowPopupModalApp windowPopupModalApp;

    public WindowPopupModalTask(WebDriver driver) {
        this.driver = driver;
        this.windowPopupModalApp = new WindowPopupModalApp(driver);
    }

    public void singleWindowPopupTwitterOrFacebook(String text) {
        if (text.equals("twitter")) {
            windowPopupModalApp.followOnTwitterButton().click();
        } else if (text.equals("facebook")) {
            windowPopupModalApp.likeUsOnFacebookButton().click();
        }
    }

    public void multiWindowModalFollowTwitterAndFacebookOrFollowAll(String text) {
        if (text.equals("two")) {
            windowPopupModalApp.followTwitterAndFacebookButton().click();
        } else if (text.equals("all")) {
            windowPopupModalApp.followAllButton().click();
        }
    }
}
