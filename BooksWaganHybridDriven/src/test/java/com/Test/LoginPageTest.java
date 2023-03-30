package com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.LoginPage;
import com.Utility.Utility;

@Listeners(com.Utility.Listners.class)
public class LoginPageTest extends Base {
	public LoginPageTest() {
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

	/**
	 *  To Test Login Page is working or not using config file
	 */

	@SuppressWarnings("static-access")
	@Test
	public void validLoginPagewithConfigDataTest() {

		loginp = new LoginPage();
		loginp.LoginUser();
		String homePageTitle = util.verifyHomePage();
		assertEquals(homePageTitle, "nline BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");

	}
	/**
	 *	To Test Login Page is working or not using XLSX file
	 */

	 @SuppressWarnings("static-access")
		@Test(priority = 2)
		public void validLoginPageWithXlsxDataTest() {
		 
			loginp = new LoginPage();
			loginp.LoginUserUsingXlsx();
			
		}
	
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
