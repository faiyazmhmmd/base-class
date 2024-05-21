Feature: Verify omr hotel booking Book Hotel module Cucumber Automation

  @Book1
  Scenario Outline: Book hotel including GST-card(debit card-VISA)-with special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add the GST Details "<Enter_Registration_No>","<Enter_Company_Name>" and "<Enter_Company_Address>"
    And User add special request "<Request>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | Request | card_type  |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Good    | Debit Card |

  @Book2
  Scenario Outline: Book hotel including GST-card(credit card-VISA)-with special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add the GST Details "<Enter_Registration_No>","<Enter_Company_Name>" and "<Enter_Company_Address>"
    And User add special request "<Request>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | Request | card_type   |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Good    | Credit Card |

  @Book3
  Scenario Outline: Book hotel including GST-card(debit card-VISA)-without special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add the GST Details "<Enter_Registration_No>","<Enter_Company_Name>" and "<Enter_Company_Address>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | card_type  |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card |

  @Book4
  Scenario Outline: Book hotel including GST-card(credit card-VISA)-without special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add the GST Details "<Enter_Registration_No>","<Enter_Company_Name>" and "<Enter_Company_Address>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | card_type   |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card |

  @Book5
  Scenario Outline: Book hotel without GST-card(debit card-VISA)-with special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add special request "<Request>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Request | card_type  |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com | Good    | Debit Card |

  @Book6
  Scenario Outline: Book hotel without GST-card(credit card-VISA)-without special request
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User enter payment details,procced with card type "<card_type>"
      | Select_Card | Card_No          | Card_Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Mani      | July  | 2024 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | July  | 2024 | 123 |
      | Amex        | 5555555555550000 | Mani      | July  | 2024 | 123 |
      | Discover    | 5555555555556666 | Mani      | July  | 2024 | 123 |
    Then User should verify after hotel booking Success message "Booking is Confirmed" and save the order Id
    And User Should verify that same selected Hotel is Booked or not

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | card_type   |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com | Credit Card |

  @Book7
  Scenario Outline: Without entering payment Deteils Book Hotel and Verify error message
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User search Hotel "<Select_State>","<Select_City>","<Select_room_type>","<Check_in>","<Check_out>","<no.room>","<on_of_adult>" and "<no_of_child>"
    Then User should verify after search Hotel success message "Select Hotel"
    When User save the First Hotel Name and First Hotel Price
    And User Select the First Hotel
    And User accept the Alert
    Then User should verify the after select Hotel success message "Book Hotel"
    When User add the Guest Details "<Select_Salutation>","<first_name>","<last_name>","<Mobile_No>" and "<Email>"
    And User add the GST Details "<Enter_Registration_No>","<Enter_Company_Name>" and "<Enter_Company_Address>"
    And User add special request "<Request>"
    And User without entering payment details and click Submit
    Then User should verify after payment details Error message "Please select your card type" ,"Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | Request |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr                | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Good    |
