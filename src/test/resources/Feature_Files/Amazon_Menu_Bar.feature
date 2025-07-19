@hooks
Feature: Testing the Amazon Application Menu Bar
Scenario: Testing the Menu bar module of Amazon

Given the user opens the URL of Amazon
Then the user can see the homepage of Amazon
When the user clicks each menu item, the corresponding page is displayed
Then the user can quit the browser of an application