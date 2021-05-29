package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.JQuerySelectDropdownApp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class JQuerySelectDropdownTask {
    private final WebDriver driver;
    private final JQuerySelectDropdownApp jQuerySelectDropdownApp;

    public JQuerySelectDropdownTask(WebDriver driver) {
        this.driver = driver;
        this.jQuerySelectDropdownApp = new JQuerySelectDropdownApp(driver);
    }

    public void dropDownWithSearchBoxTextField(String name) {
        jQuerySelectDropdownApp.selectCountryClickSelect().click();
        jQuerySelectDropdownApp.selectCountryTextField().sendKeys(name + Keys.ENTER);
    }

    public void dropDownWithSearchBoxSelectList(int escolhido) {
        jQuerySelectDropdownApp.selectCountryClickSelect().click();
        int num = jQuerySelectDropdownApp.selectCountryListText().size();
        for (int i = 0; i<num; i++) {
            if (i==escolhido)
            jQuerySelectDropdownApp.selectCountryListText().get(i).click();
        }
    }

    public void selectMultipleValuesFillTextField() throws InterruptedException {
        jQuerySelectDropdownApp.selectStateTextField().sendKeys("colorado"+Keys.ENTER);
        jQuerySelectDropdownApp.selectStateTextField().sendKeys("alaska"+Keys.ENTER);
    }

    public void selectMultipleValuesClickTextField(int [] escolhidos) throws InterruptedException {
        System.out.println(jQuerySelectDropdownApp.selectStatesListText().size());
        for (int valor : escolhidos) {
            jQuerySelectDropdownApp.selectStateTextField().click();
            jQuerySelectDropdownApp.selectStatesListText().get(valor).click();
        }
    }
}
