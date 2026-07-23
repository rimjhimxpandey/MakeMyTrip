package Testng_testcases;
import makeMyTrip_pages_pom.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
import utilities.Property_reader;
import utilities.baseClass;
public class CabSelection_test extends baseClass {
	
	
@Test(priority=0)
public void clickCabs() throws InterruptedException, IOException {	
	 Trip_Cab_select s = new Trip_Cab_select();
	  s.clickOnCabIcon();
}
	
	
  @Test(priority=1,dependsOnMethods="clickCabs")
  public void placeSelect() throws InterruptedException, IOException {
	  
	  
	  Trip_Cab_select s = new Trip_Cab_select();
	  
	  String[] datas={"Boarding","Destination"};
	  Property_reader read=new Property_reader();
	  String[] prop=read.property_read(datas);
	  
	  s.fromLocation(prop[0]);
	  s.toLocation(prop[1]);
  }
  
  @Test(priority=2,dependsOnMethods="placeSelect")
  public void dataselect() throws InterruptedException {
	  Trip_Cab_select s = new Trip_Cab_select();
	  s.SelectDate();
	  s.SelectTime();
  }
   
}
