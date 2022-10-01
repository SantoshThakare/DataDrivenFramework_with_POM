package Test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Log4j.log4j_pattern_layout;
import Utility.utility;
import pages.FindFriendPage;
import pages.LoginPage;
import pages.MarketPlacePage;
import pages.ProfilePage;
import pages.UploadProfileVideoPage;
import pages.WatchVideosPage;

@Listeners(Utility.Listener.class)
public class FbHomePageTest extends LoginPage {
	public FbHomePageTest() {
		super();
	}

	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);

	@BeforeMethod
	public void triggerDriver() {
		try {

			log.info("* Starting browser  *");

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * To post Find Friend in facebook
	 * 
	 */
	@Test(priority = 1)
	public void FriendFindPost() {

		log.info("* Start case Find Friend  *");

		findpage = new FindFriendPage();
		findpage.userFindFriend();

	}
	/**
	 * To post MarketPlace in facebook
	 * 
	 */
	@Test(priority = 2)
	public void MarketPlacePost() {

		log.info("* Start case Market Place  Videos *");

		marketplace = new MarketPlacePage();
		marketplace.userMarketPlace();
		String homePageTitle = marketplace.verifyHomePage();
		assertEquals(homePageTitle, "Facebook Marketplace | Facebook");

	}
	/**
	 * To post watch video in facebook
	 * 
	 */
	@Test(priority = 3)
	public void WatchPost() {

		log.info("* Start case watch videos *");

		watchvideo = new WatchVideosPage();
		watchvideo.userWatchVideos();
		String homePageTitle = watchvideo.verifyHomePage();
		assertEquals(homePageTitle, "Watch | Facebook");
	}

	/**
	 * To upload profile picture in facebook
	 */
	@Test(priority = 4)
	public void UploadProfileImage() {
		log.info("* Start case Upload Profile Image  *");

		
		profile = new ProfilePage();
		profile.uploadUserProfileImage();

		String homePageTitle = profile.verifyHomePage();
		assertEquals(homePageTitle, "Santosh Thakare | Facebook");
	}

	/**
	 * To post image in facebook
	 * 
	 */

	@Test(priority = 5)
	public void uploadImagePost() {
		log.info("* Start case Upload Image  *");

		
		uploadprofilevideo = new UploadProfileVideoPage();
		uploadprofilevideo.userHomepageImagePost();
		
		log.info("*End case Upload Image");
		String homePageTitle = uploadprofilevideo.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}

	/**
	 * To post video in facebook
	 * 
	 */

	@Test(priority = 6)
	public void uploadVideoPost() {
		log.info("* Start case Upload Profile Video   *");

		uploadprofilevideo = new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageVideoPost();
		String homePageTitle = uploadprofilevideo.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");

	}

	/**
	 * To like post in facebook
	 * 
	 */

	@Test(priority = 7)
	public void likePost() {
		
		log.info("* Start case like Post   *");

		uploadprofilevideo = new UploadProfileVideoPage();
		uploadprofilevideo.userHomePageLikePost();
		String homePageTitle = uploadprofilevideo.verifyHomePage();
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
			e.printStackTrace();
		}
	}
}
