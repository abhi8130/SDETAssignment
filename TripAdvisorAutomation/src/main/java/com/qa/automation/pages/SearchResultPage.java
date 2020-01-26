package com.qa.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.automation.base.TestBase;

public class SearchResultPage extends TestBase {
	// Page Factory - Object Repository
	@FindBy(xpath="//div[@class=\"hotels-community-content-common-ContextualCTA__wrapper--1QPc2\"]/descendant::a")
	WebElement writeReviewBtn;

	@FindBy(xpath="//div[@title=\"Post\"]/span[1]")
	WebElement postIcon;

	// Initializing the Page Objects
	public SearchResultPage() { 
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateSearchResultPageTitle() {
		return driver.getTitle();
	}

	public ReviewPage clickReviewBtn() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1000)");
			writeReviewBtn.click();
			return new ReviewPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
