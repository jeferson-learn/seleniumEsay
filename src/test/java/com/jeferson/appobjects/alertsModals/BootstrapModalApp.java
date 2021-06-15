package com.jeferson.appobjects.alertsModals;

import com.jeferson.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapModalApp {
    private final WebDriver driver;
    private final Wait wait;

    public BootstrapModalApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public WebElement singleModalLaunchModalButton() {
        return driver.findElement(By.cssSelector("a[href='#myModal0']"));
    }
    public WebElement singleModalCloseButton(){
        wait.waitElementToBeClickable(By.cssSelector("#myModal0 a[data-dismiss='modal']"));
        return driver.findElement(By.cssSelector("#myModal0 a[data-dismiss='modal']"));
    }
    public WebElement singleModalSaveChangesButton(){
        wait.waitElementToBeClickable(By.cssSelector("#myModal0 .btn-primary"));
        return driver.findElement(By.cssSelector("#myModal0 .btn-primary"));
    }

    public WebElement multipleModalLaunchModalButton() {
        return driver.findElement(By.cssSelector("a[href='#myModal']"));
    }
    public WebElement secondModalLaunchModalButton() {
        wait.waitElementToBeClickable(By.cssSelector(".modal-body .btn-primary"));
        return driver.findElement(By.cssSelector(".modal-body .btn-primary"));
    }
    public WebElement secoundModalCloseButton() {
        wait.waitElementToBeClickable(By.cssSelector("#myModal2 .modal-footer a[class='btn']"));
        return driver.findElement(By.cssSelector("#myModal2 .modal-footer a[class='btn']"));
    }
    public WebElement secoundModalSaveButton() {
        wait.waitElementToBeClickable(By.cssSelector("#myModal2 .modal-footer a[class='btn btn-primary']"));
        return driver.findElement(By.cssSelector("#myModal2 .modal-footer a[class='btn btn-primary']"));
    }
}
