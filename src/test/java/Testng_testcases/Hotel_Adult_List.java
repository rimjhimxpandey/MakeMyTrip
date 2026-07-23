package Testng_testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import makeMyTrip_pages_pom.Hotel_book;
import utilities.baseClass;

public class Hotel_Adult_List  extends baseClass{
  @Test(priority=0)
  public void clickHotels() throws InterruptedException {
	  Hotel_book h= new Hotel_book();
	  h.hotel_search();

  }
  
  @Test(priority=1)

public void ListAdult() throws IOException
	  {   Hotel_book h= new Hotel_book();
		  h.Adult_list();
	  }
  }

