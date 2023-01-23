package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Checkout {
	WebDriver driver;
	Checkout(WebDriver d)
	{
		driver =d;
		//this method create web element
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement removeitem1;
	public void removeitem1()
	{
		removeitem1.click();
	}
	
	@FindBy(id="checkout")
	WebElement checkout;
	public void checkout()
	{
		checkout.click();
	}
	
	
	
}
