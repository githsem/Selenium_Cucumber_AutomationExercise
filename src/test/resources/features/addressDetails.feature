@regression
Feature: Address Details

  @addressDetails
  Scenario: Verify address details in checkout page
    Given The user is on the home page
    When The user clicks "Signup / Login" menu button
    And The user enters name and email address
    And The user clicks Signup button
    And The user fills in account information
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
    Then Verify that Logged in as username is visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks "Cart" menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    Then Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED! is visible
    And The user clicks Continue2 button