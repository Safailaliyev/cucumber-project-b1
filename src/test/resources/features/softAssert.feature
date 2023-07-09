Feature: sample feature to demo soft assertions

  @soft
  Scenario: sample scenarios for soft assertions
    Given user is on Docuport login page
    When user enters credentials
      | username | b1g3_client@gmail.com |
      | password | Group3                |
    And user validates choose account pop up is visible
    And user chooses account form drop down