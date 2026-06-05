Feature: Login functionality of Saucedemo website
Scenario: Successful login with valid credentials

Given the user launches the Saucedemo application
Then the login page should be visible to the user
Then the user enters valid login credentials
| username       | standard_user |
| password       | secret_sauce  |
When the user submits the login form
Then the user should be redirected to the inventory page
Then the browser should be closed after verification
