package com.qa.automation.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.base.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.SearchResultPage;

public class SearchResultPageTest extends TestBase {

	HomePage homePage;
	SearchResultPage searchResultPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage(); 
		homePage.searchClubMahindra(prop.getProperty("search"));
	}

	@Test
	public void clickReviewBtnTest(){ 
		searchResultPage.clickReviewBtn();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
