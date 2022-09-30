package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			watchbtn.click();
			driver.manage().timeouts().implicitlyWait(140, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
			}
			for (int i = 1; i < 10; i++) {
 			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			clickwatchbtn.click();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			Thread.sleep(4000);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		} catch (Exception e) {

		}
	}
	
}
