package com.jeferson.tasks.table;

import com.jeferson.appobjects.table.TableDataDownloadApp;
import org.openqa.selenium.WebDriver;

public class TableDataDownloadTask {
    private final WebDriver driver;
    private final TableDataDownloadApp tableDataDownloadApp;

    public TableDataDownloadTask(WebDriver driver) {
        this.driver = driver;
        this.tableDataDownloadApp = new TableDataDownloadApp(driver);
    }

    public void clickTypeDownload(String type){
        if (type.equals("copy")){
            tableDataDownloadApp.copyButton().click();
        } else if (type.equals("csv")){
            tableDataDownloadApp.csvButton().click();
        } else if (type.equals("excel")){
            tableDataDownloadApp.excelButton().click();
        } else if (type.equals("pdf")){
            tableDataDownloadApp.pdfButton().click();
        } else if (type.equals("print")){
            tableDataDownloadApp.printButton().click();
        }
    }

    public void sortTable(String typeSort, String typeDownload){
        if (typeSort.equals("name")){
            tableDataDownloadApp.nameButton().click();
        } else if (typeSort.equals("position")){
            tableDataDownloadApp.positionButton().click();
        } else if (typeSort.equals("office")){
            tableDataDownloadApp.officeButton().click();
        } else if (typeSort.equals("age")){
            tableDataDownloadApp.ageButton().click();
        } else if (typeSort.equals("start date")){
            tableDataDownloadApp.startDateButton().click();
        } else if (typeSort.equals("salary")){
            tableDataDownloadApp.salaryButton().click();
        }
        clickTypeDownload(typeDownload);
    }

    public void searchDownload(String text, String typeDownload){
        tableDataDownloadApp.searchTextField().sendKeys(text);
        clickTypeDownload(typeDownload);
    }
}
