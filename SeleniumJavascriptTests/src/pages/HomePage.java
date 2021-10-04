package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	private By navBarBy = new By.ByClassName("navbar-toggler collaspsed");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openNavBar() {
		WebElement navBar = driver.findElement(navBarBy);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", navBar);
		
		//navBar.click();
	}
	

}
