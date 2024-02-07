Feature: Register

  Scenario: 01 - Success register
    Given the trek register page is loaded
    When the user enters correct values to the fields and clicks on create new account
    Then the new user should be registered