package autotest.steps;

import autotest.pages.MainPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class MainStep {

    private MainPage mainPage = new MainPage();

    @When("Выбран пункт меню \"(.*)\"")
    public void selectMenu(String nameMenu) {
        System.out.println("2.Выбран пункт меню");
        mainPage.clickMenuItem(nameMenu);
    }

}
