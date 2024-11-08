Feature: Add admin
  @ScenarioValidData
  Scenario: How user i want to add a new admin
    Given the user is on the login page
    When they log in with username "Admin" and password "admin123"
    Then succesfull login
    And the user add a new administrator