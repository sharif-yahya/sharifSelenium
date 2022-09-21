package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfiratselenium1 {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.versace.com");
		driver.get("https://www.versace.com/us/en-us/men/clothing/t-shirts-polos/la-greca-polo-shirt-5g320/1006934-1A04920_5G320.html?cgid=220400#start=1");
		
		
		
		
		
	}

}
