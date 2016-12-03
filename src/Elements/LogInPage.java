package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.PropertyReader;

public class LogInPage {
	public static WebElement element = null;
	
	public static WebElement emailInPut(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("login.email")));
		return element;
	}
	
	public static WebElement passwordInPut(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("login.password")));
		return element;
	}
	
	public static WebElement logInButton(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("login.login_buttton")));
		return element;
	}
}
