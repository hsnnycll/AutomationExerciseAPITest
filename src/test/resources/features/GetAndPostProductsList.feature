@ProductsList
Feature: All Products List

  @TestCase_01
  Scenario: Verify if Products List is being successfully getting
    Given the user wants to test get all products with "https://automationexercise.com/api/productsList"
    Then Verify http status code 200

  @TestCase_02
  Scenario: Verify if any post to Products List
    Given the user wants to test post all products with "https://automationexercise.com/api/productsList"
    Then Verify http status code 405
    And Verify response message
