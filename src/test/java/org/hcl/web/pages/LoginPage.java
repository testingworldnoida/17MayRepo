package org.hcl.web.pages;

import java.io.IOException;

import org.hcl.web.base.InitiateBrowser;
import org.hcl.web.library.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends InitiateBrowser {
	
	public static void enterUsername(String uname) throws IOException {
		driver.findElement(By.xpath(PropertyReader.elementLocatorReader("username_textbox_xpath"))).sendKeys(uname);
	}
	
	public static void enterPassword(String pass) {
		driver.findElement(By.name("pass")).sendKeys(pass);
	}
	
	public static void clickSigninButton() {
		driver.findElement(By.name("login")).click();
	}

}
