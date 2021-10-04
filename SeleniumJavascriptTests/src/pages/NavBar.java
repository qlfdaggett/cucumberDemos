package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBar extends HomePage{
	
	private By howWeDoItBy = By.id("menu-item-80");
	private By aXpathBy = By.xpath("a");
	
	public NavBar(WebDriver driver) {
		super(driver);
	}
	
	public void clickHowWeDoIt() {
		WebElement button = driver.findElement(howWeDoItBy).findElement(aXpathBy);
		button.click();
	}
}