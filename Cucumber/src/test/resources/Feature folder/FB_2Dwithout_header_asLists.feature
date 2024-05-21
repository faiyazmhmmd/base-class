Feature: verify Fb login page

  Scenario: verify Fb login page
    Given User is on the login page
    When User login
      | Bala | Bala@123 |
      | Mani | Mani@123 |
      | Guna | Guna@123 |
      | Abu  | Abu@123  |
    Then Should Verify the login success msg
