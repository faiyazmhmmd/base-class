@Changepic
Feature: Change ProfilePic module API documentation

  Scenario: Verify user Get Change ProfilePic through API
    Given User add header for Change ProfilePic endpoints
    When User add Form Data and pic location for Change ProfilePic
    And User send "POST" request for Change ProfilePic endpoint
    Then User should verify the Status code is 200
    And User should Verify the Change ProfilePic response body message present as "Profile updated Successfully"
