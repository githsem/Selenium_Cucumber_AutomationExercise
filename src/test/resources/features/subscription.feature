@regression
Feature: Verify Subscription

  @subscription
  Scenario: Verify Subscription in home page
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible

  @subscription
  Scenario: Verify Subscription in Cart page
    Given The user is on the home page
    When The user clicks "Cart" menu button
    And The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible

