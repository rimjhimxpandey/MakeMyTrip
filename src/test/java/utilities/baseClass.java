package utilities;

	import java.io.FileReader;
	import java.io.IOException;
	import java.net.URL;
	import java.time.Duration;
	import java.util.Properties;
	 
	//import org.apache.commons.lang3.RandomStringUtils;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	 
	public class baseClass {
		public static WebDriver driver;
		public static Properties p;
		public static TakesScreenshot takesScreenshot;
		public static Logger log;
		public static  void initilizeBrowser() throws IOException
		{
			if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
			{
				DesiredCapabilities capabilities = new DesiredCapabilities();
				//os
				if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
				    capabilities.setPlatform(Platform.WIN11);
				} else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
				    capabilities.setPlatform(Platform.MAC);
				} else {
				    System.out.println("No matching OS..");
				      }
				//browser
				switch (getProperties().getProperty("browser").toLowerCase()) {
				    case "chrome":
				        capabilities.setBrowserName("chrome");
				        break;
				    case "edge":
				        capabilities.setBrowserName("MicrosoftEdge");
				        break;
				    default:
				        System.out.println("No matching browser");
				     }
		        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
			}
			else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
				{
					switch(getProperties().getProperty("browser").toLowerCase()) 
					
					{
					case "chrome":
				        driver=new ChromeDriver();
				        driver.get("https://www.makemytrip.com/");
				        break;
				    case "edge":
				    	driver=new EdgeDriver();
				    	 driver.get("https://www.makemytrip.com/");
				        break;
				    default:
				        System.out.println("No matching browser");
				        driver=null;
					}
				}
			  takesScreenshot = (TakesScreenshot)driver;
			  driver.manage().window().maximize();
			 driver.manage().deleteAllCookies(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			 //driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(20));

		}
		public static WebDriver getDriver() {
				return driver;
		}
		
	 
		public static Properties getProperties() throws IOException
		{		 
	        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration.properties");
	        p=new Properties();
			p.load(file);
			return p;
		}
		public static void intializeLogger() 
		{		 
			log = LogManager.getLogger();
			
		}
	}

	 


