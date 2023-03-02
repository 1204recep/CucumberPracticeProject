package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eatingCucumber {

    @Given("recep is hungry")
    public void recep_is_hungry() {
        System.out.println("it is Given");
    }
    @When("he eats some cucumber")
    public void he_eats_some_cucumber() {
        System.out.println("it is When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("it is Then");
    }

    @Given("recep is eating more")
    public void recepIsEatingMore() {
        System.out.println("it is second Given");
    }

    @When("he consumes meat")
    public void heConsumesMeat() {
        System.out.println("it is second When");
    }

    @Then("he will be sick")
    public void heWillBeSick() {
        System.out.println("it is second then");
    }

    @Given("it is general rule")
    public void itIsGeneralRule() {
        System.out.println("it is GENERAL RULE");
    }
}
