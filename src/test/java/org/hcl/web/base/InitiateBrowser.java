package org.hcl.web.base;

import java.io.IOException;
import java.time.Duration;

import org.hcl.web.library.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InitiateBrowser {

	public static WebDriver driver;	

	public static WebDriver startBrowser() throws IOException {
		if(PropertyReader.projectConfigurationReader("BrowserName").equalsIgnoreCase("Chrome")){
			 ChromeOptions option = new ChromeOptions();
	         option.addArguments("--remote-allow-origins=*");
	         System.setProperty("webdriver.chrome.driver","C:/Users/Nitin Tyagi/Downloads/chromedriver_win32 (31)/chromedriver.exe");
	         driver = new ChromeDriver(option);
		}
		else if(PropertyReader.projectConfigurationReader("BrowserName").equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();	
		}
		else if(PropertyReader.projectConfigurationReader("BrowserName").equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();	
		}
		else {
			System.setProperty("webdriver.chrome.driver","C:/Users/Nitin Tyagi/Downloads/chromedriver_win32 (31)/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(PropertyReader.projectConfigurationReader("ApplicationURL"));
		return driver;
	}
	
	public void closeBrowser() {
		//driver.close(); 
	}
	
}
// BDD --  > TDD
// POM - Page Object Model