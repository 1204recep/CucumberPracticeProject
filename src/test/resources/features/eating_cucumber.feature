@Regression
Feature: eating to many cucumber may not be good for you
  user story: eating  too much of anything may not be good for you

  Background: be cautious about eating
    Given it is general rule

  Scenario: Eating a few is no problem
    Given recep is hungry
    When  he eats some cucumber
    Then  he will be full

    Scenario: Eating more get some problems
      Given  recep is eating more
      When  he consumes meat
      Then he will be sick