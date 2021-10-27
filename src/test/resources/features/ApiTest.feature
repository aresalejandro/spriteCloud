@API @regression
Feature: Sprite Cloud API Automation Test

  @apisTest
  Scenario Outline: Scenarios Apis
    Given Execute the method '<operation>' in '<entity>' with '<jsonFile>'
    When I will get the proper status code '<statusCode>'
    Then expected response is obtained in '<entity>'

    Examples:
      | operation | entity      | jsonFile         | statusCode |
      | GET       | INVENTORY   | storeInventory   | 200        |
      | POST      | CREATELIST  | createWithList   | 200        |
      | PUT       | PUTUSERNAME | putUserName      | 200        |
      #| DELETE    | DELETEPETID | deletePetID      | 200        |


  @apisTest
  Scenario Outline: Scenario Update Files
    Given Execute the method POST and Update File
    When I expected response with status code '<statusCode>' and validate message

    Examples:
      | statusCode |
      | 200        |