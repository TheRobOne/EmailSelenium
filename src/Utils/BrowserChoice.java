package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChoice {

	public static WebDriver browserChoice(String browser){
		WebDriver driver = null;
		switch(browser){
		case "firefox":
			driver = firefox();
		case "chrome":
			driver = chrome();
		}
		return driver;
		
	}
	
	public static WebDriver firefox(){
		System.setProperty("webdriver.gecko.driver", PropertyReader.getProperty("firefox"));
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver chrome(){
		System.setProperty("webdriver.chrome.driver", PropertyReader.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
