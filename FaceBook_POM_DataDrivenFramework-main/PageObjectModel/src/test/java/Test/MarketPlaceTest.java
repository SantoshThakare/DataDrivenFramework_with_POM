package Test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import pages.MarketPlacePage;

public class MarketPlaceTest extends Base{
	public MarketPlaceTest() {
		super();
	}
	final static Logger log = Logger.getLogger(MarketPlaceTest.class);
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
