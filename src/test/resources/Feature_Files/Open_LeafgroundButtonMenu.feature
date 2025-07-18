@Hovermenu
Feature: Open leafground.com feature
Scenario: Open the LeafGround site and verify the button module

Given the user opens the URL of the LeafGround
Then the dashboard page of the leafground site should be displayed
When the user clicks the elements menu on the right hand side, list of options should be displayed
Then the user clicks the button menu from the list of options
Then the user navigated to the button page
Then the user should perform certain actions