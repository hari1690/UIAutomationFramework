#Author
#Date
#Description
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks login button
    Then user is navigated to the Home page
