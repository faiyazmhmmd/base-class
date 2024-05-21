@State
Feature: State module API documentation

  Scenario: Verify user get Statelist through API
    Given User add header for the statelist
    When User send "GET" request for statelist endpoint
    Then User should verify the Status code is 200
    And User should verify the statelist response messgae matches "Tamil Nadu" and saved state ID
