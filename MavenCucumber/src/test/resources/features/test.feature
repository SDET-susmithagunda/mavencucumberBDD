Feature: Sample login

  Scenario: Successful login
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in
