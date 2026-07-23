package stepDefinitions;
import makeMyTrip_pages_pom.*;
import utilities.*;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fetchSuvprice extends baseClass {

	@Given("Cab List page for given search conditions is displayed")
	public void cab_list_page_for_given_search_conditions_is_displayed() {
		System.out.println("The list of cars for hire is displayed");
	    
	}

	@When("Select SUV and display prices")
	public void select_suv_and_display_prices() {
		 Cab_Suv_Search_Page c= new Cab_Suv_Search_Page();
		  c.select_SUV();
	}

	@Then("Lowest price is fetched")
	public void lowest_price_is_fetched() throws IOException, InterruptedException {
		Cab_Suv_Search_Page c= new Cab_Suv_Search_Page();
		 c.getLowPriceCar();
	}




}
