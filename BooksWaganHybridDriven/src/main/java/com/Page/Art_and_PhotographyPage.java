package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Art_and_PhotographyPage extends LoginPage {
	
	@FindBy(xpath = "//a[@class=\"desktopdropdowninit dropdown-toggle\"]")
	WebElement BookDropDownBtn;

	@FindBy(xpath = "//ul[@class='list-unstyled maincategory dropdown']//a[@onclick='getSearchResult()'][normalize-space()='Art & Photography']")
	WebElement ArtandPhotographyBtn;
	
	@FindBy(xpath = "//a[@id='97']")
	WebElement ArchitectureBtn;
	
	@FindBy(xpath = "(//img[@alt='Word Power Made Easy'])[1]")
	WebElement WordPowerMadeEasyImageBtn;

	@FindBy(xpath = "(//input[@value='Buy Now'])[1]")
	WebElement BuyNowBtn;
	
	@FindBy(xpath = "//a[@id='33']")
	WebElement ArtFormsBtn;
	
	@FindBy(xpath = "(//input[@id='BookCart_lvCart_imgPayment'])[1]")
	WebElement PlaceOrderBtn;
	
	@FindBy(xpath = "//img[@alt='Unfinished: A Memoir']")
	WebElement Unfinished_A_MemoirBtn;
	
	@FindBy(xpath = "//input[@value='Buy Now']")
	WebElement UnfinishedBookBuyNowBtn;
	
	@FindBy(xpath = "//a[@id='59']")
	WebElement Art_treatments_and_subjectsBtn;
	
	@FindBy(xpath = "//img[@alt='Design as Art']")
	WebElement Design_as_ArtBookBtn;
	
	@FindBy(xpath = "//input[@value='Buy Now']")
	WebElement Design_as_ArtBuyNowBtn;
	
	@FindBy(xpath = "//a[@id='138']")
	WebElement DanceAndOther_performingBtn;
	
	@FindBy(xpath = "(//img[@alt='Word Power Made Easy'])[1]")
	WebElement WordPowerMadeEasyImage1Btn;
	
	
	
	
	public void user_Architecture() {
		try {
	
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(ArtandPhotographyBtn));
			ArtandPhotographyBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(ArchitectureBtn));
			ArchitectureBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(WordPowerMadeEasyImageBtn));
			WordPowerMadeEasyImageBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(BuyNowBtn));
			BuyNowBtn.click();
				

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void userArt_Forms() {
		try {
		
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(ArtandPhotographyBtn));
			ArtandPhotographyBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(ArtFormsBtn));
			ArtFormsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Unfinished_A_MemoirBtn));
			Unfinished_A_MemoirBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(UnfinishedBookBuyNowBtn));
			UnfinishedBookBuyNowBtn.click();
			

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public void Art_treatments_and_subjects() {
		try {
		
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(ArtandPhotographyBtn));
			ArtandPhotographyBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Art_treatments_and_subjectsBtn));
			Art_treatments_and_subjectsBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(WordPowerMadeEasyImage1Btn));
			WordPowerMadeEasyImage1Btn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Design_as_ArtBuyNowBtn));
			Design_as_ArtBuyNowBtn.click();
		
	

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void userDanceAndOther_performingArts() {
		try {
		
			wait.until(ExpectedConditions.visibilityOfAllElements(BookDropDownBtn));
			BookDropDownBtn.click();

			wait.until(ExpectedConditions.visibilityOfAllElements(ArtandPhotographyBtn));
			ArtandPhotographyBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(DanceAndOther_performingBtn));
			DanceAndOther_performingBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(Design_as_ArtBookBtn));
			Design_as_ArtBookBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElements(BuyNowBtn));
			BuyNowBtn.click();
		
	

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
