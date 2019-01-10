Feature: Credit Card Login

Scenario: Login unsuccessfull
Given User is on the login page
When User enters incorrect userame and pasword
And clicks Sign On button
Then error message is displayed