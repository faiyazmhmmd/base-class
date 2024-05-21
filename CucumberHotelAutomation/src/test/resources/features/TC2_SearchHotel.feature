Feature: Verify omr hotel booking Search module Cucumber Automation

  Scenario Outline: Verify the search hotel by entering all fields
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify after search success message "Select Hotel"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify the search hotel by entering the mandatory fields
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Check_in>","<Check_out>","<no.room>" and "<on_of_adult>"
    Then User should verify after search success message "Select Hotel"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify the search hotel without entering the mandatory fields
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User click the Search button
    Then User should verify  after Search Error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify the search hotel by entering the all field and also verify the selected roomtype in end of hotalname
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify after search success message "Select Hotel"
    And User should verify all listed room is  end with Selected room type

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify the search hotel by entering all Room type displayed in header
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login sucess message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify the search message "Select Hotel"
    And User should verify the header

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify Sorting functionality hotal price from low to high
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify the search message "Select Hotel"
    When User Click the Price low to high in Sort By option
    And User Should verify the  List hotel price in the order of low to high

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify Sorting functionality hotal price from high to low
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify the search message "Select Hotel"
    When User Click the Price  high to low in Sort By option
    And User Should verify the List hotel price in the order of high to low

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify sorting functionality hotel Name in Ascending
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify the search message "Select Hotel"
    When User Click the Name Ascending 
    And User Should verify the List hotel Name in Ascending order

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |

  Scenario Outline: Verify sorting functionality hotel Name in Descending
    Given User is on the omr branch page
    When User Login the "<username>" and "<password>" 
    Then User should verify after Login success message as "Welcome Faiyaz"
    When User search "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>"and"<no_of_child>"
    Then User should verify the search message "Select Hotel"
    When User Click the Name Descending 
    And User Should verify the List hotel Name in Descending order

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |
