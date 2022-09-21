package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locatorcancept1 {

	public static void main(String[] args) {

		System.getProperty("WebDriver, Chrome.Driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&prevRID=XB5BYYQETDNDPYVNNV0V&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mobileBrowserWeblabTreatment=C");
         //1xpath
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("sharif");
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("yahya");
		
		//driver.findElement(By.()
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("ey20001111");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
	}

}
