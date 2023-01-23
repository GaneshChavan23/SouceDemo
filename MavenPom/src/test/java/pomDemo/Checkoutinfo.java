package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Checkoutinfo {
	
		WebDriver driver;
	
		Checkoutinfo(WebDriver d)
		{
			driver =d;
			//this method create web element
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="first-name")
		WebElement checkoutinfo1;
		public void checkoutinfo1()
		{
			checkoutinfo1.sendKeys("Ganesh");
		}
		
		@FindBy(id="last-name")
		WebElement checkoutinfo2;
		public void checkoutinfo2()
		{
			checkoutinfo2.sendKeys("Chavan");
		}
		@FindBy(id="postal-code")
		WebElement checkoutinfo3;
		public void checkoutinfo3()
		{
			checkoutinfo3.sendKeys("413304");
		}
		
		@FindBy(id="continue")
		WebElement checkoutinfo4;
		public void checkoutinfo4()
		{
			checkoutinfo4.click();
		}
		
		

}
