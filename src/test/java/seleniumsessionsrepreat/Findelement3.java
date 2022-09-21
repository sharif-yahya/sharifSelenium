package seleniumsessionsrepreat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.Implementation;

public class Findelement3 {

	public static void main(String[] args) {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.macys.com");

		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		System.out.println(list1.size());

		for (int d = 0; d < list1.size(); d++) {

			String text2 = list1.get(d).getText();

			System.out.println(text2);

		}

	}

}
