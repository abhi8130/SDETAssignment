package com.qa.automation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.automation.util.TestUtil;
import com.qa.automation.base.TestBase;
import com.qa.automation.pages.HomePage;
import com.qa.automation.pages.SelectedIphoneAmazonPage;


public class SelectedIphoneAmazonPageTest extends TestBase{

	TestUtil testUtil;
	HomePage homePage;
	SelectedIphoneAmazonPage selectedIphoneAmazonPage;

	public SelectedIphoneAmazonPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		selectedIphoneAmazonPage = homePage.searchIphoneOnAmazon(prop.getProperty("search"));
	}

	@Test
	public void getIphonePriceFromAmazonTest() {
		selectedIphoneAmazonPage.getIphonePriceFromAmazon();
	}

	@AfterMethod 
	public void tearDown() { 
		driver.quit(); 
	}
}
