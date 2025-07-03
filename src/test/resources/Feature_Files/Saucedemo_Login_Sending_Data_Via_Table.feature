Feature: Open saucedemo.com site
Scenario: Open saucedemo site and verify the login module

Given the user opens the URL of the Saucedemo URL
Then the login page of the saucedemo page should be displayed
Then the user should enter the below credentials
|standard_user|
|secret_sauce|
When the user clicks login
Then the user will be directed to the inventory page of Saucedemo site
Then the user can quit the chrome browser