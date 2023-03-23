package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import GlueCode.Hook;

public class FacebookLoginPage 
{
	private static WebDriver driver = Hook.getDriver();
	public static final int TIME_OUT = 12;
	
	@FindBy(name = "email")
	private WebElement email;
	

	@FindBy(name = "pass")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@data-testid='royal_login_button']")
	private WebElement loginButton;
	
	//Driver passed as Argument to the Constructor
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIME_OUT), this);
	}
	
	public void launchFb() {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.print("FB Title :"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	//Login using Valid Email and Valid Password
	public FacebookWelcomePage successfulLogin(String email1, String password1) 
	{
		email.sendKeys(email1);
		password.sendKeys(password1);
		return new FacebookWelcomePage(Hook.getDriver());
	}
}