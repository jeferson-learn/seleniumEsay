package com.jeferson.tasks.others;

import com.jeferson.appobjects.others.DragAndDropApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.time.Duration;

public class DragAndDropTask {
    private final WebDriver driver;
    private final DragAndDropApp dragAndDropApp;

    public DragAndDropTask(WebDriver driver) {
        this.driver = driver;
        this.dragAndDropApp = new DragAndDropApp(driver);
    }

    public void drapToDrop() throws InterruptedException, AWTException {
        WebElement origem = dragAndDropApp.itemDraggable1Button();
        WebElement destino = dragAndDropApp.dropHereFiled();
//      --------------------------------------------------------------
//        Actions action = new Actions(driver);
//        action.dragAndDrop(origem, destino).build().perform();
//        action.dragAndDropBy(origem, 275, 64).build().perform();
        /** -------------------------------------------------------------------------- **/
//        Actions builder = new Actions(driver);
//        Action dragAndDrop = builder.clickAndHold(origem)
//                .moveToElement(destino)
//                .release(destino)
//                .build();
//        dragAndDrop.perform();
        /** -------------------------------------------------------------------------- **/
//        (new Actions(driver)).dragAndDrop(origem, destino).perform();
        /** -------------------------------------------------------------------------- **/
//        Actions action = new Actions(driver);
//        action.keyDown(Keys.CONTROL)
//                .click(origem)
//                .dragAndDrop(origem, destino())
//                .keyUp(Keys.CONTROL);
//        Action select = action.build();
//        select.perform();
        /** -------------------------------------------------------------------------- **/
//        Actions action = new Actions(driver);
//        action.clickAndHold(origem).pause(2000).moveToElement(destino)
//                .release().build().perform();
        /** -------------------------------------------------------------------------- **/
//        Actions action = new Actions(driver);
//        Action dragAndDrop =
//                action.clickAndHold(origem).moveToElement(destino).release(destino).build();
//        dragAndDrop.perform();
        /** -------------------------------------------------------------------------- **/
//        Point coordinates1 = origem.getLocation();
//        Point coordinates2 = destino.getLocation();
//        Robot robot = new Robot();
//        robot.mouseMove(coordinates1.getX(), coordinates1.getY());
//        robot.mousePress(InputEvent.BUTTON1_MASK);
//        robot.mouseMove(coordinates2.getX(), coordinates2.getY());
//        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        /** -------------------------------------------------------------------------- **/
        int x = destino.getLocation().x;
        int y = destino.getLocation().y;
        Actions actions = new Actions(driver);
        actions.moveToElement(origem)
                .pause(Duration.ofSeconds(1))
                .clickAndHold(origem)
                .pause(Duration.ofSeconds(1))
                .moveByOffset(x, y)
                .moveToElement(destino)
                .moveByOffset(x,y)
                .pause(Duration.ofSeconds(1))
                .release().build().perform();
    }
}
