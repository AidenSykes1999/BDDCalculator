Feature: Calculator
  Simple Calculator which takes two numbers


  @Add
  Scenario: Addition
    Given I have a calculator
    And I enter 5 and 2 into the calculator
    When I press add
    Then the result should be 7

    @Subtract
    Scenario Outline: Subtraction
      Given I have a calculator
      And I enter <input1> and <input2> into the calculator
      When I press subtract
      Then the result should be <result>
      Examples:
        |input1|input2|result|
        |1     |1     |0     |
        |0     |1     |-1     |
        |1000  |1     |999   |

