package TestCases;

import org.testng.annotations.Test;

import Tasks.LogInPageHandler;

public class LogIn {

	@Test
	public void logIn(){
		LogInPageHandler.logIn(driver, login, password);
	}
}
