package com.myProject.pages;

import com.myProject.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(tagName = "footer")
    public WebElement footer;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement susbscribeEmailBox;

    @FindBy(id = "success-subscribe")
    public WebElement successSubscribeText;

    @FindBy(xpath = "//a[.='View Product']")
    public List<WebElement> viewProductButtons;

    @FindBy(xpath = "//h2[.='Category']")
    public WebElement categoryText;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy(xpath = "//div[@id='Women']//a[.='Dress ']")
    public WebElement dressCategory;

    @FindBy(id = "dismiss-button")
    public WebElement dismissButton;

    @FindBy(xpath = "//h2[.='recommended items']")
    public WebElement recommendedItemsText;

    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> recommendedItemsList;

    @FindBy(id = "scrollUp")
    public WebElement scrollUpArrow;

    @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFlaggedText;

}
