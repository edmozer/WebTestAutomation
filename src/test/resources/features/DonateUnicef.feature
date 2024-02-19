Feature: Donate

  Background: The user is trying to donate for the first time

    Scenario: 01 - Donate via home
      Given The worldwide home page is loaded
      When the user clicks on donate and gets redirected
      Then the user should be able to donate

