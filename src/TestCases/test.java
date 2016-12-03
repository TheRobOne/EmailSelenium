package TestCases;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 

public class test {

	public WebDriver driver;
	 
	  @Test
	 
	  public void main() {
	 
		// Find the element that's ID attribute is 'account'(My Account)
	 
	      driver.findElement(By.id("mailCounter")).click();
	 
	      
	  }
	 
	  @BeforeMethod
	 
	  public void beforeMethod() {
	 
		  // Create a new instance of the Firefox driver
		  System.setProperty("webdriver.gecko.driver", "/home/maciek/Documents/Selenium/GeckoDriver/geckodriver");
	 
	      driver = new FirefoxDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	      driver.get("http://www.onet.pl/");
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
		  // Close the driver
	 
	      driver.quit();
	 
	  }
	
}
