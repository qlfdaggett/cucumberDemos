package seleniumCucumberReact;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
	WebDriver driver;
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";
	
	String baseUrl = "https://www.khanacademy.org/";
	
	@Before
	public void initDriver() {
		System.setProperty(chromeProp, chromeDriverPath);
		driver = new ChromeDriver();
	}
	
	@Given("I am on the khan academy homepage")
	public void i_am_on_the_khan_academy_homepage() {
		driver.get(baseUrl);
	}
	
	@Then("I verify that the courses button exists")
	public void i_verify_that_the_courses_button_exists() {
		HomePage homePage = new HomePage(driver);
		homePage.verifyCoursesButtonExists();
	}
	
	@When("I click on the course button")
	public void i_click_on_the_course_button() {
		HomePage homePage = new HomePage(driver);
		homePage.clickCoursesButton();
	}
	
	@Then("I verify that the course menu is open")
	public void i_verify_that_the_course_menu_is_open() {
		HomePage homePage = new HomePage(driver);
		homePage.verifyCoursesMenuIsOpen();
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}
}
