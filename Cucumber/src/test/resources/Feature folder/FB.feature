@FB
Feature: Verify Facebook Login Modules

  Scenario: Verify the Facebook Login With Valid Data
    Given user is on the Facebook page
    When user enter username and password
    And user Enter the login button
    Then user should verify the success login message 
