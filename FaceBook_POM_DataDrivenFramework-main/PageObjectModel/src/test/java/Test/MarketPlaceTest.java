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
import pages.MarketPlacePage;

@Listeners(Utility.Listener.class)
public class MarketPlaceTest extends Base{
	public MarketPlaceTest() {
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
	@Test
	public void MarketPlacePost() {
		
		log.info("* Start case Market Place  Videos *");

		marketplace = new MarketPlacePage();
		marketplace.userMarketPlace();
		String homePageTitle = marketplace.verifyHomePage();
		assertEquals(homePageTitle, "Facebook Marketplace | Facebook");
		
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
