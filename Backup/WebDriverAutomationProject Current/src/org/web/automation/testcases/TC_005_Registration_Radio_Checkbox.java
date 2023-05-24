package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_005_Registration_Radio_Checkbox extends InitiateDriver{
	
	
	@Test
	public void tc001() {
		driver.findElementByName("fld_username").sendKeys("Hello"); // Write Data
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		driver.findElementByXPath("//input[@name='add_type' and @value='home']").click();  // Radio Button
		driver.findElementByName("terms").click();

	}
	
}
