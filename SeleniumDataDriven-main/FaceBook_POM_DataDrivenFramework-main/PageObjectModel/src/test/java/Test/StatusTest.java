package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Log4j.log4j_pattern_layout;
import Utility.utility;
import base.Base;
import pages.LoginPage;
import pages.StatusPage;
@Listeners(Utility.Listener.class)
public class StatusTest extends Base {

	public StatusTest() {

		super();
	}

	final static Logger log = Logger.getLogger(log4j_pattern_layout.class);

//	Method To Run Initialize method before running each Testcases

	@BeforeMethod
	public void triggerDriver() {
		try {

			log.info("* Starting browser  *");

			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	To post  status image story in facebook
	@Test
	public void status_image_story_post() throws IOException, InterruptedException {
		log.info("*Start Test Case Upload Story *");
		
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		statuspage = new StatusPage();
		statuspage.userStatusImage();
		String homePageTitle = statuspage.verifyHomePage();
		assertEquals(homePageTitle, "Create stories | Facebook");
				
		log.info("*End Test Case Upload Story*");
	}

//	To post  status text story in facebook
	@Test
	public void status_text_story_post() throws IOException, InterruptedException {
		log.info("*Start Test Case Text Story *");
		
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		statuspage = new StatusPage();
		statuspage.userStatusText();
		String homePageTitle = statuspage.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
				
		log.info("*End Test Case Text Story*");
	}
	@Test
	public void text_type_post() {
		loginp = new LoginPage();
		loginp.LoginUserUsingXlsx();
		statuspage = new StatusPage();
		statuspage.userTextPost();
		String homePageTitle = statuspage.verifyHomePage();
		assertEquals(homePageTitle, "Facebook");
	}
	
//	Method  To Run Terminate method after running each Testcases

	@AfterMethod
	public void terminateDriver() {
		log.info("*End Test Case*");
		try {
			Thread.sleep(5000);
			utility.closedriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
