package pomDemo;
//using page fatory

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class LoginPage2 {

	WebDriver driver;
	LoginPage2(WebDriver d)
	{
		driver =d;
		//this method create web element
		PageFactory.initElements(driver, this);
	}
	//identyfy webelement
	//identyfy username
	@FindBy(id="user-name")
	WebElement username;
	
	//identyfy password
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public void enterusername(String uname)
	{
		username.sendKeys("standard_user");
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys("secret_sauce");
	}
	public void Clickonloginbtn()
	{
		loginbutton.click();
	}
	
	
	
	
}
