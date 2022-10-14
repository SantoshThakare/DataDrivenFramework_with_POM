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
import pages.FBHomePage;
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
	@Test(priority = 1)
	public void UploadProfileImage() {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		profile = new ProfilePage();
		profile.uploadUserProfileImage();

		String homePageTitle = util.verifyHomePage();
		assertEquals(homePageTitle, "Santosh Thakare | Facebook");
	}
	/**
	 * To post Comment in facebook
	 *
	 */
	@Test(priority = 2)
	public void CommentPost() throws Exception {

		log.info("* Start case Comment Post   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		profile = new ProfilePage();
		profile.userHomePageCommentPost();
		String homePageTitle = util.verifyHomePage();
		assertEquals(homePageTitle, "Santosh Thakare | Facebook");
	}
	/**
	 * To post Randomly Comment in facebook
	 *
	 */
	@Test(priority = 3)
	public void RandomCommentPost() throws Exception {

		log.info("* Start case Random Comment Post   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		profile = new ProfilePage();
		profile.userHomePageRandomCommentPost();
		
	}
	
	/**
	 * To like post in facebook
	 * @throws Exception
	 *
	 */

	@Test(priority = 4)
	public void likePost() throws Exception {

		log.info("* Start case like Post   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		profile = new ProfilePage();
		profile.userHomePageLikePost();
		
	}
	
	/**
	 * To Run Terminate method after running each Testcases
	 */

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

			Thread.sleep(4000);
			utility.closedriver();

		} catch (Exception e) {

		}
	}
}
