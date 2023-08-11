Feature: Add Product

  @addProduct
  Scenario: Add Products in Cart
    Given The user is on the home page
    When The user clicks "Products" menu button
    And The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks View Cart button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price



