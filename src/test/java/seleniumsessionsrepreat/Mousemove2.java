package seleniumsessionsrepreat;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove2 {

	public static void main(String[] args) {

		System.getProperty("webdriver,chromdriver", "/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("Toys"))).build().perform();

		driver.findElement(By.linkText("Action Figures")).click();
		
		driver.findElement(By.linkText("Action Figures Parts")).click();
		
		driver.findElement(By.linkText("Choose Millennium Falcon Vintage Parts Star Wars Canopy Cannon Radar Ramp 1979")).click();

		
		
		
	}

}
