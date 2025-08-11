package com.Pages;

import org.openqa.selenium.By;

public class AdminPage {
	
	By Admin = By.xpath("//span[text()='Admin']");
	By addButton = By.xpath("//div[@class='orangehrm-header-container']/child::button[@type='button']");
	By role_dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By status_dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
	By username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By password = By.xpath("(//input[@type='password'])[1]");
	By confirmPassword = By.xpath("(//input[@type='password'])[2]");
	By button_save = By.xpath("//button[@type='submit']");
	By OrganizationDrpDwn = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']");

}
