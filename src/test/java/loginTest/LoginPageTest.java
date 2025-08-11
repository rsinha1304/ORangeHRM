package loginTest;

import org.openqa.selenium.By;

import com.Pages.LoginPage;
import com.ReusableCode.BaseCode;

public class LoginPageTest extends BaseCode {
	
	public static void main(String[] args) {
		
		BaseCode x = new BaseCode();
		x.setUp();
		LoginPage y = new LoginPage();
		y.userLogin();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Organization ']")).click();
		driver.findElement(By.xpath("//a[text()='General Information']")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
