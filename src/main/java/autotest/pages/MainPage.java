package autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class='main-menu']//li")
    private List<WebElement> mainMenu;

    public void clickMenuItem(String itemName) {
        selectMenuItem(mainMenu, itemName);
    }

}
