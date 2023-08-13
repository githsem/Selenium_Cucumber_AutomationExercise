@regression
Feature: Place Order

  @placeOrder1
  Scenario: Register while Checkout
    Given The user is on the home page
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks "Cart" menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    And The user clicks Register-Login button
    And The user enters name and email address
    And The user clicks Signup button
    And The user fills in account information
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
    And Verify that Logged in as username is visible
    When The user clicks "Cart" menu button
    And The user clicks Proceed To Checkout button
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    When The user clicks Pay and Confirm Order button
    #Then Verify success message Your order has been placed successfully!
    When The user clicks "Delete Account" menu button
    Then Verify that ACCOUNT DELETED! is visible
    And The user clicks Continue button

  @placeOrder2
  Scenario: Register before Checkout
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
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    When The user clicks Pay and Confirm Order button
    #Then Verify success message Your order has been placed successfully!
    When The user clicks "Delete Account" menu button
    Then Verify that ACCOUNT DELETED! is visible
    And The user clicks Continue button

  @placeOrder3
  Scenario: Register before Checkout
    Given The user is on the home page
    When The user clicks "Signup / Login" menu button
    And The user enters correct email address and password
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks "Cart" menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    Then Verify Address Details and Review User's Order
    When The user enters description in comment text area and click Place Order
    And The user enters payment details: Name on Card, Card Number, CVC, Expiration date
    When The user clicks Pay and Confirm Order button
    #Then Verify success message Your order has been placed successfully!
    When The user clicks "Delete Account" menu button
    Then Verify that ACCOUNT DELETED! is visible
    And The user clicks Continue button







    


