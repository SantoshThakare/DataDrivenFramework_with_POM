package com.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dictionaries_and_languagesPage extends LoginPage {
	
	@FindBy(xpath = "//a[@class=\"desktopdropdowninit dropdown-toggle\"]")
	WebElement BookDropDownBtn;

	@FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Dictionaries & Language']")
	WebElement Dictionaries_and_languagesBtn;
	
	@FindBy(xpath = "//a[@id='222']")
	WebElement Reference_generalBtn;

	@FindBy(xpath = "//a[@id='234']")
	WebElement LinguisticsBtn;
	
	@FindBy(xpath = "//a[normalize-space()='OXFORD ENGLISH MINI DICTIONARY']")
	WebElement OxfordEnglishMiniDictionaryBtn;
	
	public void userLanguage_reference_general() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Dictionaries_and_languagesBtn));
			Dictionaries_and_languagesBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Reference_generalBtn));
			Reference_generalBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void userLinguistics() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Dictionaries_and_languagesBtn));
			Dictionaries_and_languagesBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(LinguisticsBtn));
			LinguisticsBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
