package testcases;



import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Synthesizer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {
	ChromeDriver  driver;
	@BeforeMethod
	public void startBrowser() throws InterruptedException{
		int i=100;
		System.setProperty("webdriver.chrome.driver", "C:/Users/Nitin Tyagi/Downloads/chromedriver_win32 (7)/chromedriver.exe");
		driver = new ChromeDriver();
	    //driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		//Thread.sleep(10000);
	}
	
	@AfterMethod
	public void closeBrowser(){
		
	}

	@Test
	public void tc001() throws IOException{
		
		driver.findElementById("email33").sendKeys("abcd");
	}
	
}
