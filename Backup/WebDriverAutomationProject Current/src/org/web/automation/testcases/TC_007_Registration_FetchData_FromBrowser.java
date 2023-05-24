package org.web.automation.testcases;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_007_Registration_FetchData_FromBrowser extends InitiateDriver{
	
	
	@Test
	public void tc001() {
		driver.findElementByName("fld_username").sendKeys("Hello"); // Write Data
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		
        System.out.println("URL of Current Page is : -->  " + driver.getCurrentUrl());
        System.out.println("Title of Page is : -- > " + driver.getTitle());
        System.out.println("HTML OF PAGE IS HERE : -- > " +  driver.getPageSource());
        
        System.out.println("Inner text is :---> "+driver.findElementByXPath("//a[text()='Read Detail']").getText());
        System.out.println("Attribute Value is : -  "+ driver.findElementByName("terms").getAttribute("type"));
        System.out.println("Cordinates of element is : -  "+  driver.findElementByName("fld_username").getLocation());
        
        
        System.out.println("Element Enable : " + driver.findElementByXPath("//input[@value='Sign up']").isEnabled());
        System.out.println("Element Visible : " + driver.findElementByXPath("//input[@value='Sign up']").isDisplayed());
        System.out.println(driver.findElementByName("terms").isSelected());
        driver.findElementByName("terms").click();
        System.out.println(driver.findElementByName("terms").isSelected());

	}
	
}
