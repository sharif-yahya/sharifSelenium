package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class Acmefurniture1 {

	public static void main(String[] args) {

		System.getProperty("Webdriver, ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.acmecorp.com/new-york-dealer-application");

		driver.findElement(By.xpath("//*[@class='mfp-close']")).click();

		driver.findElement(By.xpath("//input[@id='textinput-1611255147175']")).sendKeys("ey");

		driver.findElement(By.xpath("//*[@id='textinput-1611255175833']")).sendKeys("ali");

		driver.findElement(By.cssSelector("#textinput-1611255272123")).sendKeys("55 5ave");

		driver.findElement(By.name("textinput-1611255272129")).sendKeys("sunset");

		driver.findElement(By.xpath("//input[@id='textinput-1611255272133']")).sendKeys("ny");

		driver.findElement(By.cssSelector("#textinput-1611255272139")).sendKeys("21230");

		driver.findElement(By.cssSelector("#number-1611255441732")).sendKeys("9999-33333");

		Select select = new Select(driver.findElement(By.name("Country")));

		select.selectByVisibleText("united states");

//		// different approach
//		WebElement countryDropDownElement = driver.findElement(By.name("Country"));
//		select(countryDropDownElement,"visable Text", "united states");
//		
	}

//	public static void select(WebElement element, String selectionType, String visableText) {
//		if (selectionType.equals("visable Text")) {
//			Select select = new Select(element);
//			select.selectByVisibleText(visableText);
//			
//		} else if (selectionType.equals("value")) {
//			Select select = new Select(element);
//			select.selectByValue(visableText);
//		}
//
//	}

}
