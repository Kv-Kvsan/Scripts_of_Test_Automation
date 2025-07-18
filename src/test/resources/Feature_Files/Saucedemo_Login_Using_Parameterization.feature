@Login 
Feature: Open saucedemo.com site

@Loginpositive
Scenario: Successful login with valid credentials

Given the user opens the URL of the Saucedemo application
Then the login page of the saucedemo should be displayed
Then the user should enter the Username as "standard_user"
And the user should enter the password as "secret_sauce"
When the user clicks the login button
Then the user should be directed to the inventory page of Saucedemo site
Then the user can quit browser


@Loginnegative 
  Scenario: Unsuccessful login with invalid credentials
    Given the user loads the URL of the Saucedemo application
    Then the user should see the login form
    Then the user types an incorrect Username as "invalid_user"
    Then the user types an incorrect Password as "wrong_password"
    When the user clicks the Sign-In button
    Then the application should show an error saying "Epic sadface: Username and password do not match any user in this service"
    Then the user should close the browser