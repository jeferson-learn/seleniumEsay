package com.jeferson.tasks.table;

import com.jeferson.appobjects.table.TableDataSearchApp;
import org.openqa.selenium.WebDriver;

public class TableDataSearchTask {
    private final WebDriver driver;
    private final TableDataSearchApp tablePaginationApp;

    public TableDataSearchTask(WebDriver driver) {
        this.driver = driver;
        this.tablePaginationApp = new TableDataSearchApp(driver);
    }

    public void tasksSearch(String text) {
        tablePaginationApp.tasksTextField().sendKeys(text);
    }
    public void listedUsersFilter(){
            tablePaginationApp.filterButton().click();
            System.out.println("clicou botao filter");
    }
    public void listedUsersNumber() {
        listedUsersFilter();
        tablePaginationApp.numberTextFiled().sendKeys("3");
    }
    public void listedUsersUsername() throws InterruptedException {
        listedUsersFilter();
        Thread.sleep(2000);
        tablePaginationApp.userNameTextFiled().sendKeys("Mike");
    }
    public void listedUsersFirstName(){
        listedUsersFilter();
        tablePaginationApp.firstNameTextField().sendKeys("By");
    }
    public void listedUsersLastName(){
        listedUsersFilter();
        tablePaginationApp.LastNameTextField().sendKeys("Swa");
    }
}
