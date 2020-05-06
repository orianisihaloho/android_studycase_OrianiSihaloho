package demo.steps_definition;

import demo.pages.CheckOutPopup;
import demo.pages.FavoritePage;
import demo.pages.StartPage;
import demo.webdriver.AndroidDriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  FavoritePage favoritePage = new FavoritePage();
  CheckOutPopup checkOutPopup = new CheckOutPopup();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {

    startPage.clikSignInButton();
  }

  @When("User input email/phone {string} on moka sign in page")
  public void userInputEmailOnMokaSignInPage(String emailpho) {
    startPage.userInputEmailOnMokaSignInPage(emailpho);
  }

  @When("User click sign in button on moka login page")
  public void userClickSignInButtonOnMokaLoginPage() {
  startPage.userClickSignInButtonOnMokaLoginPage();
  }

  @When("User input password {string}on moka sign in page")
  public void userInputPasswordOnMokaSignInPage(String password) {
    startPage.userInputPasswordOnMokaSignInPage(password);
  }

  @When("User click item {string}")
  public void userClickItem(String itemName) {
    favoritePage.userClickItem(itemName);
  }


  @When("User click checkout button")
  public void userClickCheckoutButton() {
    favoritePage.userClickCheckoutButton();
  }

  @When("User input amount {string} on checkout")
  public void userInputAmountOnCheckout(String amount) {
    checkOutPopup.userInputAmountOnCheckout(amount);
  }

  @When("User click charge button")
  public void userClickChargeButton() {
    checkOutPopup.userClickChargeButton();
  }

  @When("User click save Bill")
  public void userClickSaveBill() {
    favoritePage.userClickSaveBill();
  }



  @When("User input Billname {string}")
  public void userInputBillname(String billname) {
    favoritePage.userInputBillname(billname);
  }


}
