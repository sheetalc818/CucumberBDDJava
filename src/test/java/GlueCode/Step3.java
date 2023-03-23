package GlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step3 
{
	private WebDriver driver = Hook.getDriver();
	
	@Given("^Launch Browser$")
	public void setUp()
	{
		System.out.println("Browser Lauched");			   
	}
	
	@Given("^Launch FB application$")
	public void lanuchApplication() {
		 driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void set(String username,String password) {
		driver.findElement(By.name("email")).sendKeys(username);					
	    driver.findElement(By.name("pass")).sendKeys(password);		
	    driver.findElement(By.name("login")).click();
	}
		
	@Then("^Facebook Home page is successfully displayed$")
	public void validateFacebookWelcomePage() 
	{
		//driver.findElement(By.xpath("//html")).isDisplayed();
	}

}
