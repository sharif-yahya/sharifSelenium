package seleniumsessionsrepreat;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createxpath5 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chrome", "/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.nike.com");
		
		//ebay
		//driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();
		
		//amazon
		//driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
		
		//driver.findElement(By.xpath("//input[@class='pre-search-input headline-5']")).sendKeys("soccer");
		
		driver.findElement(By.linkText("Men")).click();

		
			
		
		
		
		
		
		

	}

}
