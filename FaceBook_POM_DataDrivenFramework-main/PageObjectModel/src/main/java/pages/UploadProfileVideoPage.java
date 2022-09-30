package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadProfileVideoPage extends LoginPage {

	@FindBy(xpath = "//span[contains(text(),'Photo/video')]")
	WebElement photovideobtn;

	@FindBy(xpath = " //span[contains(text(),'Add photos/videos')]")
	WebElement addbtn;

	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;

	@FindBy(xpath = "//div[@aria-label='Write a comment']")
	WebElement commentbox;

	@FindBy(xpath = "(//div[@aria-label='Like'])[3]")
	WebElement likebtn;

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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			addbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			homebtn.click();
			Thread.sleep(5000);
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + ".\\src\\main\\resources\\repository\\Autorun.exe")
					.waitFor(50, TimeUnit.SECONDS);
			Thread.sleep(5000);
			postbtn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
