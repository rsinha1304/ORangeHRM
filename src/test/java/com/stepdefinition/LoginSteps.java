package com.stepdefinition;

import com.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LoginPage {

		LoginPage login = new LoginPage();
	
	@Given("I am on the login page")
	public void login_page() {
		login.setUp();
	}
	@When("I enter a valid username 'Admin'")
	public void enter_username() {
		login.userLogin();
	}
	@And("I enter a valid password 'admin123'")
	public void enter_password() {
		
	}
	@And("I click the 'Login' button")
	public void click_login() {
		
	}
	@Then("I should be redirected to the dashboard page")
	public void validate_dashboard() {
		
	}
	@And("I should validate with page title 'OrangeHRM'")
	public void validate_page() {
		login.validation();
	}
	@Then("Close the browser")
	public void Quit() {
		login.tearDown();
	}
}
