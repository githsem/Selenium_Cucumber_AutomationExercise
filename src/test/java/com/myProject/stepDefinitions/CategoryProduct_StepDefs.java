package com.myProject.stepDefinitions;

import com.myProject.pages.CategoryProductPage;
import com.myProject.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CategoryProduct_StepDefs {
    CategoryProductPage categoryProductPage = new CategoryProductPage();

    @Then("Verify that category page is displayed and confirm text women Dress PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_dress_products() {
        BrowserUtils.waitForVisibility(categoryProductPage.womenDressProductsText, 5);
        Assert.assertEquals("WOMEN - DRESS PRODUCTS", categoryProductPage.womenDressProductsText.getText());
    }

    @When("The user clicks on Men category")
    public void the_user_clicks_on_men_category() {
        categoryProductPage.menCategory.click();
    }

    @When("The user clicks on Tshirts link under Men category")
    public void the_user_clicks_on_tshirts_link_under_men_category() {
        categoryProductPage.tshirtsCategory.click();
    }

    @Then("Verify that category page is displayed and confirm text men Tshirts PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_men_tshirts_products() {
        Assert.assertEquals("MEN - TSHIRTS PRODUCTS", categoryProductPage.menTshirtsProductsText.getText());
    }
}
