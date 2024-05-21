@Amazon
Feature: Verify the Amazon Search text box model

  Scenario Outline: Verify the Amazon search text box with valid data
    Given User is on the Amazon Home page
    When User Enter the product name "Mobile"
    And User click the search button
    Then User verify the success search page
