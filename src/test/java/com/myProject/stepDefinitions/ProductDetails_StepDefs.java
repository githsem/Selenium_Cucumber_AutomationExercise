package com.myProject.stepDefinitions;

import com.myProject.pages.ProductDetailsPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDetails_StepDefs {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }

    @When("The user increases quantity to {string}")
    public void the_user_increases_quantity_to(String string) {
        BrowserUtils.clearAndSendKeys(productDetailsPage.quantityBox, string);
    }

    @When("The user clicks Add to cart button")
    public void the_user_clicks_add_to_cart_button() {
        productDetailsPage.addToCartButton.click();
    }

    @Then("Verify Write Your Review is visible")
    public void verify_write_your_review_is_visible() {
        BrowserUtils.scrollToElement(productDetailsPage.writeYourReviewText);
        BrowserUtils.verifyElementDisplayed(productDetailsPage.writeYourReviewText);
    }

    @Then("The user fills in ProductReview and click Submit Button")
    public void the_user_fills_in_product_review_and_click_submit_button() {
        productDetailsPage.fillProductReview();
    }

    @Then("Verify success message Thank you for your review.")
    public void verify_success_message_thank_you_for_your_review() {
        BrowserUtils.verifyElementDisplayed(productDetailsPage.thankYouText);
    }

}
