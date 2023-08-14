package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CheckOutPage extends BasePage {

    @FindBy(xpath = "(//li[.='myAddress'])[1]")
    public WebElement deliveryAddressText;

    @FindBy(xpath = "(//li[.='myAddress'])[2]")
    public WebElement billingAddressText;

    @FindBy(tagName = "textarea")
    public WebElement commentTextBox;

    @FindBy(xpath = "//tbody//td[@class='cart_product']")
    public List<WebElement> reviewCardProducts;

}
