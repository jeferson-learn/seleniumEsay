package com.jeferson.tasks.progressBarsSliders;

import com.jeferson.appobjects.progressBarsSliders.DragDropSlidersApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropSlidersTask {
    private final WebDriver driver;
    private final DragDropSlidersApp dragDropSlidersApp;

    public DragDropSlidersTask(WebDriver driver) {
        this.driver = driver;
        this.dragDropSlidersApp = new DragDropSlidersApp(driver);
    }

    public void allRangesSliders() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersGray(), 15,0).build().perform();
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersGreen(), 50,0).build().perform();
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersOrange(), 0,0).build().perform();
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersDarkBlue(), -90,0).build().perform();
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersLightBlue(), -50,0).build().perform();
        actions.dragAndDropBy(dragDropSlidersApp.rangeSlidersRed(), 90,0).build().perform();
    }
}
