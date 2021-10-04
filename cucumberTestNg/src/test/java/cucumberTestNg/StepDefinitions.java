package cucumberTestNg;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	@Given("I have the test open")
	public void nothing() {
	}
	
	@When("I run the test")
	public void moreNothing() {
	}
	
	@Then("I get a pass")
	public void returnTrue() {
		Assert.assertTrue(true);
	}
	
	

}
