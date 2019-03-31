package autotest.steps;

import autotest.pages.CalculatorPage;
import cucumber.api.java.en.When;

public class CalculatorStep {

    CalculatorPage calculatorPage = new CalculatorPage();

    @When("Проверяем наличие заголовка \"(.*)\"")
    public void checkTitleName(String titleName) throws Exception {
        System.out.println("3.Проверяем наличие заголовка");
        calculatorPage.checkTitle(titleName);
    }

    @When("Заполняем город \"(.*)\"")
    public void selectCity(String cityName) throws Exception {
        System.out.println("4.0 Заполняем город " + cityName);
        calculatorPage.selectCity(cityName);
    }

    @When("Заполнить чекбокс")
    public void pushCheckBox() throws Exception {
        System.out.println("4.1.Заполнить чекбокс");
        calculatorPage.selectCheckBox();
    }

    @When("Вид ипотечной программы \"(.*)\"")
    public void selectTypeOfProgram(String typeOfMortgage) throws Exception {
        System.out.println("4.2 Вид ипотечной программы ");
        calculatorPage.selectTypeOfProgram(typeOfMortgage);
    }

    @When("Я являюсь \"(.*)\"")
    public void selectCategoryClient(String categoryClient) throws Exception {
        System.out.println("4.3 Я являюсь ");
        calculatorPage.selectCategoryButton(categoryClient);
    }

    @When("Уровень дохода подтверждаю \"(.*)\"")
    public void selectFormDocuments(String typeOfFormDocuments) throws Exception {
        System.out.println("4.4 Справка по форме банка ");
        calculatorPage.selectFormDocuments(typeOfFormDocuments);
    }

    @When("В банке возьму \"(.*)\"")
    public void selectСreditAmount(String value) throws Exception {
        System.out.println("4.5 В банке возьму ");
        calculatorPage.clickCreditAmount(value);
    }

    @When("Первоначальный взнос \"(.*)\"")
    public void selectFormInitial(String value) throws Exception {
        System.out.println("4.6 Первоначальный взнос ");
        calculatorPage.clickFormInitial(value);
    }

    @When("Срок кредита \"(.*)\"")
    public void selectCreditPeriod(String period) throws Exception {
        System.out.println("4.7 Срок кредита " + period);
        calculatorPage.clickCreditPeriod(period);
    }

    @When("Нажать кнопку рассчитать")
    public void selectButtonPush() throws Exception {
        System.out.println("5. Нажать кнопку рассчитать ");
        calculatorPage.clickButtonPush();
    }

    @When("Проверяем ежемесячный платеж \"(.*)\"")
    public void checkMonthlyPayment(String payment) throws Exception {
        System.out.println("6.0.Проверяем ежемесячный платеж");
        calculatorPage.checkMonthlyPayment(payment);
    }

    @When("Проверяем общую сумму выплат \"(.*)\"")
    public void checkTotalPayout(String pay) throws Exception {
        System.out.println("6.1.Проверяем общую сумму выплат");
        calculatorPage.checkTotalPayout(pay);
    }

    @When("Проверяем сумму выплат по процентам \"(.*)\"")
    public void checkAmountPaymants(String payments) throws Exception {
        System.out.println("6.2.Проверяем сумму выплат по процентам");
        calculatorPage.checkAmountOfInterestPayments(payments);
    }

    @When("Проверяем процентную ставку \"(.*)\"")
    public void checkRate(String interestRate) throws Exception {
        System.out.println("6.3.Проверяем процентную ставку");
        calculatorPage.checkRate(interestRate);
    }

}
