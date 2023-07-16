Feature: Docuport Login Feature

  Background:
    Given User is on Docuport login page

  @do
  Scenario Outline: Login as 4 users in Docuport
    When user enters credentials "<username>" and "<password>"
    Then user should see the home page for each users
      | advisor         | supervisor      | employee        | client        |
      | Home            | Home            | Home            | Home          |
      | Received docs   | Received docs   | Received docs   | Received docs |
      | My uploads      | My uploads      | My uploads      | My uploads    |
      | Clients         | Clients         | Clients         | Invitations   |
      | Invitations     | Users           | Users           |               |
      | Users           | Leads           | Bookkeeping     |               |
      | Leads           | Bookkeeping     | 1099 From       |               |
      | Bookkeeping     | 1099 Form       | Reconciliations |               |
      | 1099 Form       | Reconciliations |                 |               |
      | Reconciliations |                 |                 |               |
#    And user validates choose account pop up is visible
#   And user chooses account form drop down

    Examples:
      | username                  | password |
      | b1g3_advisor@gmail.com    | Group3   |
      | b1g3_supervisor@gmail.com | Group3   |
      | b1g3_employee@gmail.com   | Group3   |
      | b1g3_client@gmail.com     | Group3   |




  @ad
  Scenario: Create new client
    When login as an advisor
    And create a new client
    And validate that new client created
    Then Log out as an advisor
    Then log as a new client








