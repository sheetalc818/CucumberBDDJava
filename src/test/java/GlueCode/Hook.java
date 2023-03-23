package GlueCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	
	@Before
	public void initialization() {
		System.out.println("Init browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\BDD\\src\\test\\resources\\Driver\\chromedriver.exe");					
	    driver= new ChromeDriver();					
	    driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			// Take screenshot and store as a file format
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try 
			{
			 // now copy the  screenshot to desired location using copyFile //method
			 FileUtils.copyFile(src, new File("Screenshot/screenshot.png"));
			}
			catch (IOException e)
			{
			  System.out.println(e.getMessage());
			}
		}
		
		driver.quit();
		System.out.println("tear down browser");
	}
	
	public static WebDriver getDriver()
	{
			return driver;
	}
}
