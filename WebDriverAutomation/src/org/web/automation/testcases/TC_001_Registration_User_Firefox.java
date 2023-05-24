package org.web.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001_Registration_User_Firefox {
	
	@Test
	public void tc_001(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nitin Tyagi\\Downloads\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://thetestingworld.com/testings/");
		
		// Writing data into textbox  :-   sendKeys
		driver.findElementByName("fld_username").sendKeys("Hello");
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		
		// Clicking on a button : - 
		driver.findElementByXPath("//input[@value='Sign up']").click();
		
		
	}

}
