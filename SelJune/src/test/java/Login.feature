Feature: Login Leaftaps and Create CreateLeads 

Scenario: TC01 Enter positive values
Given Launch the Browser
And Load the Url
And Enter Username 
And Enter Password  
When I click on Login Button 
Then Verify Login is Success   

Scenario: TC02 Create Leads
Given Click on CRM/SFA Button 
And Click on Create Lead Buton
And Enter Company Name
And Enter First Name
And Enter Last Name
When I click on create lead button
Then Verify that New Lead should be create 