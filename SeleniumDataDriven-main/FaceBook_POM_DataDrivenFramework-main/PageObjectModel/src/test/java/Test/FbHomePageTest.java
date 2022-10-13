package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import Log4j.log4j_pattern_layout;
import Utility.utility;
import base.Base;
import pages.FBHomePage;
import pages.LoginPage;


@Listeners(Utility.Listener.class)
public class FbHomePageTest extends Base {
	public FbHomePageTest() {
		super();
	}

	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);
	/**
	 * To Run Initialize method before running each Testcases
	 */
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
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userFindFriend();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Friends | Facebook");


	}
	/**
	 * To post MarketPlace in facebook
	 *
	 */
	@Test(priority = 2)
	public void MarketPlacePost() {

		log.info("* Start case Market Place  Videos *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userMarketPlace();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Facebook Marketplace | Facebook");

	}
	/**
	 * To post watch video in facebook
	 *
	 */
	@Test(priority = 3)
	public void WatchPost() {

		log.info("* Start case watch videos *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userWatchVideos();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Watch | Facebook");
	}

	/**
	 * To upload profile picture in facebook
	 * @throws InterruptedException 
	 */
	@Test(priority = 4)
	public void UploadProfileImage() throws InterruptedException {
		log.info("* Start case Upload Profile Image  *");

		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.uploadUserProfileImage();
		String PostTime = FBhome.verifyProfileImagePostPage();
		
		System.out.println("posting time  :" + PostTime);
		AssertJUnit.assertEquals(PostTime, "1 m");
	}

	/**
	 * To post image in facebook
	 *
	 */

	@Test(priority = 5)
	public void uploadImagePost() {
		log.info("* Start case Upload Image  *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userHomepageImagePost();	
		
		String PostTime = FBhome.verifyImagePostPage();
		System.out.println("posting time :" + PostTime);
		AssertJUnit.assertEquals(PostTime, "1 m");
		log.info("*End case Upload Image");

	}
	

	@Test(priority = 6)
	public void uploadVideoPost() {
		log.info("* Start case Upload Profile Video   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx(); 
		FBhome = new FBHomePage();
		FBhome.userHomePageVideoPost();
		String PostTime = FBhome.verifyVideoPage();
		System.out.println("posting time :" + PostTime);
		AssertJUnit.assertEquals(PostTime, "1 m");

		log.info("*End case Upload Video");

	}

	/**
	 * To like post in facebook
	 * @throws Exception
	 *
	 */

	@Test(priority = 7)
	public void likePost() throws Exception {

		log.info("* Start case like Post *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userHomePageLikePost();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Santosh Thakare | Facebook");
		log.info("* End case like Post   *");

	}
	/**
	 * To post Comment in facebook
	 *
	 */
	@Test(priority = 8)
	public void CommentPost() throws Exception {

		log.info("* Start case Comment Post   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userHomePageCommentPost();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Santosh Thakare | Facebook");
	}
	/**
	 * To post Randomly Comment in facebook
	 *
	 */
	@Test(priority = 9)
	public void RandomCommentPost() throws Exception {

		log.info("* Start case Random Comment Post   *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userHomePageRandomCommentPost();
		String PostTime = FBhome.verifyRandomCommentPage();
		AssertJUnit.assertEquals(PostTime, "1 m");
	}
//	To post  status image story in facebook
	@Test(priority = 10)
	public void status_image_story_post() throws IOException, InterruptedException {
		log.info("*Start Test Case Upload Story *");
		
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userStatusImage();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Create stories | Facebook");
				
		log.info("*End Test Case Upload Story*");
	}

//	To post  status text story in facebook
	@Test(priority = 11)
	public void status_text_story_post() throws IOException, InterruptedException {
		log.info("*Start Test Case Text Story *");
		
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userStatusText();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Facebook");
				
		log.info("*End Test Case Text Story*");
	}
	@Test(priority = 12)
//	To post text Type in facebook

	public void text_type_post() {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		FBhome = new FBHomePage();
		FBhome.userTextPost();
		String homePageTitle = FBhome.verifyHomePage();
		AssertJUnit.assertEquals(homePageTitle, "Facebook");
	}

	/**
	 * To Run Terminate method after running each Testcases
	 */
	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {
			Thread.sleep(4000);
			utility.closedriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
