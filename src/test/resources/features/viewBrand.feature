@regression
Feature: View and Cart

  @smoke @viewcart
  Scenario: View & Cart Brand Products
    Given The user is on the home page
    When The user clicks "Products" menu button
    Then Verify that Brands are visible on left side bar
    When The user clicks on left side bar "Polo" brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    When The user clicks on left side bar "H&M" brand name
    Then Verify that user is navigated to brand page and brand products are displayed


