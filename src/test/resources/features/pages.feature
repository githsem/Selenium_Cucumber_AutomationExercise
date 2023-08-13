@regression
Feature: Verify Pages

  @testcase
  Scenario: Verify Test Cases Page
    Given The user is on the home page
    When The user clicks "Test Cases" menu button
    Then Verify user is navigated to test cases page successfully
