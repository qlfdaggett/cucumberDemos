package tests;

import pages.HomePage;
import pages.NavBar;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LazyLoadingTests {
	String chromeProp = "webdriver.chrome.driver";
	String chromeDriverPath = "/Users/fdaggett/Documents/WebDriver/chromedriver";
	
	String baseUrl = "https://shredcapital.com/";

	@Test
	public void testHowWeDoItNavBarButton() throws InterruptedException {
		System.setProperty(chromeProp, chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		By elementLocator = By.className("Fa fa-linkedIn");
		
		//WebElement linkedIn = driver.findElement(By.className("fa fa-linkedin"));
		
		int elemCount = driver.findElements(By.className("fa fa-linkedin")).size();
		System.out.println(elemCount);
		
		while (true) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight");
			
			wait.ignoring(NoSuchElementException.class).until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
			
			Thread.sleep(2000);
			
			if(driver.findElements(elementLocator).size() == elemCount)
				break;
			
			elemCount = driver.findElements(elementLocator).size();
			
			
		}
		
	/*	
		HomePage homePage = new HomePage(driver);
		NavBar navBar = new NavBar(driver);
		
		Thread.sleep(10000);
		
		homePage.openNavBar();
		navBar.clickHowWeDoIt();
		*/

	}
}
