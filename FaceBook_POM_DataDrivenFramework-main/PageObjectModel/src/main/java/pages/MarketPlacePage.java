package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlacePage extends LoginPage{
	@FindBy(xpath = "//span[text()='Marketplace']")
	WebElement marketplacebtnbtn;
	
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
			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
			}
			for (int i = 1; i < 10; i++) {
			//scroll up on the webpage
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
			}
			homebtn.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
