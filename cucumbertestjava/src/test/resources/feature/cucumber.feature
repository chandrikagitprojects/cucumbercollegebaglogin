Feature: user login
  user should be able to login with valid credentials

  Scenario: testin login with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user click on login
    Then user is navigated to homepage
