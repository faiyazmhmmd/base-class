@City
Feature: City module API documentation

  Scenario: Verify user Get citylist through API
    Given User add header for to get citylist
    When User add request body stateid for to get city list
    And User send "POST" request for citylist endpoint
    Then User should verify the Status code is 200
    And User Verify the citylist response message matches "Madurai" and saved city ID
