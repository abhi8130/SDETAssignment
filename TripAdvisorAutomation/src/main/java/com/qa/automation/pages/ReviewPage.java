package com.qa.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.automation.base.TestBase;

public class ReviewPage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(xpath="//span[@id=\"qid190_bubbles\"]")
	WebElement sleepQualityRating;

	@FindBy(xpath="//span[@id=\"qid12_bubbles\"]")
	WebElement serviceRating;

	@FindBy(xpath="//span[@id=\"bubble_rating\"]")
	WebElement overallRating;

	@FindBy(xpath="//span[@id=\"qid14_bubbles\"]")
	WebElement cleanlinessRating;

	@FindBy(xpath="//input[@id=\"ReviewTitle\"]")
	WebElement titleField;

	@FindBy(xpath="//textarea[@id=\"ReviewText\"]")
	WebElement reviewTxt;

	@FindBy(xpath="//input[@id=\"noFraud\"]")
	WebElement noFraudCheckbox;

	// Initializing the Page Objects
	public ReviewPage() { 
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateReviewPageTitle() {
		return driver.getTitle();
	}

	public void writeReview(String title, String review) {
		//hover over overall rating
		Actions action = new Actions(driver);
		action.moveToElement(overallRating).perform();
		titleField.sendKeys(title);
		reviewTxt.sendKeys(review);
		//scroll vertically downwards
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1000)");
		//hover over ratings field
		action.moveToElement(serviceRating).perform();
		action.moveToElement(sleepQualityRating).perform();
		action.moveToElement(cleanlinessRating).perform();
		js.executeScript("window.scrollBy(0,500)");
		//check if checkbox is not selected, then click on it
		if(!noFraudCheckbox.isSelected())
			noFraudCheckbox.click();
	}
}