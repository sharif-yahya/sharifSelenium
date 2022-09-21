package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload1 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		// opens chrome in full screen mode
		driver.manage().window().maximize();
		
		// waits for the page to load with the given time else it will fail
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// waits for all the elements on the page to load else it will fail
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		

		driver.get("https://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("/Users/sharifyahya/Documents/SDLC.pptx");

	}

}
