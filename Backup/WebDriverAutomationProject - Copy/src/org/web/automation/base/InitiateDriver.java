package org.web.automation.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.library.PropertyReader;

public class InitiateDriver {
	
    public ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();   // Browser Will start
		driver.manage().window().maximize();                   // Maximizing browser window
		driver.get(PropertyReader.applicationConfigReader("Application_URL")); // Putting URL to Browser
	
	}

	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}

}
