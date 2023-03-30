package com.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.Art_and_PhotographyPage;
import com.Page.LoginPage;
import com.Utility.Utility;

@Listeners(com.Utility.Listners.class)
public class Art_and_Photography_Test extends Base{
	
	public Art_and_Photography_Test() {
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
	public void Architecture_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		art_and_photography = new Art_and_PhotographyPage();
		art_and_photography.user_Architecture();
		
	}

	@Test
	public void Art_Forms_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		art_and_photography = new Art_and_PhotographyPage();
		art_and_photography.userArt_Forms();
	
	}
	
	@Test
	public void Art_treatments_and_subjects_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		art_and_photography = new Art_and_PhotographyPage();
		art_and_photography.Art_treatments_and_subjects();
		
	}
	
	@Test
	public void DanceAndOther_performingArts_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		art_and_photography = new Art_and_PhotographyPage();
		art_and_photography.userDanceAndOther_performingArts();

		
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
