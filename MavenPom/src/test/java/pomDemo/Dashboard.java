package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class Dashboard {

	WebDriver driver;
	Dashboard(WebDriver d)
	{
		driver =d;
		//this method create web element
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement dashboard;
	public void dashboard()
	{
		dashboard.click();
	}
	
	@FindBy(id="shopping_cart_container")
	WebElement checkout;
	
	public void checkout()
	{
		checkout.click();
	}
}
