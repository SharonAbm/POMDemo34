package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	@FindBy(css= "div.cart > button.call-to-action")
	WebElement chkoutBtn;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkOut() {
		chkoutBtn.click();
	}
	//applyCoupon()
	//emptyCart()

}
