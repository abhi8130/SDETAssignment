package com.qa.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.automation.base.TestBase;
import java.util.List;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 15;


	public static void waitForPresenceOfElelment(By loc)
	{
		WebDriverWait wait= new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}

	public  static void dropDown(By loc,String text){
		List <WebElement> list= driver.findElements(loc);
		for(int i=0; i<list.size();i++){
			WebElement values = list.get(i);
			if(values.getAttribute("text").equalsIgnoreCase(text))
				values.click();
		}
	}

	public static boolean verifyElementToBeLocated(By Loc)
	{
		WebElement element = driver.findElement(Loc);
		element.isDisplayed();
		return true;
	}
}
