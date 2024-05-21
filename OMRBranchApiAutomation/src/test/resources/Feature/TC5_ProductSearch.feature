@Search
Feature: Search module API documentation

  Scenario Outline: Verify user Get Product Search through API
    Given User add header for product search adddress endpoints
    When User add request body for product search "<product name>"
    And User send "POST" request for product search endpoint
    Then User should verify the Status code is 200
    And User should Verify the product search response body message present as "OK"

    Examples: 
      | product name |
      | nuts         |
