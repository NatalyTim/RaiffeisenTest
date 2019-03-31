package autotest.steps;

import autotest.pages.MortgagePage;
import cucumber.api.java.en.When;

public class MortgageStep {
    private MortgagePage mortgagePage = new MortgagePage();

    @When("Выбран подпункт меню \"(.*)\"")
    public void selectSubMenu(String itemName) {
        System.out.println("2.1.Выбран подпункт меню Ипотечный калькулятор");
        mortgagePage.clickMenuItem(itemName);
    }
}
