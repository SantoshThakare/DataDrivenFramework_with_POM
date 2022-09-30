package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage{

		
		@FindBy(xpath ="//span[text()='Santosh Thakare'] [@class=\"b6ax4al1 lq84ybu9 hf30pyar om3e55n1\"]")
		WebElement profilebtn;
		
		@FindBy(xpath= "//div[@aria-label='Update profile picture']")
		WebElement upldbtn;
		
		@FindBy(xpath="//div[@aria-label='Upload Photo']")
		WebElement uploadphotobtn;
		
		@FindBy(xpath="//div[@aria-label='Save']")
		WebElement savebtn;
		
		
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
}
