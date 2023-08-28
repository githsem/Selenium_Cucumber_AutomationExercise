package com.myProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewCartPage extends BasePage {
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> addedCardProducts;

    @FindBy(xpath = "//tbody/tr/td[@class='cart_price']")
    public List<WebElement> cardPrices;

    @FindBy(xpath = "//tbody/tr/td[@class='cart_quantity']")
    public List<WebElement> cartQuantities;

    @FindBy(xpath = "//tbody/tr/td[@class='cart_total']")
    public List<WebElement> cartTotalPrices;

    @FindBy(xpath = "//a[.='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//u[.='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//td[@class='cart_delete']/a")
    public List<WebElement> deleteButtons;

    @FindBy(xpath = "//b[.='Cart is empty!']")
    public WebElement cartEmptyText;

}
