package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MarketPlacePage extends LoginPage{
	@FindBy(xpath = "//span[text()='Marketplace']")
	WebElement marketplacebtnbtn;

	/**
	 *  To Find Friend in facebook
	 */
	public void userMarketPlace() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(marketplacebtnbtn));
			marketplacebtnbtn.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
			}
			for (int i = 1; i < 5; i++) {
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
			}
			wait.until(ExpectedConditions.visibilityOfAllElements(homebtn));
			homebtn.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
