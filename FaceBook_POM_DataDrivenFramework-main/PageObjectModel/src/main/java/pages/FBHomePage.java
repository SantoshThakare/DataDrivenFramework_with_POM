package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


	/**
	 * Method: To Find Friend in facebook
	 */
	public void userMarketPlace() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			marketplacebtnbtn.click();
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 10; i++) {
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
			}
			for (int i = 1; i < 10; i++) {
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
			}
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			watchbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			clickwatchbtn.click();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			Thread.sleep(4000);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} catch (Exception e) { 

		}
	}
	
	
	
	/**
	 * Method: To Upload profile image of user in facebook
	 */
	public void uploadUserProfileImage() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			profilebtn.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			upldbtn.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			uploadphotobtn.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Profile.exe");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			photovideobtn.click();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			addbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			Thread.sleep(5000);
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\auto_photos.exe")
					.waitFor(50, TimeUnit.SECONDS);
			Thread.sleep(5000);
			System.out.println("Upload image post");
			postbtn.click();
			driver.manage().timeouts().implicitlyWait(1400, TimeUnit.SECONDS);
			homebtn.click();
		} catch (Exception e) {

		}
	}

	/**
	 * To post video in facebook
	 */
	public void userHomePageVideoPost() {
		try {
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginBtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			photovideobtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			addbtn.click();
			Thread.sleep(5000);
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\AutoProfileVideo.exe")
					.waitFor(50, TimeUnit.SECONDS);
			Thread.sleep(5000);
			postbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
		} catch (Exception e) {

		}
	}
	
	/**
	 * To Like post in facebook
	 */
	
	public void userHomePageLikePost() {
		emailId.sendKeys(prop.getProperty("emailId"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		password.sendKeys(prop.getProperty("password"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homebtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		likebtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homebtn.click();
	}
	
	

}
