package testgitselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
	@Test 
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("trainer@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("MyPassword!");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
