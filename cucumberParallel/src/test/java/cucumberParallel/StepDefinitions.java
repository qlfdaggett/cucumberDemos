package cucumberParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LogInPage;



public class StepDefinitions {
	WebDriver driver;
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";

	String baseUrl = "https://en.wikipedia.org/";
	
	@Before
	public void initDriver() {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		System.setProperty(chromeProp, chromeDriverPath);
		driver = new ChromeDriver(options);
		
		System.out.println("Thread ####: " + Thread.currentThread().getId());
	}
	
	@Given("I am on en.wikipedia.com")
	public void i_am_on_en_wikipedia_com() {
		driver.get(baseUrl);
	}

	@Then("I verify that the login button exists")
	public void i_verify_that_the_login_button_exists() {
		HomePage homePage = new HomePage(driver);
		homePage.verifyLoginButton();
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		HomePage homePage = new HomePage(driver);
		homePage.clickLoginButton();
	}

	@Then("I verify that I am now on the login page")
	public void i_verify_that_i_am_now_on_the_login_page() {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.verifyOnLogInPage();
		
	}
	
	@Then("I verify that the username input exists")
	public void i_verify_that_the_username_input_exists() {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.verifyUserInputExists();
	}

	@Then("I verify that the password input exists")
	public void i_verify_that_the_password_input_exists() {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.verifyPasswordInputExists();
	}

	@Then("I verify that the log in button exists")
	public void i_verify_that_the_log_in_button_exists() {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.verifyLogInButtonExists();
	}
	
	@When("I fill username input with {string}")
	public void i_fill_username_input_with(String string) {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.enterUserName(string);
	}

	@When("I fill password input with {string}")
	public void i_fill_password_input_with(String string) {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.enterPassword(string);
	}

	@When("I click the sign in button")
	public void i_click_the_sign_in_button() {
		LogInPage logInPage = new LogInPage(driver);
		logInPage.signIn();
	}

	@Then("I can verify if {string} is logged in")
	public void i_can_verify_if_is_logged_in(String string) {
		HomePage homePage = new HomePage(driver);
		homePage.verifyLoggedIn(string);
	}


	
	@After
	public void closeDriver() {
		driver.close();
	}
}

/*
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
	@Given("Step from {string} in {string} feature file")
	public void step(String scenario, String file) {
		System.out.format("Thread ID - %2d - %s from %s feature file.\n", 
				Thread.currentThread().getId(),scenario,file);
	}

}
*/