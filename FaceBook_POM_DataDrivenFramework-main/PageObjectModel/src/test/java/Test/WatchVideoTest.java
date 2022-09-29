package Test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.FindFriendPage;
import pages.WatchVideosPage;

public class WatchVideoTest extends Base{
	public WatchVideoTest() {
		super();
	}
	
	
	final static Logger log = Logger.getLogger(WatchVideoTest.class);
	@BeforeMethod
	public void triggerDriver() {
		try {
			
			log.info("* Starting browser  *");

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void WatchPost() {
		
		log.info("* Start case watch videos *");

		watchvideo = new WatchVideosPage();
		watchvideo.userWatchVideos();
		
	}
	@Test
	public void scrollUpDown() {
		log.info("* Start facebook login page Scrolling Up and Down *");
		watchvideo = new WatchVideosPage();
		watchvideo.userScrollUpDown();
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
