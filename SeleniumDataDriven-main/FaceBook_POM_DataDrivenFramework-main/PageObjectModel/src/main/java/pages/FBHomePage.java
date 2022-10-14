package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Log4j.log4j_pattern_layout;

public class FBHomePage extends LoginPage {

	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);

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

	@FindBy(xpath = "(//div[@role='presentation'])[2]")
	WebElement clickwatchbtn;

	@FindBy(xpath = "//span[text()='Santosh Thakare']")
	WebElement profilebtn;

	@FindBy(xpath = "//div[@aria-label='Update profile picture']")
	WebElement upldbtn;

	@FindBy(xpath = "//div[@aria-label='Upload Photo']")
	WebElement uploadphotobtn;

	@FindBy(xpath = "//div[@aria-label='Save']")
	WebElement savebtn;

	@FindBy(xpath = "//span[contains(text(),'Photo/video')]")
	WebElement photovideobtn;

	@FindBy(xpath = " //span[contains(text(),'Add photos/videos')]")
	WebElement addbtn;

	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;

	@FindBy(xpath = "//div[@aria-label='Write a comment']")
	WebElement commentbox;
	
	@FindBy(xpath = "//div[@aria-label='Comment by Santosh Thakare a few seconds ago']//div[@role='button'][normalize-space()='Reply']")
	WebElement replybtn;
	
	@FindBy(xpath = "//div[@aria-label='Reply to Santosh Thakare']")
	WebElement replyTextbtn;

	@FindBy(xpath = "(//span[contains(text(),'Like')])[1]")
	WebElement likebtn;

	@FindBy(xpath = "(//span[contains(text(),'Like')])[1][@style='color: rgb(32, 120, 244);']")
	WebElement alreadylikebtn;

	@FindBy(xpath = "//div[@aria-label=\"Change Love reaction\"]")
	WebElement alreadylovebtn;

	@FindBy(xpath = "//span[contains(text(),'Posting')]")
	WebElement postingbtn;
	@FindBy(xpath = "//a[@aria-label='Create story']")
	WebElement createstorybtn;

	@FindBy(xpath = "//div[@aria-label='Upload photo']")
	WebElement createPhotostorybtn;

	@FindBy(xpath = "//div[@aria-label='Share to Story']")
	WebElement shareStorybtn;

	@FindBy(xpath = "//div[contains(text(),'Create a Text Story')]")
	WebElement CreateTextStorybtn;

	@FindBy(xpath = "//label[@aria-label='Start typing']")
	WebElement StartTypingtext;

	@FindBy(xpath = "//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")
	WebElement TextPostbtn;

	@FindBy(xpath = "//p[@class='x16tdsg8 x1mh8g0r xat24cr x11i5rnm xdj266r']")
	WebElement TextTypePostbtn;

	@FindBy(xpath = "//div[@aria-selected='true']")
	WebElement Reelsbtn;

	@FindBy(xpath = "//div[@aria-label='Reels tray']")
	WebElement ReelsTraybtn;
	
	@FindBy(xpath = "//div[@aria-label='Comment by Santosh Thakare about a minute ago']")
	WebElement CommentRightNowbtn;

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

	/**
	 * To Find Friend in facebook
	 */
	public void userMarketPlace() {
		try {

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
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(watchbtn));
			watchbtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(clickwatchbtn));
			clickwatchbtn.click();
			Thread.sleep(5000);
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
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(profilebtn));
			wait.until(ExpectedConditions.elementToBeClickable(profilebtn));
			profilebtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(upldbtn));
			upldbtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(uploadphotobtn));
			uploadphotobtn.click();
			Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Profile.exe");
			wait.until(ExpectedConditions.visibilityOfAllElements(savebtn));
			wait.until(ExpectedConditions.elementToBeClickable(savebtn));
			Thread.sleep(2000);
			savebtn.click();
			Thread.sleep(5000);
			driver.navigate().to("https://www.facebook.com/profile.php?id=100086515231415");
			Thread.sleep(2000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			for (int i = 1; i < 2; i++) {
//			js.executeScript("window.scrollBy(0, 500)");
//			Thread.sleep(3000);
//			}

			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * To post image in facebook
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
			wait.until(ExpectedConditions.visibilityOfAllElements(postingbtn));
			postingbtn.click();
			Thread.sleep(5000);

		} catch (Exception e) {

		}
	}

	/**
	 * To post video in facebook
	 */
	public void userHomePageVideoPost() {
		try {

			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(photovideobtn));
			photovideobtn.click();
			addbtn.click();
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\AutoProfileVideo.exe")
					.waitFor(50, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
			Thread.sleep(5000);
			postbtn.click();
			Thread.sleep(5000);
			driver.navigate().to("https://www.facebook.com/profile.php?id=100086515231415");
			Thread.sleep(2000);

			
//			wait.until(ExpectedConditions.visibilityOfAllElements(postingbtn));
//			postingbtn.click();
			
//			driver.navigate().refresh();

		} catch (Exception e) {

		}
	}

	/**
	 * To Like post in facebook
	 * 
	 * @throws InterruptedException
	 *
	 */

	public void userHomePageLikePost() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		wait.until(ExpectedConditions.elementToBeClickable(homebtn));
		homebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(profilebtn));
		wait.until(ExpectedConditions.elementToBeClickable(profilebtn));
		profilebtn.click();
		String lik = likebtn.getAttribute("style");
		
		switch (lik) {
		case "color: rgb(32, 120, 244);":
			log.info("Post is Already liked");
			
			break;

		default:
			
			likebtn.click();
			log.info("Now Like btn click");
			break;
		}

//		if (alreadylikebtn.isDisplayed() || !alreadylikebtn.isDisplayed()) {
//			log.warn("Post is Already Liked");
//			System.out.println("Already click on like button ");
//			System.out.println("Already click on like button is Displayed ");
//
//		} else {
//			int x = likebtn.getLocation().getX();
//			int y = likebtn.getLocation().getY();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			Actions actions = new Actions(driver);
//			actions.moveToElement(likebtn).perform();
//			js.executeScript("window.scrollBy(" + x + ", " + y + ")");
//			wait.until(ExpectedConditions.visibilityOfAllElements(likebtn));
//			wait.until(ExpectedConditions.elementToBeClickable(likebtn));
//			likebtn.click();
//		}

	}

	/**
	 * To post comment in facebook
	 */
	public void userHomePageCommentPost() throws InterruptedException {
		try {

			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(profilebtn));
			profilebtn.click();

			int x = commentbox.getLocation().getX();
			int y = commentbox.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + x + ", " + y + ")");

			wait.until(ExpectedConditions.elementToBeClickable(commentbox));
			commentbox.sendKeys("Super Hit H Boss");

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			wait.until(ExpectedConditions.visibilityOfAllElements(replybtn));
//			replybtn.click();
//			wait.until(ExpectedConditions.elementToBeClickable(replyTextbtn));
//			commentbox.sendKeys("Thank You Dost!!!!");
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
			
			driver.navigate().refresh();

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	/**
	 * To post Randomly Comment in facebook
	 */
	public void userHomePageRandomCommentPost() throws InterruptedException, AWTException {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*123456789abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 7;

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		System.out.println("Random String is: " + randomString);
		wait.until(ExpectedConditions.elementToBeClickable(homebtn));

		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(profilebtn));

		wait.until(ExpectedConditions.visibilityOfAllElements(profilebtn));
		profilebtn.click();

		int x = commentbox.getLocation().getX();
		int y = commentbox.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

		wait.until(ExpectedConditions.elementToBeClickable(commentbox));
		commentbox.sendKeys(randomString);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		for (int i = 1; i < 3; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
	}

//	 To Post Status Image in Facebook
	public void userStatusImage() throws IOException, InterruptedException {

		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
		createstorybtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createPhotostorybtn));
		createPhotostorybtn.click();
		Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Status.exe");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(shareStorybtn));
		Thread.sleep(1000);
		shareStorybtn.click();
		Thread.sleep(3000);

	}

//	 To Post Status Text in Facebook

	public void userStatusText() throws IOException, InterruptedException {

		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
		createstorybtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
		CreateTextStorybtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(StartTypingtext));
		StartTypingtext.sendKeys("Hard Work + Dream + Dedication = Success.");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(shareStorybtn));
		shareStorybtn.click();
		Thread.sleep(5000);

	}
//	 To Post Text Post in Facebook

	public void userTextPost() {
		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();

		wait.until(ExpectedConditions.visibilityOfAllElements(TextPostbtn));
		TextPostbtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(TextTypePostbtn));
		TextTypePostbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(TextTypePostbtn));
		TextTypePostbtn.sendKeys("To success in life.... You need two things... Ignorance and Confidence...");

		wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
		postbtn.click();

	}

}
