package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Tasks.LogInPageHandler;
import Utils.BrowserChoice;
import Utils.CSVReader;

public class LogIn {

	WebDriver driver = BrowserChoice.firefox();
	
	@Test
	public void logIn(){
		ArrayList<String[]> list = CSVReader.csvReader("resources/loginPasswordSender.csv");
		LogInPageHandler.logIn(driver, list.get(0)[0], list.get(0)[1]);
	}
	
	@AfterTest
	public void quit(){
		//driver.quit();
	}
}
