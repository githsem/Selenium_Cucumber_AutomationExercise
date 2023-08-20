@regression
Feature: Search

  @search1
  Scenario: Search Product
    Given The user is on the home page
    When The user clicks "Products" menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible

  @smoke @search2
  Scenario: Search Products and Verify Cart After Login
    Given The user is on the home page
    When The user clicks "Products" menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks "Cart" menu button
    Then Verify that products are visible in cart
    When The user clicks "Signup / Login" menu button
    And The user enters correct email address and password
    And The user clicks login button
    And The user clicks "Cart" menu button
    Then Verify that those products are visible in cart after login as well



