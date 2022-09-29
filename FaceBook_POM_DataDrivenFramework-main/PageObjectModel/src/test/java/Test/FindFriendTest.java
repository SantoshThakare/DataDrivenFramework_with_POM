package Test;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.FindFriendPage;


public class FindFriendTest extends Base{
	public FindFriendTest() {
		super();
	}
	
	
	final static Logger log = Logger.getLogger(FindFriendTest.class);
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
	public void FriendFindPost() {
		
		log.info("* Start case Find Friend  *");

		findpage = new FindFriendPage();
		findpage .userFindFriend();
		
	}
	@SuppressWarnings("static-access")
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
