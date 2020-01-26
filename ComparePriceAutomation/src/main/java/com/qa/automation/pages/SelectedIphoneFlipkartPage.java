package com.qa.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.automation.base.TestBase;

public class SelectedIphoneFlipkartPage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(xpath="//div[@class=\"_3O0U0u\"]/descendant::div[@class=\"_1vC4OE _2rQ-NK\"]")
	WebElement flipkartIphonePrice;

	@FindBy(xpath="class=\"_3wU53n\"")
	WebElement clickPhone;

	@FindBy(xpath="//div[@class=\"_3iZgFn\"]")
	WebElement pricePhone;

	// Actions
	public String validateFlipkartHomePageTitle() {
		return driver.getTitle();
	}

	public String getIphonePriceFromFlipkart() {
		try {
			List<WebElement> values = driver.findElements(By.xpath("//div[@class=\"_3O0U0u\"]/descendant::div[@class=\"_1vC4OE _2rQ-NK\"]"));
			String flipkartPrice =	values.get(0).getText().substring(1,7);
			System.out.println("Prcie of iphone xr yellow (Flipkart): " + flipkartPrice);
			return flipkartPrice;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
