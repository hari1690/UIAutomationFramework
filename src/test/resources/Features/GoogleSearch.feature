Feature: Feature to test google search functionality

  Scenario Outline: Validate google search is working
    Given browser is open
    When user is on google page
    And search using the <search term>
    Then user is on google search page with the correct <search term>

    Examples: 
      | search term | 
      | Udemy       | 
