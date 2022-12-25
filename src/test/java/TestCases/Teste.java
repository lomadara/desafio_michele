package TestCases;
import Utils.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Page.CartPage;
import Page.CatalogPage;
import Page.CheckoutPage;
import Page.LoginPage;
import Utils.SeleniumActions;

public class Teste  extends SeleniumActions{
	private WebDriver driver;
	DriverManager DriverManager;
	LoginPage loginPage;
	CatalogPage catalogPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	
	@Before
	public void setup() {
		DriverManager = new DriverManager();
		driver = Utils.DriverManager.browser("chrome");
		loginPage = new LoginPage(driver);
		catalogPage = new CatalogPage(driver);
		cartPage = new CartPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}
	
	
	@Test
	public void loginTest() {
		loginPage.userLogin();
		
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.equalsIgnoreCase("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Sucess in login!");
		} else {
			Assert.fail();
		}
	}
	
	@Test
	public void addToCartTest() {
		loginPage.userLogin();
		catalogPage.addToCart();
		String numberOfItemsInCart = catalogPage.getNumberOfItemsInCart();
		
		if (numberOfItemsInCart.equalsIgnoreCase("2")) {
			System.out.println("Sucess in add itens to cart!");
		}
		else {
			Assert.fail();
		}
	}
	
	@Test
	public void cartCheckoutTest() {
		loginPage.userLogin();
		catalogPage.addToCart();
		cartPage.runToCart();
		cartPage.runToCheckout();
		checkoutPage.insertUserData();
		checkoutPage.userDataConfirmation();
		checkoutPage.finishCheckout();
		
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equalsIgnoreCase("https://www.saucedemo.com/checkout-complete.html")) {
			System.out.println("Sucessfull checkout!");
		} else {
			Assert.fail();
		}
	}
	
	@After
	public void fim() {
		driver.quit();
	}
	
}

