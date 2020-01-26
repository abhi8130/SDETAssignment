package com.qa.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.base.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.SelectedIphoneAmazonPage;
import com.qa.automation.pages.SelectedIphoneFlipkartPage;
import com.qa.automation.util.TestUtil;

public class SelectedIphoneFlipkartPageTest extends TestBase {

	TestUtil testUtil;
	HomePage homePage;
	SelectedIphoneFlipkartPage selectedIphoneFlipkartPage;
	SelectedIphoneAmazonPage selectedIphoneAmazonPage;

	public SelectedIphoneFlipkartPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		selectedIphoneFlipkartPage = homePage.searchIphoneOnFlipkart(prop.getProperty("search"));
	}

	@Test
	public void getIphonePriceFromAmazonTest() {
		selectedIphoneFlipkartPage.getIphonePriceFromFlipkart();
	}

	@AfterMethod 
	public void tearDown() { 
		driver.quit(); 
	}

}
