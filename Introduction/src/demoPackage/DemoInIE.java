package demoPackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke .exe file first
		File file=new File("C:\\Drivers\\Browsers\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		//Create Driver Object for IE browser
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
	}

}
