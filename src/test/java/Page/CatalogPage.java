package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumActions;

public class CatalogPage extends SeleniumActions{
	private WebDriver driver;
	
	public CatalogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By firstProduct = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
	public static final By secondProduct = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button");
	public static final By cartSpan = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	
	public void addToCart() {
		click(firstProduct, driver);
		click(secondProduct, driver);
	}
	
	public String getNumberOfItemsInCart() {
		String numberOfItemsInCart = getAttributeValue(cartSpan, driver);
		return numberOfItemsInCart;
	}
}
