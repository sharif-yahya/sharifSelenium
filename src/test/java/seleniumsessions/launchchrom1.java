package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class launchchrom1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.nike.com");
		
	   String title= driver.getTitle();
	   System.out.println(title);
		
         if(title.equals("nike")) {
        	 System.out.println(" correct title");
         }
         else {
			System.out.println("in-correct title");
		}
         
         System.out.println(driver.getCurrentUrl());
         
	}

	
}
