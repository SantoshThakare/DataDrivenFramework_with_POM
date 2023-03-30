package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.Dictionaries_and_languagesPage;
import com.Page.LoginPage;
import com.Utility.Utility;

public class Dictionaries_and_languagesPageTest extends Base {
	public Dictionaries_and_languagesPageTest() {
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
	public void Dictionaries_and_languages_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		dictionaries_and_languages = new Dictionaries_and_languagesPage();
		dictionaries_and_languages.userLanguage_reference_general();
		
	}
	
	@Test
	public void Linguistics_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		dictionaries_and_languages = new Dictionaries_and_languagesPage();
		dictionaries_and_languages.userLinguistics();
		
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
