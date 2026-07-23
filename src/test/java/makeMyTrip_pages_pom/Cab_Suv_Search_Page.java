package makeMyTrip_pages_pom;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng_testcases.baseTest;
import utilities.baseClass;
import utilities.excel_Data;

public class Cab_Suv_Search_Page extends baseClass {
	
	@FindBy(xpath="//label[contains(.,'SUV')]")
	WebElement suvcheck;
	
	@FindBy(xpath="//span[@class='latoBlack font20 appendRight5']")
	List<WebElement> carnames;
	
	@FindBy(xpath="//p[@class='font28 latoBlack blackText ']")
	List<WebElement> carprices;

	public Cab_Suv_Search_Page() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	
	public void select_SUV()
	{
		suvcheck.click();
		log.info("Selecting the suv cars");
	}
	
	public void getLowPriceCar() throws IOException, InterruptedException
	{
		
		 System.out.println("Car Names"+"\t"+"Prices");
	        System.out.println("----------"+"\t"+"--------");
	        	 Iterator<WebElement> iterator1 = carnames.iterator();
	             Iterator<WebElement> iterator2 = carprices.iterator();
	            excel_Data d= new excel_Data();
	             while (iterator1.hasNext() && iterator2.hasNext()) {
	                 WebElement element1 = iterator1.next();
	                 WebElement element2 = iterator2.next();

	                 System.out.println(element1.getText() + "\t" + element2.getText());
	                 
	             }
	             System.out.println("------------------------");
	             System.out.println("Lowest Price in the above list");
	             System.out.println("-------------------------------");
	             excel_Data.setCellData(1, 0, carnames.get(0).getText());
	             Thread.sleep(2000);
	             excel_Data dd = new excel_Data();
	            dd.setCellData(1, 1, carprices.get(0).getText());
	             
	             System.out.println(carnames.get(0).getText()+"\t"+carprices.get(0).getText());
	             log.info("Displaying the car details and fetching low price");
	             

	                  
		
	}

}
