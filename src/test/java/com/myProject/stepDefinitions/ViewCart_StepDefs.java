package com.myProject.stepDefinitions;

import com.myProject.pages.ViewCartPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewCart_StepDefs {
    ViewCartPage viewCartPage = new ViewCartPage();

    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertEquals(2, viewCartPage.addedCardProducts.size());
    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        Assert.assertEquals(viewCartPage.cardPrices.get(0).getText(), "Rs. 500");
        Assert.assertEquals(viewCartPage.cartQuantities.get(0).getText(), "1");
        Assert.assertEquals(viewCartPage.cartTotalPrices.get(0).getText(), "Rs. 500");
        Assert.assertEquals(viewCartPage.cardPrices.get(1).getText(), "Rs. 400");
        Assert.assertEquals(viewCartPage.cartQuantities.get(1).getText(), "1");
        Assert.assertEquals(viewCartPage.cartTotalPrices.get(1).getText(), "Rs. 400");
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        Assert.assertEquals(viewCartPage.cartQuantities.get(0).getText(), "4");
    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        String expectedUrl = "https://www.automationexercise.com/view_cart";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }

    @When("The user clicks Proceed To Checkout button")
    public void the_user_clicks_proceed_to_checkout_button() {
        viewCartPage.proceedToCheckoutButton.click();
    }

    @When("The user clicks Register-Login button")
    public void the_user_clicks_register_login_button() {
        viewCartPage.registerLoginButton.click();
    }

    @When("The user clicks X button corresponding to particular product")
    public void the_user_clicks_x_button_corresponding_to_particular_product() {
        viewCartPage.deleteButtons.get(0).click();
    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
        BrowserUtils.waitForVisibility(viewCartPage.cartEmptyText, 2);
        BrowserUtils.verifyElementDisplayed(viewCartPage.cartEmptyText);
    }

    @Then("Verify that products are visible in cart")
    public void verify_that_products_are_visible_in_cart() {
        Assert.assertEquals(1, viewCartPage.addedCardProducts.size());
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
        Assert.assertEquals(1, viewCartPage.addedCardProducts.size());
    }

    @Then("Verify that recommended product is displayed in cart page")
    public void verify_that_recommended_product_is_displayed_in_cart_page() {
        Assert.assertEquals(1, viewCartPage.addedCardProducts.size());
    }
}
