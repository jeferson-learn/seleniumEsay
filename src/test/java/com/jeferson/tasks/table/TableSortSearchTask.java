package com.jeferson.tasks.table;

import com.jeferson.appobjects.table.TableSortSearchApp;
import org.openqa.selenium.WebDriver;

public class TableSortSearchTask {
    private final WebDriver driver;
    private final TableSortSearchApp tableSortSearchApp;

    public TableSortSearchTask(WebDriver driver) {
        this.driver = driver;
        this.tableSortSearchApp = new TableSortSearchApp(driver);
    }

    public void showEntries(String num) {
        tableSortSearchApp.showEntriesPaginaSelect().selectByValue(num);
    }

    public void search(String text) {
        tableSortSearchApp.searchTextField().sendKeys(text);
    }

    public void clickColumn(String type) {
        if (type.equals("name")){
            tableSortSearchApp.nameButton().click();
        } else if (type.equals("position")){
            tableSortSearchApp.positionButton().click();
        } else if (type.equals("office")){
            tableSortSearchApp.officeButton().click();
        } else if (type.equals("age")){
            tableSortSearchApp.ageButton().click();
        } else if (type.equals("start date")){
            tableSortSearchApp.startDateButton().click();
        } else if (type.equals("salary")){
            tableSortSearchApp.salaryButton().click();
        }
    }
}
