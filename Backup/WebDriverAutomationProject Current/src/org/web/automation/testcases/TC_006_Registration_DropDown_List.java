package org.web.automation.testcases;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;

public class TC_006_Registration_DropDown_List extends InitiateDriver{
	ChromeDriver driver;
	
	
	@Test
	public void tc001() {
		
	
		driver.findElementByName("fld_username").sendKeys("Hello"); // Write Data
		driver.findElementByName("fld_username").clear();
		driver.findElementByName("fld_username").sendKeys("Testing");
		
        Select  country = new Select(driver.findElementById("countryId"));
        country.selectByVisibleText("India");  // 3rd Approach
        
        //System.out.println(country.getFirstSelectedOption().getText());
        
        List<WebElement> allOptions = country.getOptions();
        for(WebElement e : allOptions){
        	System.out.println(e.getText());
        }
        
        Select  gender = new Select(driver.findElementByName("sex"));
        gender.selectByVisibleText("Male");  // 3rd Approach
        
        //country.selectByIndex(10);    // 1st Approach
        //country.selectByValue("21");  // 2nd Approach
        

        

	}
	
}
