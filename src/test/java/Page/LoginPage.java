package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.SeleniumActions;

public class LoginPage extends SeleniumActions{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By inputUsername = By.xpath("//*[@id=\"user-name\"]");
	public static final By inputPassword = By.xpath("//*[@id=\"password\"]");
	public static final By loginBTN = By.xpath("//*[@id=\"login-button\"]");
	
	public void userLogin() {
		getPage("https://www.saucedemo.com/", driver);
		InsertValues(inputUsername, "standard_user", driver);
		InsertValues(inputPassword, "secret_sauce", driver);
		click(loginBTN, driver);
	}
}
