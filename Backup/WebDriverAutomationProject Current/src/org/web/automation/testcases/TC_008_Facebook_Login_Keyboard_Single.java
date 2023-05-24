package org.web.automation.testcases;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_008_Facebook_Login_Keyboard_Single extends InitiateDriver{
	
	@Test
	public void tc001() {
	  
       driver.findElementById("email").sendKeys("Hello");
       Actions act = new Actions(driver);
       act.sendKeys(Keys.TAB).perform();
       act.sendKeys("HelloWorld").perform();
       act.sendKeys(Keys.ENTER).perform();
	}
	
}
