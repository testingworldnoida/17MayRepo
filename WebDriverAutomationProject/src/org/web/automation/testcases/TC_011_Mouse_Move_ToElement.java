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

public class TC_011_Mouse_Move_ToElement {
	ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();   // Browser Will start
		driver.manage().window().maximize();                   // Maximizing browser window
		driver.get("https://thetestingworld.com/"); // Putting URL to Browser
	
	}

	@AfterMethod
	public void closeBrowser(){
		//driver.quit();
	}
	
	@Test
	public void tc001() {
	  
     
       Actions act = new Actions(driver);
       act.moveToElement(driver.findElementByXPath("//a[contains(@title,'VIDEOS')]")).perform();
       driver.findElementByXPath("//a[@title='Free Videos']").click();
	}
	
}