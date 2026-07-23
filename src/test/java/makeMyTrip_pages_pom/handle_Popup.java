package makeMyTrip_pages_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;

public class handle_Popup extends baseClass {
	
	@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']\"")
	WebElement close;
	
	@FindBy(xpath="//*[@id='webklipper-publisher-widget-container-notification-frame']")
	WebElement fram;
	
	@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")
	WebElement handle;
	
	public handle_Popup(){
		PageFactory.initElements(driver, this);
	}
	
	public void popup() throws InterruptedException {

		try {
		driver.switchTo().frame(fram);
	    close.click();
	    driver.switchTo().defaultContent();
	    log.info("Popup is handled");
	}
		catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
		
			Thread.sleep(5000);
			handle.click();
		
		
		
	}

}
