package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set the webdriver instance
		System.setProperty("webdriver.chrome.driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		
		// define chromedriver
		WebDriver driver = new ChromeDriver();
		
		// makes the window large
		driver.manage().window().maximize();
		
		//deletes all the session cookies
		driver.manage().deleteAllCookies();
		
		//
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://www.hm.com");
		
		

	}

}
