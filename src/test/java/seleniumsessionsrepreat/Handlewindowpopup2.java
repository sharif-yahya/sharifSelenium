package seleniumsessionsrepreat;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Dialect;

public class Handlewindowpopup2 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
		
		Thread.sleep(3000);
		
		
		Set<String> handle1 = driver.getWindowHandles();
		
	   Iterator<String> it = handle1.iterator();
	   
	   String sharifId = it.next();
	   
	   System.out.println("sharifWindowId "+ sharifId);
	   
	   String aliId = it.next();
	   
	   System.out.println("aliWindowId "+ aliId);
	   
	   Thread.sleep(3000);
	   
	   driver.switchTo().window(aliId);
	   
	   System.out.println("aliId pop up title"+ driver.getTitle());
	   
	   driver.close();
	   
	   Thread.sleep(3000);
	   
	   System.out.println("shaifId pop up title"+ driver.getTitle());
	   
	   
	   
	   
	   
	   

	}

}
