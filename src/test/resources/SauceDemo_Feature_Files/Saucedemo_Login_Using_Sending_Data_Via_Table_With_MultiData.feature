Feature: Authentication testing on Saucedemo login page
Scenario Outline: Logging in with authorized user credentials

  Given the user navigates to the Saucedemo site
  Then the login screen should appear to the user
  Then the user enters username "<username>" and password "<password>"  
  When the user performs the login action
  Then the user should land on the product inventory screen
  Then the application should terminate the browser session

  Examples:
    | username                | password      | 
    | standard_user           | secret_sauce  | 
    | problem_user            | secret_sauce  |
    | performance_glitch_user | secret_sauce  | 