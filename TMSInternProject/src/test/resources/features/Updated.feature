@Updated
  Feature: Test User login
  Background:
    Given User must have valid credentials
    When User logs in
    And User selects the hub and enters TMS hub
    And User clicks on the settings page
    And User navigates to the linehaul details
    Then User lands on Linehaul page


   @AddNewConnection
  Scenario: To add a new Connection
    Given User must stay on the Linehaul details page
    When User clicks on the add new connection button
    And User must enter all the valid details on the fields
    Then The connection will be established succesfully

  @SearchByDestintionHub
  Scenario: To Search by destination hub
    Given User must be staying on the linehaul details page
    When User clicks on the Destination Hub
    And Select the desired hub to search
    Then User will be able to see the hubs matching the search


  @SearchByHubname
  Scenario: To Search by hub name
    Given User must be staying on the linehaul details web page
    And The user creates new connection
    When User Enters the desired hubname in the search bar
    And User clicks on the search icon
    Then User be able to see the hubs matching the search

  @SortbyDestinatiohub
  Scenario: To Sort bases on Destination hub
    Given User must be on the linehaul deails page
    When User click the destination hub down arrow
    Then User be able to see the descending sorted linehaul details


  @UndoConnection
  Scenario: To Undo the deleted connection
    Given User will be on the linehaul details page
    And The new connection must be created by user
    When User Clicks on the delete icon
    And Select the undo option
    Then Validate whether the connection has been restored.


  @ValidateTimeField @Negative
  Scenario: Validate the start time field
    Given The user must be on the Add new connection page
    When User enter invalid values in the start time field
    And User clicks on the save button
    Then Mandatory error message will be displayed

