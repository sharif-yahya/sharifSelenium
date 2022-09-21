package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		driver.navigate().to("http://www.amazon.com");

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().to("http://www.nike.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("soccer");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().refresh();

	}

}
