package GlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 
{
	public WebDriver driver = Hook.getDriver();
	
	@Given("^Launch Browser and Launch application$")
	public void setup() throws InterruptedException {
		driver.get("http://demo.guru99.com/v4");
		System.out.println("Launched Browser");
		Thread.sleep(500);
	}
	
	@When("^Insert Username and Password$")
	public void insertCredentials() throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys("username12");
		driver.findElement(By.name("password")).sendKeys("password12");
		Thread.sleep(500);
	}
	
	@Then("^Click on Login button$")
	public void checkLoginBtn() {
		driver.findElement(By.name("btnLogin")).click();
	}
}
