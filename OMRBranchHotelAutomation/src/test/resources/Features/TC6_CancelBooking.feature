Feature: Verify omr hotel booking Cancel Booking module Cucumber Automation
@Cancel1
  Scenario Outline: Cancel the new OrderId
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
    When User navigate into My Booking Page
    Then User should verify after navigate My Booking Success Message "Bookings"
    When User Search OrderId
    Then User Should verify the same Booked hotel Name is present or not
    And User Should verify the same Booked hotel OrderId is present or not
    And User Should verify the same Booked hotel Prise is present or not
    When User Edit the Check-in Date "<ModifyDate>"
    Then User Should verify the after modifiyed Check-in Date Success Message "Booking updated successfully"
    When User Search OrderId
    Then User Should verify the same Booked hotel Name is present or not
    And User Should verify the same Booked hotel OrderId is present or not
    And User Should verify the same Booked hotel Prise is present or not
    When User Cancel the New OrderId
    Then User Should verify the after Cancel Success Message "Your booking cancelled successfully"

    Examples: 
      | username              | password    | Select_State | Select_City | Select_room_type | Check_in   | Check_out  | no.room | on_of_adult | no_of_child | Select_Salutation | first_name | last_name | Mobile_No  | Email            | Enter_Registration_No | Enter_Company_Name     | Enter_Company_Address | Request | card_type  | ModifyDate |
      | faiyazmhmmd@gmail.com | Madurai@123 | Tamil Nadu   | Madurai     | Standard         | 2024-05-22 | 2024-05-30 | 1-One   | 1-One       |           1 | Mr               | Faiyaz     | Mohammed  | 9566456117 | faiyaz@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Good    | Debit Card | 2024-05-29 |
@Cancel2
  Scenario Outline: Cancel the Existing OrderId
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User navigate into My Booking Page
    Then User should verify after navigate My Booking Success Message "Bookings"
    When User Search OrderId "<OrderId>"
    Then User Should verify the same Booked hotel OrderId is present or not
    When User Cancel the Exexting Orderid "< OrderId >"
    Then User Should verify the after Cancel Success Message "Your booking cancelled successfully"

    Examples: 
      | username              | password    | OrderId     |
      | faiyazmhmmd@gmail.com | Madurai@123 | #WXQFE89236 |
@Cancel3
  Scenario Outline: Cancel the First Order Id
    Given User is on the omr branch page
    When User login the "<username>" and "<password>"
    Then User should verify after Login Success message as "Welcome Faiyaz"
    When User navigate into My Booking Page
    Then User should verify after navigate My Booking Success Message "Bookings"
    When User Cancel the First Displayed OrderId
    Then User Should verify the after Cancel Success Message "Your booking cancelled successfully"

    Examples: 
      | username              | password    |
      | faiyazmhmmd@gmail.com | Madurai@123 |
