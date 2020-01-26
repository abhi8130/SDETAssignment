package com.qa.automation.tests;

import org.testng.Assert;
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

	/*
	 * @Test (priority = 1) public void searchIphoneOnAmazonTest(){
	 * driver.get(prop.getProperty("amazonUrl"));
	 * homePage.searchIphoneOnAmazon(prop.getProperty("search")); }
	 */
	
	@Test (priority = 1)
	public void searchIphoneOnFlipkartTest() throws InterruptedException{ 
		driver.get(prop.getProperty("flipkartUrl"));
		homePage.searchIphoneOnFlipkart(prop.getProperty("search"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
