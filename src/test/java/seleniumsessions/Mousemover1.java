package seleniumsessions;


import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Mousemover1 {

	public static void main(String[] args) {

		System.getProperty("WebDriver, ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
;		
        Actions action = new Actions(driver);
        
      action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();

			
		driver.findElement(By.linkText("Headphones")).click();
		
		driver.findElement(By.cssSelector("body.no-touch.skin-large.whitebg.flex-lg.brm-visible.gh-flex:nth-child(2) div.pagecontainer.srp-main--isLarge:nth-child(5) div.pagecontainer__center.PR_right_wrap div.container section.b-module.b-carousel.b-deals.b-display--portrait:nth-child(3) div.carousel div.carousel__container div.carousel__viewport.carousel__viewport--mask:nth-child(2) ul.carousel__list li.carousel__snap-point:nth-child(1) a.b-tile div.b-tile__imgwrap div.b-tile__img > img.b-img")).click();
	     
		//driver.findElement(By.xpath("//a[@id='atcRedesignId_btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("soccer");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		
	}

}
