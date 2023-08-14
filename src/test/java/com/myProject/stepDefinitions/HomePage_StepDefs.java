package com.myProject.stepDefinitions;

import com.myProject.pages.CategoryProductPage;
import com.myProject.pages.HomePage;
import com.myProject.pages.RegisterPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.Set;

public class HomePage_StepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    CategoryProductPage categoryProductPage = new CategoryProductPage();

    @When("The user scrolls down to footer")
    public void the_user_scrolls_down_to_footer() {
        BrowserUtils.scrollToElement(homePage.footer);
    }

    @Then("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        BrowserUtils.verifyElementDisplayed(homePage.subscriptionText);
    }

    @When("The user enters email address in input and click arrow button")
    public void the_user_enters_email_address_in_input_and_click_arrow_button() {
        homePage.susbscribeEmailBox.sendKeys("myEmail@email.com" + Keys.ENTER);
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        BrowserUtils.verifyElementDisplayed(homePage.successSubscribeText);
    }

    @When("The user clicks View Product for any product on home page")
    public void the_user_clicks_view_product_for_any_product_on_home_page() {
        homePage.viewProductButtons.get(0).click();
        try {
            Driver.get().switchTo().frame("aswift_9");
            Driver.get().switchTo().frame("ad_iframe");
            registerPage.dismissButton.click();
        } catch (Exception e) {

        }

    }

    @Then("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        BrowserUtils.scrollToElement(homePage.categoryText);
        BrowserUtils.verifyElementDisplayed(homePage.categoryText);
    }

    @When("The user clicks on Women category")
    public void the_user_clicks_on_women_category() {
        homePage.womenCategory.click();
    }

    @When("The user clicks on Dress link under Women category")
    public void the_user_clicks_on_dress_link_under_women_category() {
        homePage.dressCategory.click();
        Driver.get().switchTo().frame("aswift_9");
        Driver.get().switchTo().frame("ad_iframe");
        homePage.dismissButton.click();
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verify_recommended_items_are_visible() {
        BrowserUtils.verifyElementDisplayed(homePage.recommendedItemsText);
    }

    @When("The user clicks on Add To Cart on Recommended product")
    public void the_user_clicks_on_add_to_cart_on_recommended_product() {
        homePage.recommendedItemsList.get(4).click();
    }

    @When("The user clicks on arrow at bottom right side to move upward")
    public void the_user_clicks_on_arrow_at_bottom_right_side_to_move_upward() {
        homePage.scrollUpArrow.click();
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
        BrowserUtils.verifyElementDisplayed(homePage.fullFlaggedText);
    }

    @When("The user scrolls up page to top")
    public void the_user_scrolls_up_page_to_top() {
        BrowserUtils.scrollToElement(homePage.tabMenu.get(0));
    }

}
