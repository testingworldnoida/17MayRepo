package org.hcl.web.validations;

import org.hcl.web.base.InitiateBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ElementValidations extends InitiateBrowser{
	
	
	public static void validateElementExistOnPage(String xpath) {
		try{
			driver.findElement(By.xpath(xpath));
			Assert.assertTrue(true);
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementEnabled(String xpath) {
		try{
			if(driver.findElement(By.xpath(xpath)).isEnabled()) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementVisible(String xpath) {
		try{
			if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementText(String xpath, String expectedText) {
		try{
			if(driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase(expectedText)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementText(String xpath, String attName,  String expectedText) {
		try{
			if(driver.findElement(By.xpath(xpath)).getAttribute(attName).equalsIgnoreCase(expectedText)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			Assert.assertTrue(false);
		}
		
	}
	
	
}
