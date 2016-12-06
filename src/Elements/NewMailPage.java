package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.PropertyReader;

public class NewMailPage {
public static WebElement element = null;
	
	public static WebElement recipientInput(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("new_mail.recipient_input")));
		return element;
	}
	
	public static WebElement subjectInput(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("new_mail.subject_input")));
		return element;
	}
	
	public static WebElement textArea(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("new_mail.text_area")));
		return element;
	}
	
	public static WebElement sendButton(WebDriver driver){
		element = driver.findElement(By.xpath(PropertyReader.getProperty("new_mail.send_button")));
		return element;
	}
}
