Feature: Register Feature

  Scenario: Register on the web page
    Given The user is on the home page
    When The user Click on Signup - Login button
    Then Verify New User Signup! is visible
    When The user enters name and email address
    And The user clicks Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When The user fills in account information
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
    Then Verify that "Logged in as" username is visible
    When The user clicks Delete Account button
    Then Verify that "ACCOUNT DELETED!" is visible
    And The user clicks Continue2 button