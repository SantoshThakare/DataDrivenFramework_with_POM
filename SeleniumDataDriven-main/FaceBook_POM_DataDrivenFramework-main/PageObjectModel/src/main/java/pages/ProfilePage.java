package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends LoginPage{


		@FindBy(xpath ="//span[text()='Santosh Thakare']")
		WebElement profilebtn;

		@FindBy(xpath= "//div[@aria-label='Update profile picture']")
		WebElement upldbtn;

		@FindBy(xpath="//div[@aria-label='Upload Photo']")
		WebElement uploadphotobtn;

		@FindBy(xpath="//div[@aria-label='Save']")
		WebElement savebtn;
		
		@FindBy(xpath = "//div[@aria-label='Write a comment']")
		WebElement commentbox;
		@FindBy(xpath = "(//div[@aria-label='Like'])")
		WebElement likebtn;

		@FindBy(xpath = "//div[@aria-label=\"Change Like reaction\"]")
		WebElement alreadylikebtn;

		@FindBy(xpath = "//div[@aria-label=\"Change Love reaction\"]")
		WebElement alreadylovebtn;


		/**
		 * To Upload profile image of user in facebook
		 */
		public void uploadUserProfileImage() {
			try {
				
				wait.until(ExpectedConditions.visibilityOfAllElements(profilebtn));
				profilebtn.click();
				wait.until(ExpectedConditions.visibilityOfAllElements(upldbtn));
				upldbtn.click();
				wait.until(ExpectedConditions.visibilityOfAllElements(uploadphotobtn));
				uploadphotobtn.click();
				wait.until(ExpectedConditions.elementToBeClickable(homebtn));
				Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Profile.exe");
				wait.until(ExpectedConditions.visibilityOfAllElements(savebtn));
				savebtn.click();




			} catch (Exception e) {
				e.printStackTrace();
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
			homebtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(profilebtn));
			profilebtn.click();
			int x = likebtn.getLocation().getX();
			int y = likebtn.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			wait.until(ExpectedConditions.visibilityOfAllElements(likebtn));
			wait.until(ExpectedConditions.elementToBeClickable(likebtn));

			Actions actions = new Actions(driver);
			actions.moveToElement(likebtn).perform();
			
			js.executeScript("window.scrollBy(" + x + ", " + y + ")");
			if (alreadylikebtn.isDisplayed()) {
				
				System.out.println("Already click on like button ");
			} else {
				wait.until(ExpectedConditions.visibilityOfAllElements(likebtn));
				likebtn.click();
			}

			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
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
				JavascriptExecutor js = (JavascriptExecutor) driver;
				for (int i = 1; i < 6; i++) {
					js.executeScript("window.scrollBy(0, 250)");
					Thread.sleep(2000);
				}
				for (int i = 1; i < 5; i++) {
					js.executeScript("window.scrollBy(0, 0)");
					Thread.sleep(2000);
				}

				wait.until(ExpectedConditions.elementToBeClickable(commentbox));
				commentbox.sendKeys("Super Hit H Boss");

				Robot robot = new Robot();

				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
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
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 250)");
				Thread.sleep(2000);
			}
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 0)");
				Thread.sleep(2000);
			}

			wait.until(ExpectedConditions.elementToBeClickable(commentbox));
			commentbox.sendKeys(randomString);

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

}
