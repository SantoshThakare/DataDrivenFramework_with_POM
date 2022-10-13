package Test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.FindFriendPage;
import pages.LoginPage;

@Listeners(Utility.Listener.class)
public class FindFriendTest extends Base{
	public FindFriendTest() {
		super();
	}


	final static Logger log = Logger.getLogger(FindFriendTest.class);

//		Method To Run Initialize method before running each Testcases

	@BeforeMethod
	public void triggerDriver() {
		try {

			log.info("* Starting browser  *");

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//		Method To use Call Find Frind Page
	@Test
	public void FriendFindPost() {

		log.info("* Start case Find Friend  *");
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		findpage = new FindFriendPage();
		findpage .userFindFriend();

	}

//		Method  To Run Terminate method after running each Testcases

	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {
			utility.closedriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
