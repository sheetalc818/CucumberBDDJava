package GlueCode;
import org.openqa.selenium.WebDriver;
import Pages.FacebookLoginPage;
import Pages.FacebookWelcomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step4
{
	  private WebDriver driver = Hook.getDriver();
	  private FacebookLoginPage facebookloginpage = new FacebookLoginPage(driver);
	  private FacebookWelcomePage facebookWelcomePage;
	    
		@Given("^Launch Browsers$")
		public void setUp()
		{
			System.out.println("browser launched");			   
		}
		
		@Given("^Launch FB applications$")
		public void lanuchApplication() {
			facebookloginpage.launchFb();
		}			
		
		@When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
	    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
	    {	
//			driver.findElement(By.name("email")).sendKeys(username);					
//		    driver.findElement(By.name("pass")).sendKeys(password);		
//		    driver.findElement(By.name("login")).click();
			facebookWelcomePage = facebookloginpage.successfulLogin(username, password);
	    }	
}
