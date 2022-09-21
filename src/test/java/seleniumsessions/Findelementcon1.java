package seleniumsessions;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementcon1 {

	public static void main(String[] args) {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("http://www.ebay.com");
		
		//1: get the total count of links on the page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//2 get the text of each link on the page
		
		for(int k = 0 ; k < links.size();k++ ) {
		String linklist = links.get(k).getText();
		System.out.println(linklist);
		}
		
		
		
		
	}
}
