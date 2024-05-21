 Feature: Verify omr hotel booking Select Hotel module Cucumber Automation
@Select1
  Scenario Outline: Select Hotel and Verify Navigate to book hotel accepting the alert
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel "

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |
@Select2
  Scenario Outline: Select Hotel and verify navigating in same page upon dismiss the alert
     Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User Select the First Hotel
    And User Cancel the Alert
    Then User Should Verify after cancel alert it is in the same page message "Select Hotel"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |
