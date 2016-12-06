package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.PropertyReader;

public class SentMailsPage {
	public static WebElement element = null;

	public static WebElement allMailsChechbox(WebDriver driver) {
		element = driver.findElement(By.xpath(PropertyReader.getProperty("sent.mails_all_checkobx")));
		return element;
	}
	
	public static WebElement deleteAllMailsButton(WebDriver driver) {
		element = driver.findElement(By.xpath(PropertyReader.getProperty("sent.delete_mails")));
		return element;
	}
}
