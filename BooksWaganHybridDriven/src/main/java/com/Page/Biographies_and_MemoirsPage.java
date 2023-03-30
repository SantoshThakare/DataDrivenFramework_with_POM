package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Biographies_and_MemoirsPage extends LoginPage {
	@FindBy(xpath = "//a[@class=\"desktopdropdowninit dropdown-toggle\"]")
	WebElement BookDropDownBtn;

	@FindBy(xpath = "(//a[@onclick='getSearchResult()'][normalize-space()='Biographies & Memoirs'])[1]")
	WebElement Biographies_and_MemoirsBtn;
	
	@FindBy(xpath = "xpath=(//a[contains(text(),'Biography: general')])[3]")
	WebElement Biography_generalBtn;
	
	@FindBy(xpath = "//a[@id='213']")
	WebElement DiaryLetter_jourounalBtn;
	
	@FindBy(xpath = "//a[@id='214']")
	WebElement MemoirsBtn;
	
	@FindBy(xpath = "//a[@id='215']")
	WebElement TrueStoriesBtn;


	
	public void userBiography_general() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Biographies_and_MemoirsBtn));
			Biographies_and_MemoirsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Biography_generalBtn));
			Biography_generalBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void user_Diaries_lettersAndjournals() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Biographies_and_MemoirsBtn));
			Biographies_and_MemoirsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(DiaryLetter_jourounalBtn));
			DiaryLetter_jourounalBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public void user_Memoirs() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Biographies_and_MemoirsBtn));
			Biographies_and_MemoirsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(MemoirsBtn));
			MemoirsBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public void user_TrueStories() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Biographies_and_MemoirsBtn));
			Biographies_and_MemoirsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(TrueStoriesBtn));
			TrueStoriesBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
