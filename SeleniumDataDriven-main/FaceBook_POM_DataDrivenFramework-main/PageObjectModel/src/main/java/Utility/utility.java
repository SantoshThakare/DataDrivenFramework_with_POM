package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

import base.Base;

public class utility extends Base {

    final static Logger log = Logger.getLogger(utility.class);


	/**
	 * To Initialize the WebDriver
	 */
	public static void intilization(String browser) {
		try {

			if (browser.equals("chrome")) {
				
				//Create a map to store  preferences 
				Map<String, Object> prefs = new HashMap<String, Object>();
				    
				//add key and value to map as follow to switch off browser notification
				//Pass the argument 1 to allow and 2 to block
				prefs.put("profile.default_content_setting_values.notifications", 2);
				    
				//Create an instance of ChromeOptions 
				ChromeOptions options = new ChromeOptions();
				    
				// set ExperimentalOption - prefs 
				options.setExperimentalOption("prefs", prefs);
				    
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.get(prop.getProperty("baseURL"));

			}
				else if (browser.equals("opera")) {
				driver = new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.get(prop.getProperty("baseURL"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Object[][] getloginData() {

		try {
			log.info("start login data");

			excelfile = new FileInputStream(FILE_PATH);
			xWorkBook = new XSSFWorkbook(excelfile);
			xSheet = xWorkBook.getSheet("LoginData");
			int lastrow = xSheet.getLastRowNum();

			data = new Object[lastrow][2];
			int k = 0;
			for (int i = 1; i <= lastrow; i++) {
				String username = xSheet.getRow(i).getCell(k).getStringCellValue();
				String password = xSheet.getRow(i).getCell(k + 1).getStringCellValue();
				System.out.println("Row" + i + "Username" + username);
				System.out.println("Row" + i + "Password" + password);
				System.out.println();

				data[i][0] = username;
				data[i][1] = password;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}
//Method To Use  read data from XLSX file

	public static List<List<String>> excelreader() throws IOException {

		log.info("start excel reader login data in excel sheet");
		List<List<String>> values = new LinkedList<List<String>>();
		File file = new File(FILE_PATH);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("LoginData");

		int rowCOunt = sheet.getLastRowNum();

		for (int i = 1; i <= rowCOunt; i++) {

			int cellCount = sheet.getRow(i).getLastCellNum();
			List<String> val = new LinkedList<String>();
			for (int j = 0; j < cellCount; j++) {
				val.add(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			values.add(val);
		}
		return values;
	}

//	Method  To use  Take  Screenshot

	public static void takeScreenshots() {
		try {
			log.info("start capturing Screenshort");

		Date dates=new Date();
		String date0=dates.toString();
		System.out.println("Date is:" +date0);
		String date1=date0.replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot) driver;

		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(".//Screenshot/"+ date1 +"FailurePage.png");

		FileUtils.copyFile(srcFile, destFile);
	}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	 // Method To Run Terminate method after running each Testcases

	public static void closedriver() {

		try {
			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
