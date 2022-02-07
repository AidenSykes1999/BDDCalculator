package com.spartaglobal.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStepDefs {

    private Calculator calc;

    private Integer actual;



    @Given("I have a calculator")
    public void iHaveACalculator() {

        calc = new Calculator();


    }

    @And("I enter {int} and {int} into the calculator")
    public void iEnterAndIntoTheCalculator(int num1, int num2) {

        calc.setNum1(num1);
        calc.setNum2(num2);


    }

    @When("I press add")
    public void iPressAdd() {

        actual = calc.add();


    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertEquals(expected, actual);
    }

    @When("I press subtract")
    public void iPressSubtract() {

        actual = calc.subtract();

    }
}
