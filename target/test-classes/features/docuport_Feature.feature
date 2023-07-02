Feature: Docuport Login Feature

  Background:
    Given User is on Docuport login page

  @do
  Scenario Outline: Login as 4 users in Docuport
    When user enters credentials "<username>" and "<password>"
    And click login button

    Then user should see the home page for each users
      | client        | advisor         | supervisor      | employee        |
      | Home          | Home            | Home            | Home            |
      | Received docs | Received docs   | Received docs   | Received docs   |
      | My uploads    | My uploads      | My uploads      | My uploads      |
      | Invitations   | Clients         | Clients         | Clients         |
      |               | Invitations     | Users           | Users           |
      |               | Users           | Leads           | Bookkeeping     |
      |               | Bookkeeping     | 1099 Form       | Reconciliations |
      |               | 1099 Form       | Reconciliations |                 |
      |               | Reconciliations |                 |                 |
    Examples:
      | username                  | password |
      | b1g3_client@gmail.com     | Group3   |
      | b1g3_advisor@gmail.com    | Group3   |
      | b1g3_supervisor@gmail.com | Group3   |
      | b1g3_employee@gmail.com   | Group3   |







