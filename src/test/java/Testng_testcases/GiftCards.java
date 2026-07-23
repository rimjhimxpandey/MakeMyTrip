package Testng_testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import makeMyTrip_pages_pom.Gift_card;
import utilities.*;
public class GiftCards extends baseClass {
  @Test(priority=1)
  public void selectGifts() {
	  
	  Gift_card g=new Gift_card();
	  g.hover();
	 
  }
  @Test(priority=2,dependsOnMethods= {"selectGifts"})
  public void cardSelect()
  {   
	  Gift_card g=new Gift_card();
	  g.cardSelect();
  }
  
  @Test(priority=3,dependsOnMethods= {"selectGifts","cardSelect"})
  public void filldetail() throws IOException, InterruptedException
  {
	  Gift_card g=new Gift_card();
//	  Property_reader read=new Property_reader();
//	  String[] arr= {"Uname","Uphone","Uemail"};
//	  String[] arrs=read.property_read(arr);
	  excel_Data d= new excel_Data();
	  String arrs[]=d.read_excel();
	  g.enterValues(arrs);
	  
  }
  
}
