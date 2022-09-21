package seleniumsessions;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup2 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chrome.driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(6000);

		Alert al = driver.switchTo().alert();

		System.out.println(al.getText());

		String test = al.getText();

		if (test.equals("Please enter a valid user name")) {
			System.out.println("correct alert text ");
		} else {
			System.out.println("in correct alert text");
		}

		al.accept();
	}

}
