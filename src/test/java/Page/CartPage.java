package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.SeleniumActions;

public class CartPage extends SeleniumActions{
	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By cartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	public static final By checkoutBTN = By.xpath("//*[@id=\"checkout\"]");
	
	public void runToCart() {
		click(cartIcon, driver);
	}
	
	public void runToCheckout() {
		click(checkoutBTN, driver);
	}

}
