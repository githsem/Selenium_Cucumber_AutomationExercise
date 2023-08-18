package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.io.File;

public class PaymentPage extends BasePage {
    Actions actions = new Actions(Driver.get());

    @FindBy(name = "name_on_card")
    public WebElement nameOnCard;

    @FindBy(xpath = "//div[@id='success_message'][1]")
    public WebElement successMessage;

    @FindBy(id = "submit")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//a[.='Download Invoice']")
    public WebElement downloadInvoiceButton;


    public void fillCardDetails() {
        actions.click(nameOnCard)
                .sendKeys("Fname Lname" + Keys.TAB)
                .sendKeys("123456765432345" + Keys.TAB)
                .sendKeys("11" + Keys.TAB)
                .sendKeys("11" + Keys.TAB)
                .sendKeys("2025")
                .perform();
    }

    public boolean filePresent() {
        String homePath = System.getProperty("user.home");
        File f = new File(homePath + "/Downloads/invoice.txt");
        return f.exists();
    }

}
