Feature: Open leafground.com feature
Scenario: Open the LeafGround site and verify all the menus

Given the user opens the URL of the LeafGround site
Then the dashboard page should be displayed
When the user hovers over the menu on the right-hand side
And the user can close the browser