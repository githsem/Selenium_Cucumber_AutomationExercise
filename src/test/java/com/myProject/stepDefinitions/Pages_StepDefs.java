package com.myProject.stepDefinitions;

import com.myProject.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Pages_StepDefs {
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        String expectedUrl = "https://www.automationexercise.com/test_cases";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }
}
