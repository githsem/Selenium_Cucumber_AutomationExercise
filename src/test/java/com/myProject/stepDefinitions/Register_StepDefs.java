package com.myProject.stepDefinitions;

import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @When("user login page")
    public void user_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
}
