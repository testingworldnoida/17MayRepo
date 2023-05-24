package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001_Registration_User {
	
	@Test
	public void tc_001(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin Tyagi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		
		// Writing data into textbox  :-   sendKeys
		driver.findElementByName("fld_username").sendKeys("Hello");
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		
		// Clicking on a button : - 
		driver.findElementByXPath("//input[@value='Sign up']").click();
		
		
	}

}
