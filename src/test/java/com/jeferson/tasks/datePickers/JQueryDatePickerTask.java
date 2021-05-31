package com.jeferson.tasks.datePickers;

import com.jeferson.appobjects.datePickers.JQueryDatePickerApp;
import org.openqa.selenium.WebDriver;

public class JQueryDatePickerTask {
    private final WebDriver driver;
    private final JQueryDatePickerApp jQueryDatePickerApp;

    public JQueryDatePickerTask(WebDriver driver) {
        this.driver = driver;
        this.jQueryDatePickerApp = new JQueryDatePickerApp(driver);
    }

    public void dateRangePickerFromTo() {
        jQueryDatePickerApp.fromTextField().sendKeys("10/10/2020");
        jQueryDatePickerApp.toTextField().sendKeys("25/12/2020");
    }
}
