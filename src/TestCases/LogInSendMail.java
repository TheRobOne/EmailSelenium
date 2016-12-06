package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tasks.LogInPageHandler;
import Tasks.MainPageHandler;
import Tasks.NewMailHandler;
import Utils.BrowserChoice;
import Utils.CSVReader;

public class LogInSendMail {
WebDriver driver = BrowserChoice.firefox();
	
	
	@BeforeTest
	public void logIn(){
		ArrayList<String[]> list = CSVReader.csvReader("resources/loginPasswordSender.csv");
		LogInPageHandler.logIn(driver, list.get(0)[0], list.get(0)[1]);
	}
	
	@Test
	public void sendMail(){
		NewMailHandler.sendNewMail(driver, "selenium.recipient@op.pl", "test", "test test test");
	}
	
	@AfterTest
	public void quit(){
		//MainPageHandler.logOut(driver);
		//driver.quit();
	}
}
