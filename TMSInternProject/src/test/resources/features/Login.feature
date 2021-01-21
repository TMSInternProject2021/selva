@LoginFeature
Feature: Test User login
  Scenario: User Log in
    Given User must have valid credentials
    When User logs in
    And User selects the hub and enters TMS hub
    And User clicks on the settings page
    And User navigates to the linehaul details
    Then User lands on Linehaul page