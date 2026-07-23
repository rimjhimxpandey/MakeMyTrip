package Testrunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions( 
					features= {".//Features"}, 
					glue="stepDefinitions",
							plugin= {"pretty", "html:reports/myreport.html", 
									  "rerun:target/rerun.txt",
									  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
									},
							dryRun=false,
							monochrome=true,
							publish=true
					
		    )
//public class testrunner{
//
//}
public class testrunner extends AbstractTestNGCucumberTests {

}
