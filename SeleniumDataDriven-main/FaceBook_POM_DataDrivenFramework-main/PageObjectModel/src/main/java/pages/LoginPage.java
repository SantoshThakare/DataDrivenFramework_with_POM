package pages;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	

	/**
	 * To verify PostProfileImagePage
	 * @throws InterruptedException 
	 */
	public String verifyProfileImagePostPage() throws InterruptedException {
		
		WebElement pt  = driver.findElement(By.xpath("//a[@aria-label='1 m']"));
		int x = pt.getLocation().getX();
		int y = pt.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

		String PostTime = pt.getText();
		
		System.out.println(PostTime);
		return PostTime;
	}
	/**
	 * To verify PostImagePage
	 */
	public String verifyImagePostPage() {


		WebElement pt  = driver.findElement(By.xpath("//a[@aria-label='1 m']"));
		int x = pt.getLocation().getX();
		int y = pt.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

		String PostTime = pt.getText();

		System.out.println(PostTime);
		return PostTime;
	}
	/**
	 * To verify Post Video  in Facebook
	 */
	public String verifyVideoPage() {
		WebElement pt  = driver.findElement(By.xpath("//a[@aria-label='1 m']"));
		int x = pt.getLocation().getX();
		int y = pt.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

		String PostTime = pt.getText();

		System.out.println(PostTime);
		return PostTime;
	}
	/**
	 * To verify Random Comment page  in Facebook
	 */
	public String verifyRandomCommentPage() {
		WebElement pt  = driver.findElement(By.xpath("div[aria-label='Comment by Santosh Thakare a few seconds ago'] ul[class='x1n0m28w x1rg5ohu x1wfe3co xat24cr xsgj6o6 x1o1nzlu xyqdw3p'] span[class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j']"));
		int x = pt.getLocation().getX();
		int y = pt.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

		String PostTime = pt.getText();

		System.out.println(PostTime);
		return PostTime;
	}

	

}