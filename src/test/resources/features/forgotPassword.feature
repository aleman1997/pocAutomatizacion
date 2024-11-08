
Feature: Forgot Password

@forgotPassword
  Scenario: Password reset request
    Given the user is on the login page
    When the user clicks on forgot password and enters "Admin"
    Then should show a message of confirmation

  @ScenarioCancelButtonForgotPassword
  Scenario: the user press the button cancel
    Given the user is on the login page
    When the user press the cancel button
    Then will be redirect to login page

  @ScenarioEmptyField
    Scenario: reset password with empty field
    Given the user is on the login page
    When the user clicks on forgot password and enters ""
    Then should show required