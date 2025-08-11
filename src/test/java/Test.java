import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Pages.LoginPage;
import com.ReusableCode.BaseCode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		By username = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@type='password']");
		By button = By.xpath("//button[@type='submit']");
		
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(button).click();
		
		//admin page
		
		By Admin = By.xpath("//span[text()='Admin']");
		By addButton = By.xpath("//div[@class='orangehrm-header-container']/child::button[@type='button']");
		By role_dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
//		By status_dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
//		By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
//		By username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
//		By password = By.xpath("(//input[@type='password'])[1]");
//		By confirmPassword = By.xpath("(//input[@type='password'])[2]");
//		By button_save = By.xpath("//button[@type='submit']");
		
		driver.findElement(Admin).click();
		driver.findElement(addButton).click();
		driver.findElement(role_dropdown).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/child::div[text()='Admin']")).click();
//		Select s = new Select();
		
//		String x = driver.getTitle();
//		System.out.println(x);
//		driver.quit();
//		
//		BaseCode y = new BaseCode();
//		LoginPage x = new LoginPage();
//		x.setUp();
//		x.userLogin();
//		x.validation();
//		x.tearDown();
		
		


		

	}

}
