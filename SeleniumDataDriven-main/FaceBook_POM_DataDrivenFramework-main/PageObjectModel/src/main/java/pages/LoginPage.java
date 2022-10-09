package pages;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.utility;
import base.Base;

public class LoginPage extends Base {


	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginBtn;

	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement homebtn;

	@FindBy(xpath = "//div[@class=\"clearfix _5466 _44mg\"]/div[2]")
	WebElement ErrorMsg;

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
			List<List<String>> values= new LinkedList<List<String>>();
			values.addAll(utility.excelreader());
			emailId.sendKeys(values.get(0).get(0));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			password.sendKeys(values.get(0).get(1));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			loginBtn.click();
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * To verify Error message while entering Invalid credentials
	 */
	public String validateInvalidLoginCred() {
		try {
			List<List<String>> values= new LinkedList<List<String>>();
			values.addAll(utility.excelreader());
			emailId.sendKeys(values.get(1).get(0));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			password.sendKeys(values.get(1).get(1));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			loginBtn.click();


			message=ErrorMsg.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}
	/**
	 * To verify Homepagetitle
	 */
	public String verifyHomePage() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
	}

}