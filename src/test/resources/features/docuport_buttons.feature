Feature: validate the buttons

  Background:
    Given User is on Docuport login page

@va
  Scenario Outline: login all roles
    When user enters credentials "<username>" and "<password>"
    And click on Received documents
    And validate search button is displayed
    And validate download button is displayed
    And validate Received docs is displayed
    Then click on MyUploads
    Then validate search button is displayed
    Then validate download button is displayed
    Then validate MyUploads is displayed

    Examples:
      | username                  | password |
      | b1g3_advisor@gmail.com    | Group3   |
      | b1g3_supervisor@gmail.com | Group3   |
      | b1g3_employee@gmail.com   | Group3   |
      | b1g3_client@gmail.com     | Group3   |

