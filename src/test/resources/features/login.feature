Feature: Login Feature

  @login
  Scenario: Login User with correct email and password
    Given The user is on the home page
    When The user Click on Signup - Login button
    Then Verify Login to your account is visible
    When The user enters correct email address and password
    And The user click login button
    Then Verify that "Logged in as" username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED! is visible

