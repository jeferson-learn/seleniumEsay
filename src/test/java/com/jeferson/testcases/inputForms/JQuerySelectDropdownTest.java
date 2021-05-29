package com.jeferson.testcases.inputForms;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.HomeTask;
import com.jeferson.tasks.inputforms.JQuerySelectDropdownTask;
import org.junit.jupiter.api.Test;

import static com.jeferson.framework.tools.Report.extentTest;

public class JQuerySelectDropdownTest extends BaseTest {
    private final HomeTask homeTask = new HomeTask(driver);
    private final JQuerySelectDropdownTask jQuerySelectDropdownTask = new JQuerySelectDropdownTask(driver);

    @Test
    public void singleSelect_SearchCountry() {
        Report.createTest("Teste 'JQuery select dropdown with search'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQuerySelectDropdown();
        jQuerySelectDropdownTask.dropDownWithSearchBoxTextField("Japan");
    }
    /** 'Escolhido'
     * 0 - vazio
     * 1 - Australia
     * 2 - Bangladesh
     * 3 - Denmark
     * 4 - Hong Kong
     * 5 - India
     * 6 - Japan
     * 7 - Netherlands
     * 8 - New Zealand
     * 9 - South Africa
     * 10 - United States of America
     */
    @Test
    public void singleSelect_SelectCountry() {
        Report.createTest("Teste 'JQuery select dropdown only click list'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQuerySelectDropdown();
        jQuerySelectDropdownTask.dropDownWithSearchBoxSelectList(8);
    }

    @Test
    public void multiSelect_SearchMultipleStates() throws InterruptedException {
        Report.createTest("Teste 'JQuery select multiple values with search'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQuerySelectDropdown();
        jQuerySelectDropdownTask.selectMultipleValuesFillTextField();
    }

    /** 'Escolhido'
     0 - Alabama, 1 - Alaska, 2 - Arizona, 3 - Arkansas, 4 - California, 5 - Colorado, 6 - Connecticut
     7 - Delaware, 8 - District Of Columbia, 9 - Florida, 10 - Georgia, 11 - Hawaii, 12 - Idaho, 13 - Illinois
     14 - Indiana, 15 - Iowa, 16 - Kansas, 17 - Kentucky, 18 - Louisiana, 19 - Maine, 20 - Maryland, 21 - Massachusetts
     22 - Michigan, 23 - Minnesota, 24 - Mississippi, 25 - Missouri, 26 - Montana, 27 - Nebraska, 28 - Nevada
     29 - New Hampshire, 30 - New Jersey, 31 - New Mexico, 32 - New York, 33 - North Carolina, 34 - North Dakota
     35 - Ohio, 36 - Oklahoma, 37 - Oregon, 38 - Pennsylvania, 39 - Rhode Island, 40 - South Carolina, 41 - South Dakota
     42 - Tennessee, 43 - Texas, 44 - Utah, 45 - Vermont, 46 - Virginia, 47 - Washington, 48 - West Virginia,
     49 - Wisconsin, 50 - Wyoming
     */
    @Test
    public void multiSelect_SelectMultipleStates() throws InterruptedException {
        Report.createTest("Teste 'JQuery select multiple values with search'");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "seleniumEasy"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'SELENIUM EASY'", Screenshot.screenshotBase64(driver));
        homeTask.entrarJQuerySelectDropdown();
        jQuerySelectDropdownTask.selectMultipleValuesClickTextField(new int[]{0,25,50});
    }
}
