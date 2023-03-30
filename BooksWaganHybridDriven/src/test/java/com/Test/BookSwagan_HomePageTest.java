package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.BookSwagan_HomePage;
import com.Page.LoginPage;
import com.Utility.Utility;

public class BookSwagan_HomePageTest extends Base {
	public BookSwagan_HomePageTest() {
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
	public void BookSwagan_Home_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		bookswagan_home = new BookSwagan_HomePage();
		bookswagan_home.userBookSwagan_Home();
		
	}

	/**
	 * To Run Terminate method after running each Testcases
	 */  

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

			Thread.sleep(2000);
			Utility.closedriver();

		} catch (Exception e) {

		}
	}
}
