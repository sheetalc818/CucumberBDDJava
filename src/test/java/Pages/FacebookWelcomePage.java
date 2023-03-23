package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GlueCode.Hook;

public class FacebookWelcomePage 
{
	private WebDriver driver = Hook.getDriver();
	public static final int TIME_OUT = 12;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//a[contains(., 'News Feed')]")
	private WebElement newsFeed;

	public FacebookWelcomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIME_OUT), this);
	}
	
	public FacebookWelcomePage validateFacebookWelcomePage() 
	{
		wait.until(ExpectedConditions.visibilityOf(newsFeed));
		return this;
	}
}
