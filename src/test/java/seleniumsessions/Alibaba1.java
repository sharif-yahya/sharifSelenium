package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Alibaba1 {

	public static void main(String[] args) {

		System.getProperty("webdriver, ChromeDriver",
				"/Users/sharifyahya/eclipse-workspace/sharifSelenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://passport.alibaba.com/member/us/reg/fast/union_reg.htm?spm=a2700.8293689.scGlobalHomeHeader.348.561167afJkdOMn&_regfrom=ICBU_UNION_REG&_lang=ZH_S&_regbizsource=main_page&tracelog=hd_joinfree");
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ali@me.vv");
        
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ali");
		
		driver.findElement(By.name("input")).sendKeys("hassan");
	}

}
