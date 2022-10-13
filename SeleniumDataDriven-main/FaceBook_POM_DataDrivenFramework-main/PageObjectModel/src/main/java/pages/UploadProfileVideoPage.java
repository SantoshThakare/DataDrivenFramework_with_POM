package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UploadProfileVideoPage extends LoginPage {
	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement homebtn;

	@FindBy(xpath = "//span[contains(text(),'Photo/video')]")
	WebElement photovideobtn;

	@FindBy(xpath = " //span[contains(text(),'Add photos/videos')]")
	WebElement addbtn;

	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;

	@FindBy(xpath = "//div[@aria-label='Write a comment']")
	WebElement commentbox;

	@FindBy(xpath = "(//div[@aria-label='Like'])[1]")
	WebElement likebtn;

	/**
	 *  To post image in facebook
	 */
	public void userHomepageImagePost() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(photovideobtn));
			photovideobtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(addbtn));
			addbtn.click();

			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\auto_photos.exe")
					.waitFor(50, TimeUnit.SECONDS);
			System.out.println("Upload image post");
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(postbtn));
			wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
			postbtn.click();
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	/**
	 * To post video in facebook
	 */
	public void userHomePageVideoPost() {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(photovideobtn));
			photovideobtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(addbtn));
			addbtn.click();
			Thread.sleep(5000);
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\AutoProfileVideo.exe")
					.waitFor(90, TimeUnit.SECONDS);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
			wait.until(ExpectedConditions.elementToBeClickable(postbtn));

			postbtn.click();

			
		} catch (Exception e) {

		}
	}

	/**
	 * To Like post in facebook
	 * @throws InterruptedException
	 */

	public void userHomePageLikePost() throws InterruptedException {
		emailId.sendKeys(prop.getProperty("emailId"));
		password.sendKeys(prop.getProperty("password"));
		wait.until(ExpectedConditions.visibilityOfAllElements(loginBtn));
		loginBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 5; i++) {
		js.executeScript("window.scrollBy(0, 100)");
		Thread.sleep(3000);
		}
		for (int i = 1; i < 5; i++) {
		js.executeScript("window.scrollBy(0, 0)");
		Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.visibilityOfAllElements(likebtn));
		likebtn.click();
		
	}

}
