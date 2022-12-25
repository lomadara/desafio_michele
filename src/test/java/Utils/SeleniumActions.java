package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions {
	public static void InsertValues(By xpath, String value, WebDriver driver) {
		WebElement Input = driver.findElement(xpath);
		Input.click();
		Input.sendKeys(value);
	}
	
	public static void click(By xpath, WebDriver driver) {
		WebElement element = driver.findElement(xpath);
		element.click();
	}
	
	public static void getPage(String pageUrl, WebDriver driver) {
		driver.get(pageUrl);
	}
	
	public static String getAttributeValue(By xpath, WebDriver driver) {
		WebElement element = driver.findElement(xpath);
		return element.getText();
	}
	
}
