package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tasks.LogInPageHandler;
import Tasks.MainPageHandler;
import Utils.BrowserChoice;
import Utils.CSVReader;

public class LogInDeleteSentMail {
	WebDriver driver = BrowserChoice.firefox();

	@BeforeTest
	public void logIn(){
		ArrayList<String[]> list = CSVReader.csvReader("resources/loginPasswordSender.csv");
		LogInPageHandler.logIn(driver, list.get(0)[0], list.get(0)[1]);
	}
	
	@Test
	public void sendMail(){
		
	}
	
	@AfterTest
	public void quit(){
		MainPageHandler.logOut(driver);
		driver.quit();
	}
}
