package com.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BookSwagan_HomePage extends LoginPage {

	@FindBy(xpath = "//img[@id='ctl00_imglogo']")
	WebElement BookHomeBtn;

	@FindBy(xpath = "(//span[contains(text(),'Best Seller')])[3]")
	WebElement BestSellerBtn;
	
	@FindBy(xpath = "(//img[@alt='Atomic Habits'])[1]")
	WebElement AtomicHabitBookBtn;

	
	public void userBookSwagan_Home() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookHomeBtn));
			BookHomeBtn.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i <3 ; i++) {
				js.executeScript("window.scrollBy(0, 1000)");
				Thread.sleep(1000);
			}
					
			wait.until(ExpectedConditions.visibilityOfAllElements(BestSellerBtn));
			BestSellerBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(AtomicHabitBookBtn));
			AtomicHabitBookBtn.click();
			

		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
