package stepDefinitions;
import makeMyTrip_pages_pom.*;
import utilities.*;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hotel_Adult {
	@Given("Navigate to hotel booking")
	public void navigate_to_hotel_booking() throws InterruptedException {
		  Hotel_book h= new Hotel_book();
		  h.hotel_search();
	}

	@When("fetch adult list")
	public void fetch_adult_list() throws IOException {
		 Hotel_book h= new Hotel_book();
		  h.Adult_list();
	}

	@Then("Adult list is displayed")
	public void adult_list_is_displayed() {
		System.out.println("The list is fetched and displayed");
 
	}





}
