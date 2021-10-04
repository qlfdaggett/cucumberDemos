package pages;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;
	
	By userInputBy = By.name("wpName");
	By passwordInputBy = By.name("wpPassword");
	By logInButtonBy = By.name("wploginattempt");
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyOnLogInPage() {
		Assert.assertTrue(driver.getTitle().startsWith("Log in"));
	}

	public void verifyUserInputExists() {
		Assert.assertTrue(driver.findElements(userInputBy).size() > 0);
		
	}

	public void verifyPasswordInputExists() {
		Assert.assertTrue(driver.findElements(passwordInputBy).size() > 0);
		
	}
	
	public void verifyLogInButtonExists() {
		Assert.assertTrue(driver.findElements(logInButtonBy).size() > 0);
	}

	public void enterUserName(String string) {
		WebElement input = driver.findElement(userInputBy);
		input.clear();
		input.sendKeys(string);
	}

	public void enterPassword(String string) {
		WebElement input = driver.findElement(passwordInputBy);
		input.clear();
		input.sendKeys(string);
	}

	public void signIn() {
		driver.findElement(logInButtonBy).click();
	}

}
