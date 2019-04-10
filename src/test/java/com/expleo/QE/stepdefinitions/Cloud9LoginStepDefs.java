package com.expleo.QE.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Cloud9LoginStepDefs {

    @Steps
    com.expleo.QE.steps.loginSteps loginSteps;

    @Given("^That I am on the Cloud(\\d+) home page$")
    public void that_I_am_on_the_Cloud_home_page(int arg1) {
        loginSteps.openBrowser();
    }

    @When("^Log in with a valid user id and password$")
    public void log_in_with_a_valid_user_id_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginSteps.captureDetails();
    }

    @Then("^I will be take to the itinerary page$")
    public void i_will_be_take_to_the_itinerary_page() {
        // Write code here that turns the phrase above into concrete actions
    }
}
