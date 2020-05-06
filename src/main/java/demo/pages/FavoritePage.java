package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class FavoritePage {

    public void userClickItem(String itemName) {
        String xpath = "//android.widget.TextView[contains(@resource-id,'grid_favourite_name') and @text ='"+itemName+"']";
        AndroidDriverInstance.androidDriver.findElement(By.xpath(xpath)).click();

    }

    public void userClickCheckoutButton() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("checkoutButton")).click();
    }

    public void userClickSaveBill() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("saveBillButton\"")).click();
    }

    @When("User input Billname")
    public void userInputBillname(String billname) {
        WebElement biillname = AndroidDriverInstance.androidDriver.findElement(By.id("open_bill_name"));
        biillname.sendKeys(billname);
    }

    @When("user click save")
    public void userClickSave() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("add_open_bill_save")).click();
    }
}
