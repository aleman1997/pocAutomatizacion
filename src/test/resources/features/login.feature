Feature: Login
  @ScenarioValidData
  Scenario: Succesful login with valid credentials
    Given the user is on the login page
    When they log in with username "Admin" and password "admin123"
    Then succesfull login

  @ScenarioIncorrecData
    Scenario: Failed login with incorrect credentials
      Given the user is on the login page
      When they log in with username "Admin" and password "losimbahs"
      Then invalidate login

  @ScenarioEmptyFields
  Scenario: Login with empty fields
    Given the user is on the login page
    When they log in with username "" and password ""
    Then should show required


