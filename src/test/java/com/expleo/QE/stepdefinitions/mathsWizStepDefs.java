package com.expleo.QE.stepdefinitions;

import com.expleo.QE.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class mathsWizStepDefs {

    @Steps
    Calculator calculator;
    //Calculator calculator = new Calculator(1);

    @Given("^That I have a calculator$")
    public void that_I_have_a_calculator() {
        //calculator = new Calculator(1);
    }

    @When("^I add two integers$")
    public void i_add_two_integers()  {
        calculator.add(1,2);
    }

    @Then("^the result will be correct$")
    public void the_result_will_be_correct() {
        assertThat(3, equalTo(calculator.getTotal()));
     }


}