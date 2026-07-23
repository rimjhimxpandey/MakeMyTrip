package Testng_testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import makeMyTrip_pages_pom.Cab_Suv_Search_Page;
import utilities.baseClass;

public class suvPrices extends baseClass {
  @Test(priority=1)
  public void selectSuv() {
	  Cab_Suv_Search_Page c= new Cab_Suv_Search_Page();
	  c.select_SUV();
	  
  }
  @Test(priority=2,dependsOnMethods= {"selectSuv"})
  public void SuvPricesLow() throws IOException, InterruptedException {
	  Cab_Suv_Search_Page c= new Cab_Suv_Search_Page();
	  c.getLowPriceCar();
	
  }
  
  
  
}
