@Filter_Price_Low_to_High
Feature: Filter the price value  validation
Scenario: Verify the Low to High price filter functionality

Given the user opens the URL of the Saucedemo application
Then the login page of the saucedemo should be displayed
Then the user should enter the Username as "standard_user"
And the user should enter the password as "secret_sauce"
When the user clicks the login button
Then the user should be directed to the inventory page of Saucedemo site 
Then the user clicks the filter dropdown
Then user sorts the prices from low to high
Then the user retrieves the prices lists and confirm whether the prices are changed from low to high
