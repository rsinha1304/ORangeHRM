package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ReusableCode.BaseCode;

public class LoginPage extends BaseCode{
	
	By username = By.xpath("//input[@name='username']");
	By pass = By.xpath("//input[@type='password']");
	By button = By.xpath("//button[@type='submit']");
	
	

	public void userLogin() {
		WebElement name = driver.findElement(username);
		clearAndText(name,prop.getProperty("UserName"));
		WebElement password = driver.findElement(pass);
		clearAndText(password,prop.getProperty("Password"));
		
		WebElement btn = driver.findElement(button);
//		btn.click();
		clickOnElement(btn);
		
	}
}
