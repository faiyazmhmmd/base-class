@Login
Feature: Verify omr hotel booking login module Cucumber Automation

  @Login1
  Scenario Outline: Login the hotel page with valid credentials
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  @Login2
  Scenario Outline: Login the hotel page with valid credentials using Enter key
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" using Enter key
    Then User should verify after Login Success message as "Welcome Faiyaz"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  @Login3
  Scenario Outline: Login the hotel page with Invalid credentials
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after login error message as "Invalid Login details or Your Password "

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Welcome@123 |
