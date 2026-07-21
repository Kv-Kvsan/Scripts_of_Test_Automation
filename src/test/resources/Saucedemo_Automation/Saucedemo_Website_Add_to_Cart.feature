@Login 
Feature: Add to cart module validation
Scenario: Verify the add to cart functionalities

Given the user hits the URL of the Saucedemo application
Then the login page of the saucedemo will be displayed
Then the user enters the Username as "standard_user"
Then the user enters the password as "secret_sauce"
Then the user presses the login button
Then the user lands on the inventory page 
Then the user adds every products to the cart
Then user clicks the Add to cart button 
Then user removes the every products from the cart