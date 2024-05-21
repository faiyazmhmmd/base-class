@Login
Feature: Login Module API Automation

  Scenario: Get User logtoken from login endpoint
    Given user add header
    When User add basic Autheration for login
    And User Send "POST" request for login endpoint
    Then User should verify the Status code is 200
    And User should Verify the login response body first_Name present as "Faiyaz" and get the logtoken saved
