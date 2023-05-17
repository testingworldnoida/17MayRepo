package org.hcl.web.validations;

import org.hcl.web.base.InitiateBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;


public class PageValidations extends InitiateBrowser{
	
	
	public static void validatePageURL(String expectedURL) {
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
	}
	
	
	public static void validatePageTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	public static void validateTextOnPage(String expectedText) {
		
		if(driver.getPageSource().contains(expectedText)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}

		
	}
	
	public static void validateElementOnPage(String xpath) {
		
		try{
			driver.findElement(By.xpath(xpath));
			Assert.assertTrue(true);
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
	}

}
