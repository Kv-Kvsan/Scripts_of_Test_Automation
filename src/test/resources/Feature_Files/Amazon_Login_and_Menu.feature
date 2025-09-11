@Login
Feature: Testing the Amazon Application

@Signin
Scenario: Testing the Login module of Amazon

    Given the user launches the Amazon application
    When the user clicks the Sign-in button
    Then the user should be redirected to the Sign-in page	 where the user can enter the valid credentials
    | username                | keerthivb2023@gmail.com  |
    | password                | Vasan06@                 |
    Then the user can click the Sign-in button
    Then the user should be redirected to the Amazon home page
    Then the user can close the browser once the login is successfully done

    
@Menu
Scenario: Testing the Menu bar module of Amazon

Given the user opens the URL of Amazon
Then the user can see the homepage of Amazon
When the user clicks each menu item, the corresponding page is displayed
Then the user can quit the browser of an application