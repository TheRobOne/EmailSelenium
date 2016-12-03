package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Elements.LogInPage;
import Utils.PropertyReader;

public class LogInPageHandler {

	public static void logIn(WebDriver driver, String login, String password){
		
		//Wait for finish loading page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Maximize window
		driver.manage().window().maximize();
		//Go to URL
		driver.get(PropertyReader.getProperty("url"));
		
		try{
			LogInPage.emailInPut(driver).sendKeys(login);
			LogInPage.passwordInPut(driver).sendKeys(password);
			LogInPage.logInButton(driver).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
