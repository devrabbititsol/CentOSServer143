package web.centostest.devrabbittest.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import web.centostest.devrabbittest.webpageclasses.HomeScreen;
import web.centostest.devrabbittest.webpageclasses.ContactScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Demo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public TC_Demo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Demo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_demo.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, HomeScreen.projectName);
		test = reports.startTest("TC_Demo");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = HomeScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void HomeScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
		objHomeScreen.clkAContact_319934();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ContactLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void ContactScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		ContactScreen objContactScreen = PageFactory.initElements(driver, ContactScreen.class);
		testLogHeader(test, "Verify ContactScreen page");
		objContactScreen.clkAContact_320365();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ContactLink");
		objContactScreen.clkATirupati_320307();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : TirupatiLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= ContactScreen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { ContactScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}