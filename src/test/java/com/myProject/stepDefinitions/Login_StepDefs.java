package com.myProject.stepDefinitions;

import com.myProject.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        String expectedText = "Login to your account";
        String actualText = loginPage.loginYourAccountText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @When("The user enters correct email address and password")
    public void the_user_enters_correct_email_address_and_password() {

    }
    @When("The user click login button")
    public void the_user_click_login_button() {

    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {

    }
}
