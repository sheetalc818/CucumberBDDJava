package GlueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

	private WebDriver driver = Hook.getDriver();			
	
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() 							
    {		
       driver.get("http://demo.guru99.com/v4");
       System.out.println("Application launched");
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() 						
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");	
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }	

}