package seleniumsessions;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handleframes1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("WebDriver,ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.acmecorp.com/losangeles/bedroom.html");
		
		driver.findElement(By.xpath("//*[@class='mfp-close']")).click();

		Thread.sleep(5000);
		
		// 1. first you have to mouse over the element to exand it
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='ui-id-5']/span[2]"))).build().perform();
		
		// 2. then inspect the element, get the linktext and click on it
		driver.findElement(By.linkText("Nightstand")).click();
		
		driver.navigate().back();

	}

}
