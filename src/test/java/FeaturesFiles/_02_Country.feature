Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to site
    When User enter username and password and click login button
    Then User should login successfully
    And Navigate to Country Page
    When User create a Country
    Then Success message should be displayed