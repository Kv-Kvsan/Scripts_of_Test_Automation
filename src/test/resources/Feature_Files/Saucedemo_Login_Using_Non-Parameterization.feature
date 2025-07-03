Feature: Open saucedemo.com feature
Scenario: Open the saucedemo site and verify the login module

Given the user opens the URL of the Saucedemo
Then the login page of the saucedemo site should be displayed
Then the user can enter the Username as "standard_user"
And the user can enter the password as "secret_sauce"
When the user clicks login button
Then the user should be directed to the inventory page of Saucedemo
Then the user can quit the browser