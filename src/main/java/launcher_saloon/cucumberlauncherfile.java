package launcher_saloon;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*@RunWith(Cucumber.class)
@CucumberOptions(
             features={"E:/sumita/git/saloon_testng_1/saloon_testng/src/test/resources/features/master/clientmaster.feature"},
             glue="stepdef")

*/
public class cucumberlauncherfile {
			static String  tags_include_exclude = "@sanity";
			static String featurefileList="E:/sumita/git/saloon_testng_1/saloon_testng/src/test/resources/features/master/clientmaster.feature";
			
			/*
			 * public static void main(String[] args) { io.cucumber.core.cli.Main.main(new
			 * String[]{"-g", "stepdef", "-t",tags_include_exclude,
			 * "-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			 * featurefileList}); }
			 */
			
		@Test 
		  public void triggertest() throws FileNotFoundException, IOException {
			
			  System.setProperty("extent.reporter.avent.start", "true");
		        System.setProperty("extent.reporter.avent.config", "E:/sumita/git/saloon_testng_1/saloon_testng/src/test/resources/html-config.xml");
		        System.setProperty("extent.reporter.avent.out", "test-output/AventReport/");
				
				
			 io.cucumber.core.cli.Main.main(new String[]{"-g", "stepdef",
					  "-t",tags_include_exclude,
			//		  "-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					  featurefileList});
		}

}
