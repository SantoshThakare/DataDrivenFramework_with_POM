package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StatusPage extends LoginPage {
	
	@FindBy(xpath ="//a[@aria-label='Create story']")
	WebElement createstorybtn;
	
	@FindBy(xpath ="//div[@aria-label='Upload photo']")
	WebElement createPhotostorybtn;
	
	@FindBy(xpath ="//div[@aria-label='Share to Story']")
	WebElement shareStorybtn;
	
	@FindBy(xpath ="//div[contains(text(),'Create a Text Story')]")
	WebElement CreateTextStorybtn;
	
	@FindBy(xpath ="//label[@aria-label='Start typing']")
	WebElement StartTypingtext;
	
	@FindBy(xpath ="//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")
	WebElement TextPostbtn;
	
	@FindBy(xpath ="//p[@class='x16tdsg8 x1mh8g0r xat24cr x11i5rnm xdj266r']")
	WebElement TextTypePostbtn;
	
	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;
	
	@FindBy(xpath ="//div[@aria-selected='true']")
	WebElement Reelsbtn;
	
	@FindBy(xpath ="//div[@aria-label='Reels tray']")
	WebElement ReelsTraybtn;
	
//	 To Post Status Image in Facebook
	public void userStatusImage() throws IOException, InterruptedException {
		
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
			createstorybtn.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(createPhotostorybtn));
			createPhotostorybtn.click();
			Runtime.getRuntime().exec(".\\src\\main\\resources\\repository\\Auto_Status.exe");
			wait.until(ExpectedConditions.visibilityOfAllElements(shareStorybtn));
			wait.until(ExpectedConditions.elementToBeClickable(shareStorybtn));
			shareStorybtn.click();
			Thread.sleep(5000);
			

		
	}
	
//	 To Post Status Text in Facebook

	public void userStatusText() throws IOException, InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
		createstorybtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(createstorybtn));
		CreateTextStorybtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(StartTypingtext));
		StartTypingtext.sendKeys("Hard Work + Dream + Dedication = Success.");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(shareStorybtn));
		shareStorybtn.click();
		Thread.sleep(5000);

	
}
//	 To Post Text Post in Facebook

	public void userTextPost() {
		wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
		homebtn.click();
		
		wait.until(ExpectedConditions.visibilityOfAllElements(TextPostbtn));
		TextPostbtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(TextTypePostbtn));
		TextTypePostbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(TextTypePostbtn));
		TextTypePostbtn.sendKeys("To success in life... You need two things... Ignorance and Confidence...");
		
		wait.until(ExpectedConditions.visibilityOfAllElements(postbtn));
		postbtn.click();

	}
}