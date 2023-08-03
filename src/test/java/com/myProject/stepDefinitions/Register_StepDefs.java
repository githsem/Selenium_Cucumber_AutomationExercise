package com.myProject.stepDefinitions;

import com.myProject.pages.HomePage;
import com.myProject.pages.RegisterPage;
import com.myProject.utilities.BrowserUtils;
import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Register_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user Click on Signup - Login button")
    public void the_user_click_on_signup_login_button() {
        homePage.navigateToTabs("Signup / Login");
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        String expectedText = "New User Signup!";
        String actualText = registerPage.newUserSignupText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user enters name and email address")
    public void the_user_enters_name_and_email_address() {
        registerPage.nameBox.sendKeys(ConfigurationReader.get("firstName"));
        registerPage.emailBox.sendKeys(ConfigurationReader.get("email"));
    }

    @When("The user clicks Signup button")
    public void the_user_clicks_signup_button() {
        registerPage.signupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String expectedText = "ENTER ACCOUNT INFORMATION";
        String actualText = registerPage.enterAccountText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user fills in account information")
    public void the_user_fills_in_account_information() {
        registerPage.fillForm();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        String expectedText = "ACCOUNT CREATED!";
        String actualText = registerPage.accountText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user clicks Continue button")
    public void the_user_clicks_continue_button() {
        registerPage.continueButton.click();
    }

    @When("The user clicks Dismiss button")
    public void the_user_clicks_dismiss_button() {
        Driver.get().switchTo().frame("aswift_3");
        Driver.get().switchTo().frame("ad_iframe");
        registerPage.dismissButton.click();
    }

    @Then("Verify that {string} username is visible")
    public void verify_that_username_is_visible(String string) {
        String expectedText = string +" "+ ConfigurationReader.get("firstName");
        String actualText = registerPage.loggedInText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user clicks Delete Account button")
    public void the_user_clicks_delete_account_button() {
        registerPage.deleteAccountButton.click();
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String expectedText) {
        String actualText = registerPage.accountDeletedText.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user clicks Continue2 button")
    public void the_user_clicks_continue2_button() {
        registerPage.continueButton.click();
    }

}
