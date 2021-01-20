@AddnewConnection
  Feature: Add New Connection
    Background: To add a new connection
      Given Blibli Dashboard
      Scenario: Add new connection
        When I click on the Add new connection
        And Enter Origin hub name
        And Enter Destination hub name
        And Select the date from calendar
        And Select the repeat from dropdown
        And Enter the start time
        And Enter the transit time
        And Select the vehicle type
        And Click on save button
        Then Linehaul Nework details page will be loaded
