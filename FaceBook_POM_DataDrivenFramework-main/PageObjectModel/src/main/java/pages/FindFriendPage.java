package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			findfriedbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			suggestionsbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
