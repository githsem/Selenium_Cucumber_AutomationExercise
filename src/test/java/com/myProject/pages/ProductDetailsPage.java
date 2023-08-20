package com.myProject.pages;

import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {
    Actions actions = new Actions(Driver.get());

    @FindBy(id = "quantity")
    public WebElement quantityBox;

    @FindBy(css = ".btn.btn-default.cart")
    public WebElement addToCartButton;

    @FindBy(xpath = ".//a[.='Write Your Review']")
    public WebElement writeYourReviewText;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(xpath = "//span[.='Thank you for your review.']")
    public WebElement thankYouText;


    public void fillProductReview() {
        actions.click(nameBox).sendKeys(ConfigurationReader.get("firstName") + Keys.TAB).sendKeys(ConfigurationReader.get("email") + Keys.TAB).sendKeys("myReview" + Keys.TAB + Keys.ENTER).perform();
    }
}
