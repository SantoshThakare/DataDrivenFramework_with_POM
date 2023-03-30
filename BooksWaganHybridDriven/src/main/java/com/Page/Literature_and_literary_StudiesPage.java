package com.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Literature_and_literary_StudiesPage extends LoginPage {
	@FindBy(xpath = "//a[@class=\"desktopdropdowninit dropdown-toggle\"]")
	WebElement BookDropDownBtn;

	@FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Literature & literary studies']")
	WebElement Literature_and_literary_StudiesBtn;
	
	@FindBy(xpath = "//a[@id='261']")
	WebElement AnthologiesBtn;
	
	@FindBy(xpath = "//a[@id='262']")
	WebElement History_and_CriticismBtn;
		
	@FindBy(xpath = "//a[@id='256']")
	WebElement Play_PlayscriptsBtn;
	
	@FindBy(xpath = "//a[@id='253']")
	WebElement PoetryBtn;
	
	@FindBy(xpath = "//a[@id='253']")
	WebElement ProseNon_FrictonBtn;

		public void userAnthologies() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Literature_and_literary_StudiesBtn));
			Literature_and_literary_StudiesBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(AnthologiesBtn));
			AnthologiesBtn.click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 1000)");
				Thread.sleep(1000);
			}
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, -1000)");
				Thread.sleep(1000);
			}
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void userHistory_and_Criticism() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(Literature_and_literary_StudiesBtn));
			Literature_and_literary_StudiesBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(History_and_CriticismBtn));
			History_and_CriticismBtn.click();
			
		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
		public void userPlays_Playscripts() {
			try {
				wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
				BookDropDownBtn.click();

				wait.until(ExpectedConditions.visibilityOfAllElements(Literature_and_literary_StudiesBtn));
				Literature_and_literary_StudiesBtn.click();
				
				wait.until(ExpectedConditions.visibilityOfAllElements(Play_PlayscriptsBtn));
				Play_PlayscriptsBtn.click();
				
			

			} catch (Exception e) {
				e.printStackTrace();

			}
	}
		public void userPoetry() {
			try {
				wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
				BookDropDownBtn.click();

				wait.until(ExpectedConditions.visibilityOfAllElements(Literature_and_literary_StudiesBtn));
				Literature_and_literary_StudiesBtn.click();
				
				wait.until(ExpectedConditions.visibilityOfAllElements(PoetryBtn));
				PoetryBtn.click();
				
			

			} catch (Exception e) {
				e.printStackTrace();

			}
	}
		
		public void userProseNon_Fricton() {
			try {
				wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
				BookDropDownBtn.click();

				wait.until(ExpectedConditions.visibilityOfAllElements(Literature_and_literary_StudiesBtn));
				Literature_and_literary_StudiesBtn.click();
				
				wait.until(ExpectedConditions.visibilityOfAllElements(ProseNon_FrictonBtn));
				ProseNon_FrictonBtn.click();
				
			

			} catch (Exception e) {
				e.printStackTrace();

			}
	}
}
