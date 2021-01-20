@LoginFeature
  Feature: LoginFeature
    Background: Login to Blibli Messenger
      Given Blibli Messenger
    Scenario: Login to Blibli Messenger
      When I click on the username
      And I enter the username
      And I click on the password
      And I enter the password
      And Hit Enter key
      And Click Enter to TMS
      And Enter "TMS Hub"
      And Dashboard will be entered
      And Select Settings from sidebar
      And Select Linehaul Details
      And Click on Add new connection
      Then Popup menu opens
      And Enter Origin hub name as "TM"
      And I select "TMS HUB" from the dropdown
      And Enter Destination hub name as "Cep"
      And I select "Cepher Hub" from the dropdown
      And I select the date from the calendar
      And I select the repeat frequency
      And I enter the Start time as "12:00"
      And I enter the Transit time as "90:00"
      And I select the vehicle type
      And Click on the save button
      And Click on the Up Arrow near destination hub to sort in ascending order
      And Click on the Down Arrow near destination hub to sort in descending order








