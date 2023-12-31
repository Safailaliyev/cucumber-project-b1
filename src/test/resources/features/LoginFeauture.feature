
Feature: Docuport login Logout Feature

  Background: will run for each scenario first
    Given user is on Docuport login page

  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should see the home page for client


     Scenario: Login as an employee
      Given user is on Docuport login page
      When user enters username for employee
      And user enters password for employee
      And user clicks login button
      Then user should see the home page for employee

  Scenario: Login as an advisor
    Given user is on Docuport login page
    When user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor



    @smoke
    Scenario: Login as a supervisor
      Given user is on Docuport login page
      When user enters username for supervisor
      And user enters password for supervisor
      And user clicks login button
      Then user should see the home page for supervisor

  @wip
  Scenario: Login as a client map practice
    When user enters credentials
      | username | b1g1_client@gmail.com |
      | password | Group1                |
    Then user should see the home page for client