package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.PropertyReader;

public class SentPage {
	public static WebElement element = null;

	public static WebElement logOutButton(WebDriver driver) {
		element = driver.findElement(By.xpath(PropertyReader.getProperty("main.log_out_button")));
		return element;
	}
}
