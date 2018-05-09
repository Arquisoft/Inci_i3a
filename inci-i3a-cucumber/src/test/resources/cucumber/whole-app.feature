Feature: Test everything

	Scenario: Test everythin
		Given agent registration data
		When there are no empty fields
		Then the agent is created
		
	
		Given valid agent login
		When the username/password combination is correct
		Then the id of the agent is returned
	
		Given data for the incident
		When the incident is sent
		Then the id assigned to the incident is returned
		
	
		Given login data for an operator
		When the login combination is correct
		Then operator get a list of its incidents
		
	
		Given a comment
		And an incident to comment
		When an operator writes the comment into a incident
		Then the incident should store the comment
		
	
		Given an incident
		When an operator closes the incident
		Then the incident status must be changed