package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class LoginPage {
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver d)
	{
		driver = d;
	}
	
	//locate webelement
	 
	By uername = By.id("user-name");
	By password =By.id("assword");
	By loginbtn =By.id("login-button");
	
	public void enterusername(String uname)
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	public void enterpassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	public void Clickonloginbtn()
	{
		driver.findElement(By.id("login-button")).click();
	}
	
}
