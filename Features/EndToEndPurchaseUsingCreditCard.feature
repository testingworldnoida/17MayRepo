Feature: Test End to End Items purchase functionality using credit card

	Background: User start browser and login to the application
		Given User is on login page 
		When User enters username "Testing"
		And User enters password "Hello"
		And User clicks on signin button
		And User gets hello message

	@Sanity
	Scenario: Test Search and Purchase electrnic item and pay using credit card
		Then User should be logged in
		And User should get welcome message
		When User enters data in search box
		And User clicks on Search button
		Then Search results should be displayed
			qweqweq