package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoInFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Browsers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		//Create Driver Object for chrome browser
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
		
	}

}
