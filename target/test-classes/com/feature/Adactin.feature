Feature: checking the booking functionality of Adactin Hotel Application

Scenario: user checking the login page with valid username and password
Given user launch the application
When  user enter the valid user name in the field
And user enter the valid password in the field
Then  user click the login button   

Scenario: user checking the hotel availability with mandatory fields
Given user redirected to search hotel page
When user enter the location detail
And user enter the hotel name
And user enter the room type
And user enter the no.of.rooms needed
And user enter the Check in Date
And user enter the checkout date
And user enter the no of adults  
And user enter the no of childs
And user click the search button
And user click the checkbox to conform rooms
Then user click the continue button

Scenario: user conform the rooms with payment options
Given user redirected to payment page
When user enter the first name
And user enter the last name
And user enter the billing address
And user enter the credit card no
And user enter the credit card type
And user enter the expiry date
And user enter the cvv no
And user click the book now buttom
Then user click the my litenary button

