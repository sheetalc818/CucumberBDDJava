package TestRunners;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
	
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/resources/Feature", 
		glue = {"GlueCode"},
		//plugin = {"usage"},
		tags = { "@End2End","@SmokeTest"},//AND
		//tags = {"@SmokeTest, @End2End"},//OR
		//tags = {"@SmokeTest","~@End2End"},//AND opration with negation 
		plugin = {"pretty",
				  "html:target/site/cucumber-pretty", 
				  "json:target/cucumber.json"},
		monochrome = true
)					
public class Runner extends AbstractTestNGCucumberTests		
{		

}