package com.qa.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.base.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.SearchResultPage;
import com.qa.automation.util.TestUtil;
import com.qa.automation.pages.ReviewPage;

public class ReviewPageTest extends TestBase {

	HomePage homePage;
	SearchResultPage searchResultPage;
	ReviewPage reviewPage;
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage(); 
		homePage.searchClubMahindra(prop.getProperty("search"));
		searchResultPage.clickReviewBtn();
	}

	@Test
	public void clickReviewBtnTest(){ 
		reviewPage.writeReview(prop.getProperty("title"), prop.getProperty("review"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
