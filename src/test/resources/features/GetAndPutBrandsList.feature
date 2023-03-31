@BrandsList
Feature: All Brands List

  @TestCase_03
  Scenario: Verify if Brands List is being successfully getting
    Given the user wants to test get all brands with "https://automationexercise.com/api/brandsList"
    Then Verify 200 http status code

  @TestCase_04
  Scenario: Verify if any post to Products List
    Given the user wants to test put all brands with "https://automationexercise.com/api/brandsList"
    Then Verify 405 http status code
    And Verify Response message