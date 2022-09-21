package seleniumsessionsrepreat;

import java.lang.reflect.WildcardType;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewindowpopup3 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");

		Thread.sleep(2000);

		Set<String> takecare = driver.getWindowHandles();

		Iterator<String> ite = takecare.iterator();

		String parentWId = ite.next();
		System.out.println("parentWindoId " + parentWId);

		String childWId = ite.next();
		System.out.println("childwindowId" + childWId);

		Thread.sleep(2000);

		driver.switchTo().window(childWId);

		System.out.println("childWId pop up title" + driver.getTitle());

		driver.close();
		
		driver.switchTo().window(parentWId);

		Thread.sleep(2000);

		System.out.println("parentWId pop up title" + driver.getTitle());

	}

}
