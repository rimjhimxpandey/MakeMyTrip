package stepDefinitions;
import makeMyTrip_pages_pom.*;
import utilities.*;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookOneWayTrip extends baseClass {

	@Given("makeMytrip webpage loaded")
	public void make_mytrip_webpage_loaded() throws InterruptedException {
	    System.out.println("The make my trip home page is loaded after popup handling");
	    Thread.sleep(5000);
	    Trip_Cab_select f = new Trip_Cab_select();
	    f.clickOnCabIcon();
	    System.out.println("Cab book page is loaded");
	    
	    
	}

	@When("To enter the from To location")
	public void to_enter_the_from_To_location() throws IOException, InterruptedException {
	    
		Trip_Cab_select f = new Trip_Cab_select();
		String[] datas={"Boarding","Destination"};
		  Property_reader read=new Property_reader();
		  String[] prop=read.property_read(datas);
		  
		  f.fromLocation(prop[0]);
		  f.toLocation(prop[1]);
	}


	@When("To enter the From date")
	public void to_enter_the_from_date() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  Trip_Cab_select s = new Trip_Cab_select();
		  s.SelectDate();
		  
	}

	

	@Then("Click on the search")
	public void click_on_the_search() throws InterruptedException {
		Trip_Cab_select s = new Trip_Cab_select();
		s.SelectTime();
	}




}
