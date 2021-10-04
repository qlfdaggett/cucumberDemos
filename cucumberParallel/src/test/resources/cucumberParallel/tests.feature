Feature: Testing Wikipedia Login
 	tests whether or not logging into wikipedia works 

  Scenario: Test if login button exists
  	Given I am on en.wikipedia.com
  	Then I verify that the login button exists
  	
  Scenario: Test if login button works
  	Given I am on en.wikipedia.com
  	When I click on the login button
  	Then I verify that I am now on the login page
  	
  Scenario: Test if login page buttons and fields exist
  	Given I am on en.wikipedia.com
  	When I click on the login button
  	Then I verify that the username input exists
  	And I verify that the password input exists
  	And I verify that the log in button exists
  	
  Scenario Outline: Test login functionality supplied with username and password
  	Given I am on en.wikipedia.com
  	When I click on the login button
  	And I fill username input with "<usrName>"
  	And I fill password input with "<pswd>"
  	And I click the sign in button
  	Then I can verify if "<usrName>" is logged in
  	
		Examples:
			| usrName			| pswd						 |
			| FdaggettQL	| rNAp52HKMHW67Vk8 |







  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
	