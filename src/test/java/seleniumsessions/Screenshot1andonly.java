package seleniumsessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1andonly {

	public static void main(String[] args) throws IOException {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("/Users/sharifyahya/eclipse-workspace/sharifSelenium/src/test/java/seleniumsessions/google.png"));

	}

}
