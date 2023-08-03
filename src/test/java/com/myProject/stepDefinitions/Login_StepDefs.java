package com.myProject.stepDefinitions;

import com.myProject.pages.LoginPage;
import com.myProject.pages.RegisterPage;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        String expectedText = "Login to your account";
        String actualText = loginPage.loginYourAccountText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @When("The user enters correct email address and password")
    public void the_user_enters_correct_email_address_and_password() {
        loginPage.loginInfo();
    }
    @When("The user click login button")
    public void the_user_click_login_button() {
        loginPage.login();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Driver.get().switchTo().frame("aswift_2");
        loginPage.dismissButton.click();
        String expectedText = "ACCOUNT DELETED!";
        String actualText = registerPage.accountDeletedText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
