package com.myProject.stepDefinitions;

import com.myProject.pages.ProductsPage;
import com.myProject.pages.SearchPage;
import com.myProject.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Search_StepDefs {
    ProductsPage productsPage = new ProductsPage();
    SearchPage searchPage = new SearchPage();

    @When("The user enters product name in search input and click search button")
    public void the_user_enters_product_name_in_search_input_and_click_search_button() {
        productsPage.searchProductBox.sendKeys("Kids" + Keys.TAB + Keys.ENTER);
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        BrowserUtils.verifyElementDisplayed(searchPage.searchedProductsText);
    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertEquals(1, searchPage.searchedProducts.size());
    }

}
