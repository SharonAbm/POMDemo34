package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.ItemPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest extends TestBase{
	HomePage homePage;
	ItemPage itemPage;
	ShoppingCartPage cartPage;
	@BeforeTest
	public void launchApp() {
	  initialize();
	}
	@Test(priority=1)
	public void searchItemTest() {
		homePage= new HomePage();
		homePage.searchItem("Parry Hotter");
		itemPage = new ItemPage();
		itemPage.viewItemDetail();
		itemPage.addItem();
		
		
	}
	@Test(priority=2)
	public void checkOutTest() {
		cartPage= new ShoppingCartPage();
		cartPage.checkOut();
	}
	  
	}

