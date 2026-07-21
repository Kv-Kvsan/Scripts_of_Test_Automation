@Add_to_Cart
Feature: Add to cart module validation
Scenario: Verify the add to cart functionality

Given the user opens the URL of the Saucedemo application
Then the login page of the saucedemo should be displayed
Then the user should enter the Username as "standard_user"
And the user should enter the password as "secret_sauce"
When the user clicks the login button
Then the user should be directed to the inventory page of Saucedemo site
Then the user adds every products to the cart
Then user clicks the Add to cart button 
Then user removes the every products from the cart