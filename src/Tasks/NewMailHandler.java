package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Elements.MainPage;
import Elements.NewMailPage;
import Utils.PropertyReader;

public class NewMailHandler {

	public static void sendNewMail(WebDriver driver, String recipient, String subject, String text) {
		try {
			
			// Click for new mail page
			MainPage.newMailButton(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// Write mail's recipient
			NewMailPage.recipientInput(driver).sendKeys(recipient);
			// driver.manage().timeouts().implicitlyWait(50000000,
			// TimeUnit.SECONDS);
			
			NewMailPage.recipientInput(driver).sendKeys(Keys.TAB);
			Thread.sleep(20000);
			// Write mail's subject
			NewMailPage.subjectInput(driver).sendKeys(subject);
			// //Change iframe
			// driver.switchTo().frame(PropertyReader.getProperty("new_mail.text_area_iframe"));
			// //Write mail's text
			// NewMailPage.textArea(driver).sendKeys(text);
			// //Get back to default iframe
			// driver.switchTo().defaultContent();
			// Click button for send mail
			NewMailPage.sendButton(driver).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
