Feature: Validating login functionality with multiple credentials on Saucedemo
Scenario: Login with multiple user credentials

  Given the user navigates to the Saucedemo application
  Then the login screen should be displayed
  Then the user attempts login with the following credentials
    | username                | password      |
    | standard_user           | secret_sauce  |
    | problem_user            | secret_sauce  |
    | performance_glitch_user | secret_sauce  |
  Then the application should close the browser after validation
