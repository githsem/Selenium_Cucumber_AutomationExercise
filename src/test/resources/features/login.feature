@regression
Feature: Login

  @smoke @login1
  Scenario: Login User with correct email and password
    Given The user is on the home page
    When The user clicks "Signup / Login" menu button
    Then Verify Login to your account is visible
    When The user enters correct email address and password
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED! is visible

  @smoke @login2
  Scenario: Login User with incorrect email and password
    Given The user is on the home page
    When The user clicks "Signup / Login" menu button
    Then Verify Login to your account is visible
    When The user enters incorrect email address and password
    And The user clicks login button
    Then Verify error Your email or password is incorrect! is visible

  @smoke @logout
  Scenario: Logout User
    Given The user is on the home page
    When The user clicks "Signup / Login" menu button
    Then Verify Login to your account is visible
    When The user enters correct email address and password
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user clicks "Logout" menu button
    Then Verify that user is navigated to login page


