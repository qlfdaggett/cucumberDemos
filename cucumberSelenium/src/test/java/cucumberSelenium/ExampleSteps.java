package cucumberSelenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleSteps {
	WebDriver driver;
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";
	
	@Before
	public void initDriver() {
		System.setProperty(chromeProp, chromeDriverPath);
		driver = new ChromeDriver();
	}
	
	@Given("I am on the Google search page")
	public void I_visit_google() {
		driver.get("https://www.google.com");
	}
	
	@When("I search for {string}")
	public void search_for(String query) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(query);
		element.submit();
	}
	
	@Then("the page title should start with {string}")
	public void checkTitle(String titleStartsWith) {
		new WebDriverWait(driver,10L).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith(titleStartsWith);
			}
		});
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}
}
