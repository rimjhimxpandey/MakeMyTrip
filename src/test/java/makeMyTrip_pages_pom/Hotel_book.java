package makeMyTrip_pages_pom;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;
import utilities.excel_Data;

public class Hotel_book extends baseClass {
	

   
	@FindBy(xpath="//div[@class='chHeaderContainer']")
	WebElement mainheader;
	
	@FindBy(xpath="//a[@class='headerIcons makeFlex hrtlCenter column' and contains(.,'Hotels')]")
	WebElement hotel;
	
	@FindBy(xpath="//input[@id='guest']")
	WebElement guest;
	
	@FindBy(xpath="//span[@class='gstSlct__text' and @data-testid = 'adult_count']")
	WebElement Adult;
	
	@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")
	List<WebElement> AdultList;
	
	
	public Hotel_book() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	
	public void hotel_search() throws InterruptedException
	{   Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();", mainheader);
    	Thread.sleep(2000);
    	 log.info("Hotels tab navigation started");
    	hotel.click();
    	guest.click();
    	Adult.click();
	}
	
	public void Adult_list() throws IOException
	{   int i=3;
		System.out.println("The list of number of adults allowed:");
    	for(WebElement w :AdultList) {
    		
	            excel_Data d= new excel_Data();
	            d.setCellData(i, 0, w.getText());
    		System.out.println(w.getText());
    		i++;
    		}
    	 log.info("Data from Adult dropdown is fetched");
	}
	

}
