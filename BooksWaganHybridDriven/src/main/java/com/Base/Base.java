package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Page.Art_and_PhotographyPage;
import com.Page.Biographies_and_MemoirsPage;
import com.Page.BookSwagan_HomePage;
import com.Page.Dictionaries_and_languagesPage;
import com.Page.Literature_and_literary_StudiesPage;
import com.Page.LoginPage;
import com.Page.New_ArrivalsPage;
import com.Utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	protected static WebDriver driver;
	protected static WebElement element;
	protected static FileInputStream file;
	protected static Properties prop;
	protected static Utility util;
	protected static FileInputStream excelfile;
	protected static XSSFWorkbook xWorkBook;
	protected static XSSFSheet xSheet;
	protected static Object[][] data;
	protected static LoginPage loginp;
	protected static Art_and_PhotographyPage art_and_photography;
	protected static New_ArrivalsPage new_arrivals; 
	protected static Dictionaries_and_languagesPage dictionaries_and_languages;
	protected static Biographies_and_MemoirsPage biographies_and_memoirs;
	protected static Literature_and_literary_StudiesPage literature_and_literary_studie;
	protected static BookSwagan_HomePage bookswagan_home; 

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
					"C:\\Users\\Shree\\eclipse-workspace\\SeleniumDataDriven\\BooksWaganHybridDriven\\src\\main\\resources\\repository\\config.properties");
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
