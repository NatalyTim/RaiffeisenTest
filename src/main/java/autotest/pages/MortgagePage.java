package autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MortgagePage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'Ипотечный')]")
    private WebElement firstElement;

    @FindBy(xpath = "//a[contains(text(), 'Ипотечный')]//../a")
    private List<WebElement> menuItems;

    public void clickMenuItem(String itemName){
        waitVisible(firstElement);
        selectMenuItem(menuItems,itemName);
    }


}
