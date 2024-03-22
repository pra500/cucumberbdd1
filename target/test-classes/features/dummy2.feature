Feature: Add User Functionality


@regression
  Scenario: Add User with Valid Information
    Given I am logged in to the application as an admin
    When I navigate to the add user page
   