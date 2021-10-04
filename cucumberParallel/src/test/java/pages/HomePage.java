package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	private By loginButtonBy = By.linkText("Log in");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyLoginButton() {
		Assert.assertTrue(driver.findElements(loginButtonBy).size() > 0);
	}
	
	public void clickLoginButton() {
		driver.get(driver.findElement(loginButtonBy).getAttribute("href"));
	}

	public void verifyLoggedIn(String string) {
		Assert.assertTrue(driver.findElements(By.linkText(string)).size() > 0);
	}
}