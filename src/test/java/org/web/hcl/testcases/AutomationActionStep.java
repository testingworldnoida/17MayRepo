package org.web.hcl.testcases;

import org.hcl.web.base.InitiateBrowser;
import org.hcl.web.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AutomationActionStep {

	WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver = InitiateBrowser.startBrowser();
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
	    LoginPage login = new LoginPage();
	    login.enterUsername(arg1);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
		
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
			
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	
	}

	@Then("^User should get welcome message$")
	public void user_should_get_welcome_message() throws Throwable {
	
	}

	@When("^User enters data in search box$")
	public void user_enters_data_in_search_box() throws Throwable {
	}

	@When("^User clicks on Search button$")
	public void user_clicks_on_Search_button() throws Throwable {
	}

	@Then("^Search results should be displayed$")
	public void search_results_should_be_displayed() throws Throwable {
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	}

	@When("^User gets hello message$")
	public void user_gets_hello_message() throws Throwable {

	}


	
}
