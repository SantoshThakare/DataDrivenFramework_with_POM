package Test;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.utility;
import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Utility.Listener.class)
public class Browser extends Base {

	final static Logger log = Logger.getLogger(Browser.class);

	static {

		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	}
	/**
	 *  To Run Initialize method before running each Testcases
	 */

	@BeforeClass
	public void triggerDriver() {
		try {
			utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@DataProvider(name = "LoginData")
	public Object[][] dataTest() {
		Object[][] data = new Object[2][2];
		data[0][0] = "thakaresantosh129@gmail.com";
		data[0][1] = "Santosh@123";
		return data;

	}

	/**
	 * Method To use  excel reader
	 */
	@Test
	public void Login() {
		try {
			List<List<String>> values = new LinkedList<List<String>>();
			values.addAll(utility.excelreader());

			String url = prop.getProperty("baseURL");
			driver.get(url);
			System.out.println("Values from exel fle username:" + values.get(0).get(0));
			driver.findElement(By.id("email")).sendKeys(values.get(0).get(0));
			System.out.println("Values from exel fle password:" + values.get(0).get(1));
			driver.findElement(By.id("pass")).sendKeys(values.get(0).get(1));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	/**
	 * To Run Terminate method after running each Testcases
	 */

	@SuppressWarnings("static-access")
	@AfterClass
	public void terminateDriver() {
		try {

			Thread.sleep(4000);
			utility.closedriver();
		} catch (Exception e) {

		}
	}
}
