package com.jeferson.tasks.table;

import com.jeferson.appobjects.table.TablePaginationApp;
import org.openqa.selenium.WebDriver;

public class TablePaginationTask {
    private final WebDriver driver;
    private final TablePaginationApp tablePaginationApp;

    public TablePaginationTask(WebDriver driver) {
        this.driver = driver;
        this.tablePaginationApp = new TablePaginationApp(driver);
    }

    public void tablePrev() {
        tablePaginationApp.pageLinkPrev().click();
    }
    public void tablePage1() {
        tablePaginationApp.pageLink1().click();
    }
    public void tablePage2() {
        tablePaginationApp.pageLink2().click();
    }
    public void tablePage3() {
        tablePaginationApp.pageLink3().click();
    }
    public void tableNext() {
        tablePaginationApp.pageLinkNext().click();
    }
}
