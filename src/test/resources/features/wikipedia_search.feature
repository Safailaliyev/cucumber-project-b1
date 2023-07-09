Feature: Wikipedia Search Functionality

  @AS
  Scenario Outline: Wikipedia Search Functionality for Steve Jobs
    Given User is on Wikipedia home page
    When User types "<name>" is the wiki search box
    And User clicks wiki search button
    Then User sees "<name>" is in the "<title>"

    Examples:
      | name       | title      |
      | Steve Jobs | Steve Jobs |
      | Steve Jobs | Steve Jobs |
      | Steve Jobs | Steve Jobs |


