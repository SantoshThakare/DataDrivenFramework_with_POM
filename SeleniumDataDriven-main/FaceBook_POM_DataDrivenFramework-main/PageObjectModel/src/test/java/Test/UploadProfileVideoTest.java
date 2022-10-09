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
import pages.UploadProfileVideoPage;

@Listeners(Utility.Listener.class)
public class UploadProfileVideoTest extends Base{

	public UploadProfileVideoTest() {
		super();
	}
	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);

	/**To Run Initialize method before running each Testcases
	 *
	 */
	@BeforeMethod
	public void triggerDriver() {
		try {
			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**To post image in facebook
	 *
	 */

	@Test(priority = 1)
	public void uploadImagePost() {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomepageImagePost();
		String homePageTitle = uploadprofilevideo.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}

	/**To post video in facebook
	 *
	 */

	@Test(priority = 2)
	public void uploadVideoPost() {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageVideoPost();
		
		String homePageTitle = uploadprofilevideo.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");

	}


	/** To like post in facebook
	 * @throws InterruptedException
	 *
	 */

	@Test(priority = 3)
	public void likePost() throws InterruptedException {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageLikePost();
		String homePageTitle = uploadprofilevideo.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}

//	Method to  Run Terminate method after running each Testcases

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {

			Thread.sleep(4000);
			utility.closedriver();

		} catch (Exception e) {

		}

	}
}


