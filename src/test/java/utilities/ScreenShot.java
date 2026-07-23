package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import Testng_testcases.baseTest;

public class ScreenShot extends baseClass{

	 
	 public String ss(String name) throws IOException {
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss").format(new Date());
		
			File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir")+"\\ScreenShots\\"+name+" " +timeStamp+".png";
			File targetLocation = new File(path);
			FileUtils.copyFile(file, targetLocation);
			return path;
		}
}
