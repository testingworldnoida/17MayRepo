package org.abc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001_Login_Logout {
	
	//               COMMON  -  JAVA PROGRAMMING
	
	
	
	
	
	ChromeDriver driver ;
	@BeforeMethod
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin Tyagi\\Downloads\\chromedriver_win32 (33)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/");
	
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close();
		//driver.quit();
	}
	
	
	@Test
	public void validateLoginValidCredentials() throws InterruptedException {
	
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//a[@title='TRAINING']"))).perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[@title='CORPORATE TRAINING']"))).perform();
		//driver.findElement(By.xpath("//a[contains(@title,'Selenium with Java')]")).click();
		
	}

}
