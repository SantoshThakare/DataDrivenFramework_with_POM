package com.Page;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base;
import com.Utility.Utility;



public class LoginPage extends Base {
	
	@FindBy(xpath = "//li[@class='list-inline-item text-center loginpopupwrapper']")
	WebElement MyAccountBtn;
	
	@FindBy(xpath = "//input[@id=\"ctl00_phBody_SignIn_txtEmail\"]")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
	WebElement password;

	@FindBy(xpath = "//a[@id='ctl00_phBody_SignIn_btnLogin']")
	WebElement loginBtn;


	

	/**
	 *To Initialize the WebElements generated from FindBy Annotation
	 */
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	WebDriverWait wait = new WebDriverWait(driver,90);


	/**
	 *To verify Home Page Title with Config data
	 */
	public void LoginUser() {
		try {
			
			MyAccountBtn.click();
			emailId.click();
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			loginBtn.click();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * To verify Home Page Title with Xlsx file
	 */
	public void LoginUserUsingXlsx() {
		try {
			
			List<List<String>> values = new LinkedList<List<String>>();
			
			values.addAll(Utility.excelreader());
			MyAccountBtn.click();
			emailId.click();
			emailId.sendKeys(prop.getProperty("emailId"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			password.sendKeys(prop.getProperty("password"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			loginBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
