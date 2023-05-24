package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_004_Registration_Button_Link extends InitiateDriver{
	
	
	@Test
	public void tc001() {
		driver.findElementByName("fld_username").sendKeys("Hello"); // Write Data
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		//driver.findElementByXPath("//input[@value='Sign up']").click();  // Click on Button
		driver.findElementByXPath("//a[text()='Read Detail']").click();    // Click on Link

	}
	
}
