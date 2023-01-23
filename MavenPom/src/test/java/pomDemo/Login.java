package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public void A()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ganesh Chavan\\\\Downloads\\\\Compressed\\\\chromedriver_win32_3\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.saucedemo.com/");
		//enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//click on login button
		driver.findElement(By.id("login-button")).click();
	
	}
}
