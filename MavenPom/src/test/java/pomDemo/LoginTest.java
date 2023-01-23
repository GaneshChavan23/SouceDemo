package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest 

{
	@Test
public void A()
{
	

	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ganesh Chavan\\\\Downloads\\\\Compressed\\\\chromedriver_win32_3\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//create login page object
		/*
		LoginPage login=new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		login.enterusername("standard_user");
		login.enterpassword("secret_sauce");
		login.Clickonloginbtn();
		*/
		
		LoginPage2 loginpg=new LoginPage2(driver);
		//open url
		driver.get("https://www.saucedemo.com/");
		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.Clickonloginbtn();
		
		Dashboard d=new Dashboard(driver);
		d.dashboard();
		d.checkout();
		
		Checkout c=new Checkout(driver);
		c.removeitem1();
		c.checkout();
		
		Checkoutinfo ct=new Checkoutinfo(driver);
		ct.checkoutinfo1();
		ct.checkoutinfo2();
		ct.checkoutinfo3();
		ct.checkoutinfo4();
		
		
		
		
	
}
}
