package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Code
				//invoke .exe file first
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Browsers\\chromedriver.exe");
				
				//Create Driver Object for Firefox browser
				WebDriver driver=new ChromeDriver();
		
				driver.get("https://www.facebook.com/");
				driver.findElement(By.cssSelector("#email")).sendKeys("hello");
				driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123456");
				driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
			
			
			//driver.close();
			
			
	}

}
