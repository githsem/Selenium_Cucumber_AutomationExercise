@regression
Feature: Add Product

  @smoke @addProduct1
  Scenario: Add Products in Cart
    Given The user is on the home page
    When The user clicks "Products" menu button
    And The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks View Cart button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price

  @addProduct2
  Scenario: Add to cart from Recommended items
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify RECOMMENDED ITEMS are visible
    When The user clicks on Add To Cart on Recommended product
    And The user clicks View Cart button
    Then Verify that recommended product is displayed in cart page





