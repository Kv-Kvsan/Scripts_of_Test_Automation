Feature: Open saucedemo.com feature
Scenario: Open the saucedemo site and verify the login module

Given the user opens the URL of the Saucedemo
Then the login page of the saucedemo site should be displayed
Then the user can enter the Username
And the user can enter the password
When the user clicks login button
Then the user should be directed to the inventory page of Saucedemo
Then the user should logout from the page
