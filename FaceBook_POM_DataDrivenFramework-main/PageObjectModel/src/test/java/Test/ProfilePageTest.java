package Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Log4j.log4j_pattern_layout;
import Utility.utility;
import base.Base;
import pages.LoginPage;
import pages.ProfilePage;

@Listeners(Utility.Listener.class)
public class ProfilePageTest extends Base {

	public ProfilePageTest() {
		super();
	}
	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);

	/**
	 * To Run Initialize method before running each Testcases
	 */
	@BeforeMethod
	public void triggerDriver() {
		try {
			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * To upload profile picture in facebook
	 */
	@Test
	public void UploadProfileImage() {
		profile = new ProfilePage();
		profile.uploadUserProfileImage();
		
		String homePageTitle = profile.verifyHomePage();
		assertEquals(homePageTitle, "Santosh Thakare | Facebook");
	}
	
	/**
	 * To Run Terminate method after running each Testcases
	 */

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

			Thread.sleep(4000);
			util.closedriver();

		} catch (Exception e) {

		}
	}
}
