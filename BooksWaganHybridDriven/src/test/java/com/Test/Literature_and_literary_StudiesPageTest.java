package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.Literature_and_literary_StudiesPage;
import com.Page.LoginPage;
import com.Utility.Utility;

public class Literature_and_literary_StudiesPageTest extends Base {

	public Literature_and_literary_StudiesPageTest() {
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
			loginp = new LoginPage();
			loginp.LoginUser();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void Literature_and_literary_Studies_Post() {
		literature_and_literary_studie = new Literature_and_literary_StudiesPage();
		literature_and_literary_studie.userAnthologies();
	}

	
	@Test
	public void History_and_Criticism_Post() {


		literature_and_literary_studie = new Literature_and_literary_StudiesPage();
		literature_and_literary_studie.userHistory_and_Criticism();
		
	}
	
	@Test
	public void Poetry_Post() {

		
		literature_and_literary_studie = new Literature_and_literary_StudiesPage();
		literature_and_literary_studie.userPoetry();
		
	}
	
	@Test
	public void Plays_Playscripts_Post() {

		
		literature_and_literary_studie = new Literature_and_literary_StudiesPage();
		literature_and_literary_studie.userPlays_Playscripts();
		
	}
	
	@Test
	public void ProseNon_Fricton_Post() {

	
		literature_and_literary_studie = new Literature_and_literary_StudiesPage();
		literature_and_literary_studie.userProseNon_Fricton();
		
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
