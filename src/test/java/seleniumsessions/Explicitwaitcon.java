package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitcon {

	public static void main(String[] args) {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.nike.com");
		
		clickOn(driver, driver.findElement(By.xpath("//input[@id='continue']")), 20);

	}
	
	public static void clickOn(WebDriver driver,WebElement locatar,int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable (locatar));
		locatar.click();
	}

}
