package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindFriendPage extends LoginPage {
	@FindBy(xpath = "//span[text()='Find friends']")
	WebElement findfriedbtn;
	@FindBy(xpath = "//span[text()='Suggestions']")
	WebElement suggestionsbtn;

	/**
	 * Method: To Find Friend in facebook
	 */
	public void userFindFriend() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(findfriedbtn));
			findfriedbtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(suggestionsbtn));
			wait.until(ExpectedConditions.visibilityOfAllElements(suggestionsbtn));
			suggestionsbtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
