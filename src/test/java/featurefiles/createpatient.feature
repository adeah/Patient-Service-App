Feature: Create patient 

Scenario: Add a user with valid inputs
Given I navigate to <url>
When I verify the page
And I enter first name
And I enter middle name
And I enter last name
And I enter phone number
And I enter date of birth
And I enter address
And I click on the add user button
Then User card should be added to the user list

