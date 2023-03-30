package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.LoginPage;
import com.Page.New_ArrivalsPage;
import com.Utility.Utility;
public class New_Arrivals_Test extends Base {

	public New_Arrivals_Test() {
		super();
	}

    /**
	 *  To Run Initialize method before running each Testcases and To Open
	 * browser
	 */
	
	@BeforeMethod
	public void triggerDriver() {
		try {


			Utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	@Test
	public void New_Arrivals_Post() {
		
		new_arrivals = new New_ArrivalsPage();
		new_arrivals.userNew_Arrivals();
		
	}

	/**
	 * To Run Terminate method after running each Testcases
	 */  

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

			Thread.sleep(4000);
			Utility.closedriver();

		} catch (Exception e) {

		}
	}
}
