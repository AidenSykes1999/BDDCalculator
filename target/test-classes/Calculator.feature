Feature: Calculator
  Simple Calculator which takes two numbers


  @Add
  Scenario: Addition
    Given I have a calculator
    And I enter 5 and 2 into the calculator
    When I press add
    Then the result should be 7