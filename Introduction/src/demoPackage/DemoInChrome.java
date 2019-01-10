package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoInChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Code
				//invoke .exe file first
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Browsers\\chromedriver.exe");
				
				//Create Driver Object for Firefox browser
				WebDriver driver=new ChromeDriver();
				
				//Write test
			//	String URL = "https://www.google.ca/?gws_rd=ssl";
			//	driver.get(URL);
			//	System.out.println(driver.getTitle());
			//	if(driver.getCurrentUrl()==URL)
			//		System.out.println("Pass");
			//	else
			//		System.out.println("Fail");
				
			//Navigate back
			//	driver.navigate().to("http://www.yahoo.com");
			//	driver.navigate().back();
			//	driver.close();
			
			/*driver.get("https://www.ultimatix.net");
			driver.findElement(By.id("USER")).sendKeys("This is my first code");
			driver.findElement(By.name("PASSWORD")).sendKeys("1234");
			driver.findElement(By.linkText("Forgot Username/Password?")).click();*/
			
			//	driver.get("https://www.facebook.com/");
			//	driver.findElement(By.className("inputtext")).sendKeys("hello");
			//	driver.findElement(By.className("inputtext")).sendKeys("123456");
			driver.get("https://www.citigroup.com/canada/en/");
			driver.
			driver.close();
			
			
	}

}
