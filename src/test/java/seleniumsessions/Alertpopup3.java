package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup3 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("WebDriver,ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(5000);

		Alert sharif = driver.switchTo().alert();

		System.out.println(sharif.getText());

		String ali = sharif.getText();

		if (ali.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		} else {
			System.out.println("in correct text");
		}

		sharif.accept();

	}

}
