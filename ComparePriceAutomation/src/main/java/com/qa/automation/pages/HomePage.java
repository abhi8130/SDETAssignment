package com.qa.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.automation.base.TestBase;
import com.qa.automation.util.TestUtil;

public class HomePage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(id="nav-logo")
	WebElement amazonLogoImage;

	@FindBy(xpath="//img[@alt=\"Flipkart\"]")
	WebElement flipkartLogoImage;

	@FindBy(xpath="//div[@class=\"row\"]/descendant::div/a[contains(text(),'Sign Up')]")
	WebElement signUpHyperlink;

	@FindBy(id="twotabsearchtextbox")
	WebElement amazonSearchField;

	@FindBy(xpath="//input[@type=\"submit\" and @value=\"Go\"]")
	WebElement amazonSearchBtn;

	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement flipkartSearchField;

	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement flipkartSearchBtn;

	@FindBy(xpath="//button[@class=\"_2AkmmA _29YdH8\"]")
	WebElement closeFlipkartLoginModal;

	// Initializing the Page Objects
	public HomePage() { 
		PageFactory.initElements(driver, this);
	}


	// Actions
	public String validateAmazonHomePageTitle() {
		return driver.getTitle();
	}

	public String validateFlipkartHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateAmazonLogo() {
		return amazonLogoImage.isDisplayed();
	}

	public boolean validateFlipkartLogo() {
		return flipkartLogoImage.isDisplayed();
	}

	public SelectedIphoneAmazonPage searchIphoneOnAmazon(String search) {
		driver.get(prop.getProperty("amazonUrl"));
		amazonSearchField.sendKeys(search);
		amazonSearchBtn.click();	
		return new SelectedIphoneAmazonPage();
	}

	public SelectedIphoneFlipkartPage searchIphoneOnFlipkart(String search) throws InterruptedException {
		driver.get(prop.getProperty("flipkartUrl"));
		closeFlipkartLoginModal.click();
		flipkartSearchField.sendKeys(search);
		flipkartSearchBtn.click();	
		Thread.sleep(7000);		
		return new SelectedIphoneFlipkartPage();
	}

}
