@regression
Feature: Verify Products

  @products
  Scenario: Verify All Products and product detail page
    Given The user is on the home page
    When The user clicks "Products" menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Verify the products list is visible
    When The user clicks on View Product of first product
    Then Verify the user is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand


    
