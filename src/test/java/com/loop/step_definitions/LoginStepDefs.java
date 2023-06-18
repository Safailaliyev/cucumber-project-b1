package com.loop.step_definitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is given step");

    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is when step");

    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is when step");

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is when step");

    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is then step");

    }
    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        System.out.println("this is when step");
    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        System.out.println("this is when step");
    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
        System.out.println("this is then step");
    }
}
