package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FBHomePage extends LoginPage {
	@FindBy(xpath = "//span[text()='Find friends']")
	WebElement findfriedbtn;

	@FindBy(xpath = "//span[text()='Suggestions']")
	WebElement suggestionsbtn;

	@FindBy(xpath = "//span[text()='Marketplace']")
	WebElement marketplacebtnbtn;

	@FindBy(xpath = "//span[text()='Buying']")
	WebElement buyingbtn;

	@FindBy(xpath = "//span[text()='Watch']")
	WebElement watchbtn;

	@FindBy(xpath = "//div [@id=\"watch_feed\"]")
	WebElement clickwatchbtn;

	@FindBy(xpath ="//span[text()='Santosh Thakare'] [@class=\"b6ax4al1 lq84ybu9 hf30pyar om3e55n1\"]")
	WebElement profilebtn;

	@FindBy(xpath= "//div[@aria-label='Update profile picture']")
	WebElement upldbtn;

	@FindBy(xpath="//div[@aria-label='Upload Photo']")
	WebElement uploadphotobtn;

	@FindBy(xpath="//div[@aria-label='Save']")
	WebElement savebtn;

	@FindBy(xpath = "//span[contains(text(),'Photo/video')]")
	WebElement photovideobtn;

	@FindBy(xpath = " //span[contains(text(),'Add photos/videos')]")
	WebElement addbtn;

	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;

	@FindBy(xpath = "//div[@aria-label='Write a comment']")
	WebElement commentbox;

	@FindBy(xpath = "(//div[@aria-label='Like'])")
	WebElement likebtn;
	/**
	 * Method: To Find Friend in facebook
	 */
	public void userFindFriend() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(findfriedbtn));
			findfriedbtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(suggestionsbtn));
			suggestionsbtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 *  To Find Friend in facebook
	 */
	public void userMarketPlace() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(marketplacebtnbtn));
			marketplacebtnbtn.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
			}
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
			}
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}


	/**
	 * To Watch Video in facebook
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
			wait.until(ExpectedConditions.elementToBeClickable(clickwatchbtn));
			clickwatchbtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(homebtn));
			homebtn.click();

		} catch (Exception e) {

		}
	}



	/**
	 * To Upload profile image of user in facebook
	 */
	public void uploadUserProfileImage() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
			loginBtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(profilebtn));
			profilebtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(upldbtn));
			upldbtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(uploadphotobtn));
			uploadphotobtn.click();
			Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Profile.exe");
			wait.until(ExpectedConditions.elementToBeClickable(upldbtn));
			savebtn.click();




		} catch (Exception e) {
			e.printStackTrace();
		}
	}


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


			emailId.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(photovideobtn));
			photovideobtn.click();
			addbtn.click();

			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\AutoProfileVideo.exe")
					.waitFor(50, TimeUnit.SECONDS);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
			postbtn.click();

			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
		} catch (Exception e) {

		}
	}

	/**
	 * To Like post in facebook
	 * @throws InterruptedException
	 *
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
		homebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(likebtn));
		likebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
	}



}
