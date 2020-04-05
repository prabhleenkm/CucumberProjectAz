Feature: Login into Application 


Scenario Outline: Positive test validating login 

	Given Navigate to Amazon homepage
	When Amazon landing page is displayed 
	Then User signs in to the application with "<username>" and "<password>"
	And Verify that user is succesfully logged in 
	
	
	Examples: 
		| username   | password |
		| kaurprabhleen89@gmail.com| Test@1234 |
		
		
		
		
		
