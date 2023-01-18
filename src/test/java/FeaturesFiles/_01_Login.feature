Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to site
    When User enter username and password and click login button
    Then User should login successfully
