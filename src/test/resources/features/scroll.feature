@regression
Feature: Scroll

  @scroll1
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When  The user clicks on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

  @scroll2
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When  The user scrolls up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

