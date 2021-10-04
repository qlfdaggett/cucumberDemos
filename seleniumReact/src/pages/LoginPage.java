package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	String username = "fdaggett@qualitylogic.com";
	String password = "=B5hWA+d7bLgb#dg";
	
	By loginInputBy = new By.ByCssSelector("input[class='inputtext _55r1 _6luy'");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void verifyLoginInput() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(loginInputBy));
			
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}
	
	public void logIn() {
		
	}

}
