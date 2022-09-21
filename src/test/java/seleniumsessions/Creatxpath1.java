package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creatxpath1 {

	public static void main(String[] args) {

		System.getProperty("webdrive,chromedrive", "/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		//absolute xpath not recommended
		//a[contains(text(),'Daily Deals')]
		//1 performance issue
		//2 not reliable
		//3 can be change at any time
		
		
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("ali");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("love");
		
		//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("book");
		
		//driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("toy");
		
		
		//id - test_123
		//id - test_34545
		// EX--driver.findElement(By.xpath("//input[start-with(@id,test_123)")).sendKeys("text");
		
		
		//id - 123_test_t
		//id - 456_test_t
		//EX--driver.findElement(By.xpath("//input[end-with(@id,_test_t)]")).sendKeys("text");
		
		//for link
		// all lick start with
		driver.findElement(By.xpath("//a[contains(text(),'Daily Deals')]")).click();
		
		
		
		
	}

}
