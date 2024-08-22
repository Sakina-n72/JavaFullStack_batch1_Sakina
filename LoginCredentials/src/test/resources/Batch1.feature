Feature:test UseLogin with different credentials
Scenario: Verify the login functionality for the OpenCart
Given Open Google and navigate to OpenCartPage
When valid <"username"> and <"password"> is entered 
Then user should be able to login successfully