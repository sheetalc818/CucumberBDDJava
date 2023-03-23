
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

@FunctionalTest
Feature: login page of Application 

#@SmokeTest 
#Scenario: Verification of Reset button 
#Given Open the Chrome and launch the application			
#When Enter the Username and Password			
#Then Reset the credential

#@End2End @SmokeTest
#Scenario: Checking Login button functionality
#Given Launch Browser and Launch application 
#When  Insert Username and Password
#Then  Click on Login button  

#@SmokeTest 
#Scenario: Checking Login functionality on FB
#Given Launch Browser 
#And   Launch FB application 
#When  User enters "testingtestdatablz@gmail.com" and "testing"
#Then  Facebook Home page is successfully displayed 

#@SmokeTest @RegressionTest
Scenario Outline: Checking Login functionality on FB
Given Launch Browsers 
And   Launch FB applications 
When  Enter the Username "<username>" and Password "<password>" 
Examples:                      		
|username  										 |password    |
|sheetalc818@gmail.com	       |testing     |  
|testingtestdatablz@gmail.com  |testing123  |	



 
