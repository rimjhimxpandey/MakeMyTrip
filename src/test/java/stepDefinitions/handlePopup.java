package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import makeMyTrip_pages_pom.*;
import utilities.baseClass;

public class handlePopup extends baseClass {


		// TODO Auto-generated constructor stub
		
		@Given("Make my trip website is being launched and popup appears")
		public void make_my_trip_website_is_being_launched_and_popup_appears() {
			System.out.println(driver.getTitle());
			System.out.println("Launching the webpage and checking for popups");
		  
		}

		@When("Try to close the popup")
		public void try_to_close_the_popup() throws InterruptedException {
		    handle_Popup p=new handle_Popup();
		    p.popup();
		}

		@Then("popup is closed successfully")
		public void popup_is_closed_successfully() {
		    System.out.println("If popup appears it has been closed");
		}
		
		
		


	}



		