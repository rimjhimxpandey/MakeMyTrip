package Testng_testcases;

import org.testng.annotations.Test;

import makeMyTrip_pages_pom.*;
import utilities.baseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class baseTest extends baseClass {
	
  @Test()
  public void closepopup() throws InterruptedException {
	  handle_Popup hps= new handle_Popup();
	  hps.popup();
  }
  @BeforeTest
  public void beforeSuite() throws IOException {
	  baseClass.initilizeBrowser();
	  intializeLogger();
  }

  @AfterTest
  public void afterSuite() {
	  driver.quit();
  }

}
