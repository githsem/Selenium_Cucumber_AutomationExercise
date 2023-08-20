package com.myProject.stepDefinitions;

import com.myProject.pages.ProductsPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Products_StepDefs {
    ProductsPage productsPage = new ProductsPage();

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        String expectedUrl = "https://www.automationexercise.com/products";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }

    @Then("Verify the products list is visible")
    public void verify_the_products_list_is_visible() {
        Assert.assertTrue(productsPage.productsList.size() > 1);
    }

    @When("The user clicks on View Product of first product")
    public void the_user_clicks_on_view_product_of_first_product() {
        productsPage.firstViewProductButton.click();
    }

    @Then("Verify the user is landed to product detail page")
    public void verify_the_user_is_landed_to_product_detail_page() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        BrowserUtils.verifyElementDisplayed(productsPage.productName);
        BrowserUtils.verifyElementDisplayed(productsPage.productCategory);
        BrowserUtils.verifyElementDisplayed(productsPage.productPrice);
        BrowserUtils.verifyElementDisplayed(productsPage.productAvailability);
        BrowserUtils.verifyElementDisplayed(productsPage.productCondition);
        BrowserUtils.verifyElementDisplayed(productsPage.productBrand);
    }

    @When("The user hovers over first product and clicks Add to cart")
    public void the_user_hovers_over_first_product_and_clicks_add_to_cart() {
        BrowserUtils.scrollToElement(productsPage.productsList.get(0));
        BrowserUtils.hover(productsPage.productsList.get(0));
        BrowserUtils.waitForClickablility(productsPage.addToCartButtons.get(0), 2);
        productsPage.addToCartButtons.get(0).click();
    }

    @When("The user clicks Continue Shopping button")
    public void the_user_clicks_continue_shopping_button() {
        productsPage.continueShoppingButton.click();
    }

    @When("The user hovers over second product and clicks Add to cart")
    public void the_user_hovers_over_second_product_and_clicks_add_to_cart() {
        BrowserUtils.hover(productsPage.productsList.get(1));
        BrowserUtils.waitForClickablility(productsPage.addToCartButtons.get(1), 2);
        productsPage.addToCartButtons.get(1).click();
    }

    @When("The user clicks View Cart button")
    public void the_user_clicks_view_cart_button() {
        BrowserUtils.waitForClickablility(productsPage.viewCartButton, 5);
        productsPage.viewCartButton.click();
    }

    @Then("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
        BrowserUtils.verifyElementDisplayed(productsPage.brandsText);
    }

    @When("The user clicks on left side bar {string} brand name")
    public void the_user_clicks_on_left_side_bar_brand_name(String brand) {
        BrowserUtils.scrollToElement(productsPage.brandsText);
        productsPage.clickBrandName(brand);
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        Assert.assertTrue(productsPage.productsList.size() > 0);
    }
}
