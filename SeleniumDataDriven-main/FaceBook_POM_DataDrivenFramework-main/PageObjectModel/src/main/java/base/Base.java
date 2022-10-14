package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FBHomePage;
import pages.FindFriendPage;
import pages.LoginPage;
import pages.MarketPlacePage;
import pages.ProfilePage;
import pages.StatusPage;
import pages.UploadProfileVideoPage;
import pages.WatchVideosPage;
public class Base {

	protected static WebDriver driver;
	protected static WebElement element;
	protected static FileInputStream file;
	protected static Properties prop;
	protected static utility util;
	protected static FileInputStream excelfile;
	protected static XSSFWorkbook xWorkBook;
	protected static XSSFSheet xSheet;
	protected static Object[][] data;
	protected static LoginPage loginp;
	protected static String message;
	protected static FindFriendPage findpage;
	protected static WatchVideosPage watchvideo;
	protected static MarketPlacePage marketplace;
	protected static UploadProfileVideoPage uploadprofilevideo;
	protected static ProfilePage profile;
	protected static FBHomePage FBhome;
	protected static StatusPage statuspage;
	static {

		WebDriverManager.chromedriver().setup();
	}
	protected final static String FILE_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "main" + File.separator + "resources" + File.separator + "repository" + File.separator
			+ "LoginTestData.xlsx";

	/**
	 *  To Load the Properties file in file.io
	 */
	public Base() {
		try {
			prop = new Properties();
			file = new FileInputStream(
					".\\src\\main\\resources\\config.properties");
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
