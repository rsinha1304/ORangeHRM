package com.ReusableCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCode {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	//static block to run first
	static {
		
		FileInputStream file;
		try {
//			file = new FileInputStream("com.OrangeHRM/src/test/java/resource/evm.properties");
			file = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\com.OrangeHRM\\src\\test\\java\\resource\\evm.properties");
			prop = new Properties();
			
			try {
				prop.load(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
		
		
	
	
	
	public void setUp() {
		
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get(prop.getProperty("url"));	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	public void tearDown() {
		driver.quit();
		
		
	}
	
	public void clearAndText(WebElement ele, String value) {
		ele.clear();
		ele.sendKeys(value);	
	}
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public void validation() {
		String str = driver.getTitle();
		System.out.println(str);
	}
}











