@omr
Feature: Verify OMRBranch Login Modules

  Scenario Outline: Verify the OMRBranch Login With Valid Data
    Given user is on the OMRBranch page
    When user enter "<username>" and "<password>"
    And user click the login button
    Then user should verify the success message after login

    Examples: 
      | username            | password       |
      | greensomr@gmail.com | ekjdnjdsn@1223 |
     

    Examples: 
      | username         | password     |
      | faiyaz@gmail.com | madurai@1334 |
