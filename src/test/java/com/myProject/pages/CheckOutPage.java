package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//li[.='myAddress']")
    public WebElement addressText;

    @FindBy(tagName = "textarea")
    public WebElement commentTextBox;

    @FindBy(xpath = "//tbody//td[@class='cart_product']")
    public List<WebElement> reviewCardProducts;

}
