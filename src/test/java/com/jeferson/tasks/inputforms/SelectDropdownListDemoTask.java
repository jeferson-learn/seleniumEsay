package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.SelectDropdownListDemoApp;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.core.StringContains.containsString;

public class SelectDropdownListDemoTask {
    private final WebDriver driver;
    private final SelectDropdownListDemoApp selectDropdownListDemoApp;

    public SelectDropdownListDemoTask(WebDriver driver) {
        this.driver = driver;
        this.selectDropdownListDemoApp = new SelectDropdownListDemoApp(driver);
    }

    public void selectListDemo(String text) {
        selectDropdownListDemoApp.selectListDemoSelect().selectByValue(text);
        String messagem = selectDropdownListDemoApp.messagemDaySelectText().getText();
        System.out.println(messagem);
        MatcherAssert.assertThat(messagem, containsString(text));
    }

    public void multiSelectListFirstSelect(String select) {
        selectDropdownListDemoApp.multiSelectListDemoSelect().selectByVisibleText(select);
        selectDropdownListDemoApp.firstSelectedButton().click();
    }

    public void multiSelectListGetAllSelect(String[] list) {
        String[] value = new String[selectDropdownListDemoApp.listValueSelect().size()];
        for (int i = 0; i < value.length; i++) {
            value[i] = selectDropdownListDemoApp.listValueSelect().get(i).getText();
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < value.length; j++) {
                if (list[i].equals(value[j])) {
                    String valor = list[i];
                    selectDropdownListDemoApp.multiSelectListDemoSelect().selectByVisibleText(valor);
                }
            }
        }
        selectDropdownListDemoApp.getAllSelectedButton().click();
    }
}