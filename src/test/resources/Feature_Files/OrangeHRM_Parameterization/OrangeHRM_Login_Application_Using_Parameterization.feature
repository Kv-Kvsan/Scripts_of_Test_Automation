@Login 
Feature: Open OrangeHRM demo site

@Loginpositive
Scenario: Login with valid credentials

Given the user opens the URL of the OrangeHRM Demo application
Then the login page of the OrangeHRM Demo should be displayed
Then the user should enter the Username as "Admin"
And the user should enter the password as "admin123"
When the user clicks the login button
Then the user should be directed to the dashboard page of OrangeHRM demo site
Then the user can quit browser

@Loginnegative
Scenario: Login with Invalid credentials

Given the user opens the URL of the OrangeHRM Demo application
Then the login page of the OrangeHRM Demo should be displayed
Then the user should enter the Username as "admin123"
And the user should enter the password as "Admin"
When the user clicks the login button
Then the user should receive the message
Then the user can quit browser

@LoginBlank
Scenario: Login with Blank credentials

Given the user opens the URL of the OrangeHRM Demo application
Then the login page of the OrangeHRM Demo should be displayed
Then the user should enter the Username as ""
And the user should enter the password as ""
When the user clicks the login button
Then the user should get the error message for username
Then the user should get the error message for password
Then the user can quit browser