Feature: Verify Amazon Search

  Scenario: Verify Amazon product Search
    Given user is on amazon page
    When user search product
      | TV      |
      | Laptop  |
      | android |
      | IOS     |
    Then user should verify all product listed Successfully
