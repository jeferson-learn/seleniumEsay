package com.jeferson.tasks.inputforms;

import com.jeferson.appobjects.inputforms.SelectDropdownListDemoApp;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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

    public void multiSelectListDemo(int num, String text) {
        if (1 == num) {
            selectDropdownListDemoApp.multiSelectListDemoSelect().selectByValue(text);
            selectDropdownListDemoApp.firstSelectedButton().click();
        }
        if (2 <= num && 8 >= num) {

        }
        selectDropdownListDemoApp.multiSelectListDemoSelect().selectByValue("California");
        selectDropdownListDemoApp.multiSelectListDemoSelect().selectByValue("New York");
        selectDropdownListDemoApp.multiSelectListDemoSelect().selectByValue("Washington");
    }

    public void teste() throws InterruptedException {
        String[] value = new String[selectDropdownListDemoApp.listValueSelect().size()];
        int[] random = new int[2];
        Actions actions = new Actions(driver);
        for (int i = 0; i < value.length; i++) {
            value[i] = selectDropdownListDemoApp.listValueSelect().get(i).getText();
        }
        for (int i = 0; i < random.length; i++) {
            int random_int = (int) Math.floor(Math.random() * (7 - 2 + 1) + 2);
            System.out.println("sorteio: " + random_int);
            random[i] = random_int;
            System.out.println("array: " + random[i]);
            actions.keyDown(Keys.LEFT_CONTROL)
                    .click(selectDropdownListDemoApp.listValueSelect().get(random[i]))
                    .keyUp(Keys.LEFT_CONTROL)
                    .build()
                    .perform();
            Thread.sleep(2000);
        }
        selectDropdownListDemoApp.getAllSelectedButton().click();
        Thread.sleep(2000);
    }


}
