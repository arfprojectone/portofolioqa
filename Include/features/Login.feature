Feature: Login feature

  Scenario Outline: Test login with valid credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigated to homepage
    
	Examples:
		| username | password |
		| Admin		 | admin123		|
		