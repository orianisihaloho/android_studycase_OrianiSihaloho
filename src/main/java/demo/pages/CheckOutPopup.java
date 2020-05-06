package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutPopup {
    public void userInputAmountOnCheckout(String amount) {
        WebElement amountm = AndroidDriverInstance.androidDriver.findElement(By.id("cash_edit_text"));
        amountm.sendKeys(amount);
    }

    public void userClickChargeButton() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("tablet_ok_button")).click();
    }
}

