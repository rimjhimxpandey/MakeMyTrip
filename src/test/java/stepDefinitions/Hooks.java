package stepDefinitions;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks  extends baseClass
{

	Properties p;
	
	@BeforeAll
	public static void before_all() throws IOException
	{   initilizeBrowser();
	intializeLogger();
		
	}
	
	@AfterAll
	public static void after_all()
	{
		driver.quit();
	}
	
	  @AfterStep
	    public void addScreenshot(Scenario scenario)
	  		{
	        
	        	TakesScreenshot ts=(TakesScreenshot) driver;
	        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	        	scenario.attach(screenshot, "image/png",scenario.getName());
	                    
	        }
	
}
