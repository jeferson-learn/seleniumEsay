package com.jeferson.tasks.datePickers;

import com.jeferson.appobjects.datePickers.BootstrapDatePickerApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BootstrapDatePickerTask {
    private final WebDriver driver;
    private final BootstrapDatePickerApp bootstrapDatePickerApp;

    public BootstrapDatePickerTask(WebDriver driver) {
        this.driver = driver;
        this.bootstrapDatePickerApp = new BootstrapDatePickerApp(driver);
    }

    public void dateExampleField() {
        bootstrapDatePickerApp.selectDateTextField().sendKeys("25/05/2020");
    }
    public void dateExampleButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.click(bootstrapDatePickerApp.selectDateIconeButton()).build().perform();
//        bootstrapDatePickerApp.selectDateIconeButton().click();
        Thread.sleep(3000);
    }
    public void dateRangeExample() {
        bootstrapDatePickerApp.selectDateStartTextField().sendKeys("15/01/2020");
        bootstrapDatePickerApp.selectDateEndTextField().sendKeys("15/10/2020");
    }

}
