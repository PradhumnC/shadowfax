package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition {

	WebDriver driver=new ChromeDriver();
	
	@Given("^User is on the login page$")
	public void User_is_on_the_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Browsers\\chromedriver.exe");
		driver.get("https://accountonline.citi.com/cards/svc/LoginGet.do?siteId=CB&langId=EN");
	}
	
	@When("^User enters incorrect userame and pasword$")
	public void User_enters_incorrect_userame_and_pasword()
	{
		driver.findElement(By.xpath("//*[@id=\"USERNAME-citiTextBlur\"]")).sendKeys("234567");
		driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("password");
	}
	
	@And("^clicks Sign On button$")
	public void clicks_Sign_On_button()
	{
		driver.findElement(By.xpath("//*[@id=\"secureSignOnForm\"]/div[4]/div/div/input")).click();
	}
	
	@Then("^error message is displayed$")
	public void error_is_displayed()
	{
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/h1")).getText());
		//Error message - AccountOnline Temporarily Unavailable
		driver.close();
	}
	
}
