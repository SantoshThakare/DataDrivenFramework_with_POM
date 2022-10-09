package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WatchVideosPage extends LoginPage  {

	@FindBy(xpath = "//span[text()='Watch']")
	WebElement watchbtn;
	@FindBy(xpath = "//div [@id=\"watch_feed\"]")
	WebElement clickwatchbtn;
	/**
	 *  To Watch Video in facebook
	 */
	public void userWatchVideos() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			wait.until(ExpectedConditions.visibilityOfAllElements(loginBtn));
			loginBtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(watchbtn));
			watchbtn.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 100)");
			Thread.sleep(3000);
			}
			for (int i = 1; i < 10; i++) {
 			js.executeScript("window.scrollBy(0, -100)");
			Thread.sleep(3000);
			}
			wait.until(ExpectedConditions.visibilityOfAllElements(clickwatchbtn));

			clickwatchbtn.click();
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeSelected(homebtn));

			homebtn.click();


		} catch (Exception e) {

		}
	}

}
