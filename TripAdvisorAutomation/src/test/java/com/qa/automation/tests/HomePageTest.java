package com.qa.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.pages.HomePage;
import com.qa.automation.base.TestBase;

public class HomePageTest extends TestBase{

	HomePage homePage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage(); 
	}

	@Test (priority = 1) 
	public void validateTripAdvisorHomePageTitleTest() {
		String title = homePage.validateTripAdvisorHomePageTitle();
		System.out.println(title);
	}

	@Test (priority = 2) 
	public void searchClubMahindraTest() {
		homePage.searchClubMahindra(prop.getProperty("search"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
