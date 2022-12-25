package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.SeleniumActions;

public class CheckoutPage extends SeleniumActions{
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By firstNameInput = By.xpath("//*[@id=\"first-name\"]");
	public static final By lastNameInput = By.xpath("//*[@id=\"last-name\"]");
	public static final By postalCodeInput = By.xpath("//*[@id=\"postal-code\"]");
	public static final By userDataConfirmationBTN = By.xpath("//*[@id=\"continue\"]");
	public static final By finishCheckoutBTN = By.xpath("//*[@id=\"finish\"]");
	
	public void insertUserData() {
		InsertValues(firstNameInput, "Michele", driver);
		InsertValues(lastNameInput, "da silva sauro", driver);
		InsertValues(postalCodeInput, "13512208", driver);
	}
	
	public void userDataConfirmation() {
		click(userDataConfirmationBTN, driver);
	}
	
	public void finishCheckout() {
		click(finishCheckoutBTN, driver);
	}
}
