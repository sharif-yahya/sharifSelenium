package seleniumsessionsrepreat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.Implementation;

public class Findelement4 {

	public static void main(String[] args) {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.macys.com");

		List<WebElement> linksmacys = driver.findElements(By.tagName("a"));
		System.out.println(linksmacys.size());

		for (int m = 0; m < linksmacys.size(); m++) {
			String textmacys = linksmacys.get(m).getText();
			System.out.println(textmacys);
		}

	}

}
