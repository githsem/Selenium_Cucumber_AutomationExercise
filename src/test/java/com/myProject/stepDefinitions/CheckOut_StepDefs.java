package com.myProject.stepDefinitions;

import com.myProject.pages.CheckOutPage;
import com.myProject.pages.PaymentPage;
import com.myProject.pages.ViewCartPage;
import com.myProject.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CheckOut_StepDefs {
    CheckOutPage checkOutPage = new CheckOutPage();

    @Then("Verify Address Details and Review User's Order")
    public void verify_address_details_and_review_user_s_order() {
        Assert.assertEquals(ConfigurationReader.get("address"),checkOutPage.addressText.getText());
        Assert.assertEquals(checkOutPage.reviewCardProducts.size(),2);
    }
    @When("The user enters description in comment text area and click Place Order")
    public void the_user_enters_description_in_comment_text_area_and_click_place_order() {
        checkOutPage.commentTextBox.sendKeys("myComment" + Keys.TAB + Keys.ENTER);
    }

    @When("The user clicks Pay and Confirm Order button")
    public void the_user_clicks_pay_and_confirm_order_button() {

    }
}
