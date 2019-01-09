package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Code
				//invoke .exe file first
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Browsers\\chromedriver.exe");
				
				//Create Driver Object for Firefox browser
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com/");
				driver.findElement(By.id("username")).sendKeys("hello");
				driver.findElement(By.name("pw")).sendKeys("123456");
				//driver.findElement(By.className("button r4 wide primary"));
				driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
				System.out.println(driver.findElement(By.cssSelector("#error")).getText());
				driver.close();
			
			
	}

}
