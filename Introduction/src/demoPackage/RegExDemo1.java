package demoPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RegExDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Browsers\\chromedriver.exe");
		
		//Create Driver Object for Firefox browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name='procee']")).click();
		//System.out.println(driver.getTitle());
	}
	
}
