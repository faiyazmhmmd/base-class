Feature: Address module API automation

  @Address
  Scenario Outline: Verify add user address to the application through API
    Given User add header and bearer authorization for accesing adddress endpoints
    When User add request body for addNewAddress "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"
    And User send "POST" request for adduseraddress endpoint
    Then User should verify the Status code is 200
    And User should verify adduseraddress response message matches "Address added successfully"

    Examples: 
      | first_name | last_name | mobile     | apartment | state | city | country | zipcode | address | address_type |
      | faiyaz     | mohammed  | 9566456114 | apartment |    35 | 3857 |     101 |  638183 | Maduari | Home         |

  @Address
  Scenario Outline: Verify UpdateUserAddress to the application through API
    Given User add header and bearer authorization for accesing updateadddress endpoints
    When User add request body to UpdateNewAddress "<address_id>" "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"
    And User send "PUT" request for update AddUserAddress endpoint
    Then User should verify the Status code is 200
    Then User should verify updateaddress response message matches "Address updated successfully"

    Examples: 
      | address_id | first_name | last_name | mobile     | apartment | state | city | country | zipcode | address | address_type |
      |      12345 | fara       | Rishina   | 6358248225 | apartment |    35 | 3857 |     101 |  638183 | Chennai | Home         |

  @Address
  Scenario Outline: Verify GetUserAddress to the application through API
    Given User add headers and bearer authorization for accesing getadddress endpoints
    When User send "GET" request for GetUserAddress endpoint
    Then User should verify the Status code is 200
    Then User should verify getuseraddress response message matches "OK"

  Scenario Outline: Verify DeleteUserAddress to the application through API
    Given User add headers and bearer authorization for accesing deleteadddress endpoints
    When User add request body for address ID
    And User send "DELETE" request for DeleteAddress endpoint
    Then User should verify the Status code is 200
    Then User should verify DeleteAddress response message matches "Address deleted successfully"
