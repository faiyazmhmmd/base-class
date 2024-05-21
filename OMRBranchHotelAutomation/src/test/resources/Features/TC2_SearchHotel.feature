Feature: Verify omr hotel booking Search module Cucumber Automation

  @Search1
  Scenario Outline: Verify the search hotel by entering all fields
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search2
  Scenario Outline: Verify the search hotel by entering the mandatory fields
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Check_in>","<Check_out>","<no.room>" and "<on_of_adult>"
    Then User should verify after search Hotel success message "Select Hotel"

    Examples: 
      | username              | password    | Select_State | Select_City | Check_in   | Check_out  | no.room | on_of_adult |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |

  @Search3
  Scenario Outline: Verify the search hotel without entering the mandatory fields
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User click the Search button
    Then User should verify after Search Hotel Error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  @Search4
  Scenario Outline: Verify the search hotel by entering the all field and also verify the selected roomtype in end of hotalname
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    And User should verify all listed hotel room ends with Selected room type "<Select_room_type>"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search5
  Scenario Outline: Verify the search hotel by entering all Room type displayed in header
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    And User should verify the all Hotel room type displayed in header "<Select_room_type>"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type                    | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard/Deluxe/Suite/Luxury/Studio | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search6
  Scenario Outline: Verify Sorting functionality hotal price from low to high
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User Click the Price low to high in Sort By option
    And User Should verify the List Hotel room price in the order of low to high

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search7
  Scenario Outline: Verify Sorting functionality hotal price from high to low
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User Click the Price  high to low in Sort By option
    And User Should verify the List Hotel room price in the order of high to low

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search8
  Scenario Outline: Verify sorting functionality hotel Name in Ascending
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User Click the Name Ascending
    And User Should verify the List Hotel Name in Ascending order

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |

  @Search9
  Scenario Outline: Verify sorting functionality hotel Name in Descending
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User Click the Name Descending
    And User Should verify the List Hotel Name in Descending order

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 |
