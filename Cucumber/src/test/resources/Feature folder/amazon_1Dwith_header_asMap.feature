Feature: Verify Amazon Search

  Scenario: Verify Amazon product Search
    Given user on amazon page
    When user search given product
      | TV      | sony    |
      | Laptop  | HP      |
      | android | oneplus |
      | IOS     | Iphone  |
    Then user should verify given product listed Successfully
