package org.hcl.web.pages;

import org.hcl.web.base.InitiateBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage2  {
	
	@FindBy(id="email")
	static WebElement UsernameTextbox;
	@FindBy(name="pass11")
	static WebElement PasswordTextbox;
	@FindBy(name="login")
	static WebElement SigninButton;
	
	public static void enterUsername(String uname) {
		UsernameTextbox.sendKeys(uname);
	}
	
	public static void enterPassword(String pass) {
		PasswordTextbox.sendKeys(pass);
	}
	
	public static void clickSigninButton() {
		SigninButton.click();
	}

}
