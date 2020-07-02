#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
    

   
Feature: Validate IBG Bulletin Web App Test
Scenario: Check Bulletin Web Page Features
Given user is on bulletin homepage
Then user enter name and email
Then user select location
Then user enter captcha and submit
Then user closes web app
