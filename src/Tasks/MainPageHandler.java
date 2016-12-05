package Tasks;

import org.openqa.selenium.WebDriver;

import Elements.MainPage;

public class MainPageHandler {
	
	public static void logOut(WebDriver driver){
		MainPage.logOutButton(driver).click();
	}
}
