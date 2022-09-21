package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.amazon.com");

		List<WebElement> linknum = driver.findElements(By.tagName("a"));
		System.out.println(linknum.size());

		for(int y = 0 ; y < linknum.size(); y++) {
		String num =linknum.get(y).getText();
		System.out.println(num);
		}

	}

}
