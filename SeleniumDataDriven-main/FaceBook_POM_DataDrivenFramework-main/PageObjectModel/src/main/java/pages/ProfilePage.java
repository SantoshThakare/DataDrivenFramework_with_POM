package pages;


import org.openqa.selenium.WebElement;
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


		/**
		 * To Upload profile image of user in facebook
		 */
		public void uploadUserProfileImage() {
			try {
				emailId.sendKeys(prop.getProperty("emailId"));
				password.sendKeys(prop.getProperty("password"));
				wait.until(ExpectedConditions.visibilityOfAllElements(loginBtn));
				loginBtn.click();
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
}
