package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver,chromedriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");

		Thread.sleep(2000);

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> it = handle.iterator();

		String parentId = (it.next());
		System.out.println("parenWidowId" + parentId);

		String childId = (it.next());
		System.out.println("childWindowId" + childId);

		driver.switchTo().window(childId);

		Thread.sleep(2000);

		System.out.println("childId pop up title" + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentId);

		Thread.sleep(2000);

		System.out.println("parentId title" + driver.getTitle());

	}

}
