package org.web.automation.testcases;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_013_Registration_DropDown_List extends InitiateDriver {
	
	
	@Test
	public void tc001() {
		
	
		driver.findElementByName("fld_username").sendKeys("Hello"); // Write Data
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		
        Select  country = new Select(driver.findElementById("countryId"));
        country.selectByVisibleText("India");  // 3rd Approach
        
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("stateId"), "Delhi"));
        
        Select  state = new Select(driver.findElementById("stateId"));
        state.selectByVisibleText("Delhi");
        
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("cityId"), "Delhi"));
        Select  city = new Select(driver.findElementById("cityId"));
        city.selectByVisibleText("Delhi");
        

	}
	
}
