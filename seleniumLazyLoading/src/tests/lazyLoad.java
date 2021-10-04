package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lazyLoad {
	
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";
	
	String baseUrl = "https://shredcapital.com/";	
	
	By iconBarBy = new By.ByClassName("icon-bar");
	By iconBarButtonBy = new By.ByCssSelector("button[class='navbar-toggler collapsed");  //ByClassName("navbar-togglercollapsed");
	By whoWeAreLinkBy = new By.ById("menu-item-78888");

	@Test
	public void lazy() throws InterruptedException {
		System.setProperty(chromeProp,chromeDriverPath);
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wdw = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get(baseUrl);
		
		//Thread.sleep(5000);
		wdw.until(ExpectedConditions.presenceOfElementLocated(iconBarBy));
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(iconBarButtonBy).click();
		
		wdw.until(ExpectedConditions.presenceOfElementLocated(whoWeAreLinkBy));
		driver.findElement(whoWeAreLinkBy).click();
	}

}
