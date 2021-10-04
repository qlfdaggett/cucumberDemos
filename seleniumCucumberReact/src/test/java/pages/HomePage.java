package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	By coursesButtonBy = By.className("_tr38f8i");
	By multivarialeCalculusButtonBy = By.className("_xy39ea8");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void verifyCoursesButtonExists() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(coursesButtonBy));
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
		Assert.assertTrue(true);
	}

	public void clickCoursesButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(coursesButtonBy));
		driver.findElement(coursesButtonBy).click();

	}

	public void verifyCoursesMenuIsOpen() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(multivarialeCalculusButtonBy));
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
		Assert.assertTrue(true);
	}

}
