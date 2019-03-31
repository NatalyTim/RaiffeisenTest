package autotest.pages;

import autotest.steps.BaseStep;
import autotest.util.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.Keys.TAB;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'helpers-params')]")
    private WebElement parentElementWait;

    @FindBy(xpath = "//h1[contains(text(), 'Ипотечный')]")
    private WebElement title;

    @FindBy(xpath = "//span[@id='form_city-button']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='form_is_program']//..//..")
    private WebElement checkBox;

    @FindBy(xpath = "//select[@id='form_program']/..")
    private WebElement typeOfProgram;

    @FindBy(xpath = "//span[@id='form_category-button']/../../..")
    private WebElement categoryButton;

    @FindBy(xpath = "//span[@id='form_documents-button']/..")
    private WebElement formDocuments;

    @FindBy(xpath = "//input[@id='form_credit_amount']")
    private WebElement creditAmount;

    @FindBy(xpath = "//input[@id='form_initial']")
    private WebElement formInitial;

    @FindBy(xpath = "//input[@id='form_period']")
    private WebElement creditPeriod;

    @FindBy(xpath = "//input[@class='button-invert']")
    private WebElement buttonPush;

    @FindBy(xpath = "//span[@class='monthly-payment']/..")
    private WebElement monthlyPayment;

    @FindBy(xpath = "//div[@class = 'b-calc-result__text--right total-payment']")
    private WebElement totalPayout;

    @FindBy(xpath = "//div[@class = 'b-calc-result__text--right percent-sum']")
    private WebElement amountOfInterestPayments;

    @FindBy(xpath = "//div[@class = 'b-calc-result__text--right interest-rate']")
    private WebElement rate;

    public void waitUntilNotLoading() {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(parentElementWait
                , "class", "loading")));
    }

    public void checkTitle(String titleName) throws Exception {
        compareText(title, titleName);
    }

    public void selectCity(String expectCity) throws Exception {
        String itemPath = "//li/div[contains(text(),\'" + expectCity + "\')]";
        waitUntilNotLoading();
        scrollToElement(city);
        waitVisible(city);
        clickDropDown(city, itemPath);
    }

    public void selectCheckBox() throws Exception {
        waitUntilNotLoading();
        scrollToElement(checkBox);
        clickElement(checkBox);
    }

    public void selectTypeOfProgram(String expectType) throws Exception {
        waitUntilNotLoading();
        String itemPath = "//div[contains(text(),\'" + expectType + "\')]";
        scrollToElement(typeOfProgram);
        waitClickable(typeOfProgram);
        clickDropDown(typeOfProgram, itemPath);
    }

    public void selectCategoryButton(String expectElement) throws Exception {
        waitUntilNotLoading();
        String itemPath = "//div[contains(text(),\"" + expectElement + "\")]";
        scrollToElement(categoryButton);
        clickDropDown(categoryButton, itemPath);
    }

    public void selectFormDocuments(String expectElement) throws Exception {
        waitUntilNotLoading();
        String itemPath = "//div[contains(text(),\""+ expectElement + "\")]/..";
        scrollToElement(formDocuments);
        clickDropDown(formDocuments, itemPath);
    }

    public void clickCreditAmount(String value) {
        waitUntilNotLoading();
        creditAmount.click();
        creditAmount.clear();
        creditAmount.sendKeys(value);
    }

    public void clickFormInitial(String value)throws Exception {
        waitUntilNotLoading();
        formInitial.click();
        pressCtrlA(formInitial);
        formInitial.sendKeys(value);
    }

    public void clickCreditPeriod(String value) {
        waitUntilNotLoading();
        creditPeriod.click();
        pressCtrlA(creditPeriod);
        creditPeriod.sendKeys(value);
    }

    public void clickButtonPush() throws Exception {
        waitUntilNotLoading();
        scrollToElement(buttonPush);
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("scrollBy(0, -250)");
        clickElement(buttonPush);
    }

    public void checkMonthlyPayment(String titleName) throws Exception {
       compareText(monthlyPayment, titleName);
    }

    public void checkTotalPayout(String titleName) throws Exception {
                compareText(totalPayout, titleName);
    }

    public void checkAmountOfInterestPayments(String titleName) throws Exception {
        compareText(amountOfInterestPayments, titleName);
    }

    public void checkRate(String titleName) throws Exception {
        compareText(rate, titleName);
    }

}
