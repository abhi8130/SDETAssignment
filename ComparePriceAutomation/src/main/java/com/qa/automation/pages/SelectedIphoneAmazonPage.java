package com.qa.automation.pages;

import java.text.NumberFormat;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qa.automation.base.TestBase;

public class SelectedIphoneAmazonPage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(xpath="//div[@data-id=\"MOBF9Z7ZUGQ6YDBH\"]/descendant::div[@class=\"_1vC4OE _2rQ-NK\"]")
	WebElement amazonIhonePrice;

	// Actions
	public String validateAmazonHomePageTitle() {
		return driver.getTitle();
	}

	public String getIphonePriceFromAmazon() {
		List<WebElement> iphonePrices = driver.findElements(By.xpath("//div[@class=\"sg-col-inner\"]/descendant::div[@class=\"a-row\"][1]/a/span[@class=\"a-price\"]"));
		String amazonPrice = iphonePrices.get(1).getText().substring(1,7);
		System.out.println("Prcie of iphone xr yellow (Amazon):" + amazonPrice);
		return amazonPrice;
	}
}
