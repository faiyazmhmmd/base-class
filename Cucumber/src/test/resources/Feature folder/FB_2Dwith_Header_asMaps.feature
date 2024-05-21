Feature: verify Fb login page

  Scenario: verify Fb login page
    Given User on the login page
    When User login FB account
      | username | password |
      | Bala     | Bala@123 |
      | Mani     | Mani@123 |
      | Guna     | Guna@123 |
      | Abu      | Abu@123  |
    Then Should Verify the after login success msg
