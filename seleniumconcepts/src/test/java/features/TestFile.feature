@smoketest
Feature: Login Functionality
Scenario Outline: 
Given the user navigates to "<web>"
Then the user click on myaccount
And the user enters "<username>" and "<password>" credentials 
And the user clicks on login button
Then the user navigate to the homepage
And validate the currentURL
Examples:
|web											|username				|password	|
|https://www.next.co.uk/						|gsantosh@hotmail.co.uk	|10Santosh	|
|https://www.next.co.uk/						|gsantosh@icloud.com    |20santhosh |

@Positivetest
Scenario: Landing page navigation
Given the user navigates to "https://www.next.co.uk/"
Then the user clicks on the landing page
And the user get the screenshot of the page 

@NegativeTest
Scenario: To check the endtoend functionality of the application
Given the user navigates to "https://www.next.co.uk/"
Then the use clicks on the men shopping page link












