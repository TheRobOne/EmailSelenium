package Tasks;

import org.openqa.selenium.WebDriver;

import Elements.MainPage;
import Elements.SentMailsPage;

public class SentMailsHandler {

	public static void deleteAllMails(WebDriver driver){
		//Go to sent mails
		MainPage.sentEmailsButton(driver).click();
		//Select all mails by ticking checkbox
		SentMailsPage.allMailsChechbox(driver).click();
		//Click delete button
		SentMailsPage.deleteAllMailsButton(driver).click();
	}
}
