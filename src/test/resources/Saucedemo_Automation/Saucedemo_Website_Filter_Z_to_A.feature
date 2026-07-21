@Filter_Reverse_Alphabetical_Order
Feature: Filter module validation
Scenario: Verify the filter functionality

Given the user opens the URL of the Saucedemo application
Then the login page of the saucedemo should be displayed
Then the user should enter the Username as "standard_user"
And the user should enter the password as "secret_sauce"
When the user clicks the login button
Then the user should be directed to the inventory page of Saucedemo site 
Then the user clicks the filter option
Then user sorts the products in reverse alphabetical order
Then the user retrieves the product names and confirm whether it is changed or not
