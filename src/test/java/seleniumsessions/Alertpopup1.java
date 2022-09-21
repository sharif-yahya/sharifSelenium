package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chrome.driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.accept();
		
	}

}
