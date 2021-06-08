package com.jeferson.tasks.table;

import com.jeferson.appobjects.table.TableFilterApp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TableFilterTask {
    private final WebDriver driver;
    private final TableFilterApp tableFilterApp;

    public TableFilterTask(WebDriver driver) {
        this.driver = driver;
        this.tableFilterApp = new TableFilterApp(driver);
    }

    public void filterRecordsCorButton(String valor) {
        if (valor.equals("green")) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", tableFilterApp.greenButton());
        } else if (valor.equals("orange")) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", tableFilterApp.orangeButton());
        } else if (valor.equals("red")) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", tableFilterApp.redButton());
        } else if (valor.equals("all")) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", tableFilterApp.allButton());
        }
    }

    public void filterRecordsGreenButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.greenButton());
    }

    public void filterRecordOrangeButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.orangeButton());
    }

    public void filterRecordsRedButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.redButton());
    }

    public void filterRecordsAllButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.allButton());
    }

    public void filterRecordsCheckbox(String tipos){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.checkboxAll().get(3));
        if (tipos.equals("all")) {
            for (int i = 0; i<tableFilterApp.checkboxAll().size(); i++){
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.checkboxAll().get(i));
            }
        } else {
            for (int i = 0; i<tableFilterApp.checkboxs(tipos).size(); i++){
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tableFilterApp.checkboxs(tipos).get(i));
            }
        }
    }
}
