package com.qa.automation.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.automation.base.TestBase;

public class HomePage  extends TestBase{

	// Page Factory - Object Repository
	@FindBy(xpath="//input[@type=\"search\" and @title=\"Search\"]")
	WebElement searchField;

	@FindBy(xpath="//div[@class=\"brand-header-GlobalNavBar__singleSearchWrapper--cGPry\"]//following-sibling::form/input")
	WebElement searchBtn;

	// Initializing the Page Objects
	public HomePage() { 
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateTripAdvisorHomePageTitle() {
		return driver.getTitle();
	}

	public SearchResultPage searchClubMahindra(String search){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		searchField.click();
		searchField.sendKeys(search);
		//click on the list of the search result
		List<WebElement> searchLinks = driver.findElements(By.xpath("//div[@class=\"_27pk-lCQ\"]/a"));
		searchLinks.get(0).click();
		return new SearchResultPage();
	}
}
