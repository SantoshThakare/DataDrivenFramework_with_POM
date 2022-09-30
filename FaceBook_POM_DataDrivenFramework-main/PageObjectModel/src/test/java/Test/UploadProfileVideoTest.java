package Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.UploadProfileVideoPage;

@Listeners(Utility.Listener.class)
public class UploadProfileVideoTest extends Base{

	public UploadProfileVideoTest() {
		super();
	}
	final static Logger log = Logger.getLogger(UploadProfileVideoTest.class);

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
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomepageImagePost();
		String homePageTitle = profile.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}
	
	/**To post video in facebook
	 * 
	 */
	
	@Test(priority = 2)
	public void uploadVideoPost() {
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageVideoPost();
		String homePageTitle = profile.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
		
	}
	
	
	/** To like post in facebook
	 * 
	 */
	
	@Test(priority = 3)
	public void likePost() {
		uploadprofilevideo=new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageLikePost();
		String homePageTitle = profile.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}
	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {

			Thread.sleep(4000);
			util.closedriver();

		} catch (Exception e) {

		}
	
	}
}


