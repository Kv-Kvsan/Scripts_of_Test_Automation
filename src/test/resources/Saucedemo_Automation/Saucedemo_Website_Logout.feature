@Logout
Feature: Saucedemo Logout
Scenario: Verify the logout functionality of the Saucedemo

Given the user opens the URL of the Saucedemo application
Then the login page of the saucedemo should be displayed
Then the user should enter the Username as "standard_user"
And the user should enter the password as "secret_sauce"
When the user clicks the login button
Then the user should be directed to the inventory page of Saucedemo site
When the user clicks menu button on the left hand side
Then the user clicks logout
Then the user redirects to the login page