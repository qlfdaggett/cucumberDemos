Feature: clicking through different courses
  I want to click through different khan academy courses and verify that all the buttons work

	Scenario: Verify courses button existence
		Given I am on the khan academy homepage
		Then I verify that the courses button exists
		
	Scenario: Verify menu pops up when courses clicked
		Given I am on the khan academy homepage
		When I click on the course button
		Then I verify that the course menu is open
		
	Scenario: Verify multivariable calculus link
		Given I am on the khan academy homepage
		When I click on the course button
		And I click on the multivariable calculus button
		Then I verify 
		