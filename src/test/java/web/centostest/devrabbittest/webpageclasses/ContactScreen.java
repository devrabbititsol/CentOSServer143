package web.centostest.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ContactScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.143:8080/UploadReportFile\",\"project_name\":\"CentOSTest\",\"project_description\":\"s\",\"project_id\":299,\"module_name\":\"DevrabbitTest\",\"module_description\":\"ds\",\"sub_module_id\":0,\"module_id\":447,\"testcase_name\":\"TC_Demo\",\"testcase_id\":479,\"testset_id\":0,\"executed_timestamp\":-1075408966,\"browser_type\":\"chrome\"}";

	public static String projectName = "centostest";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_320365A;
	public void clkAContact_320365() {
		waitForExpectedElement(driver, Contact_320365A);		
		String text = Contact_320365A.getText();
		Contact_320365A.click();
	}

	@FindBy(how = How.XPATH, using = "//A[@id='tpth']")	
	private WebElement	Tirupati_320307A;
	public void clkATirupati_320307() {
		waitForExpectedElement(driver, Tirupati_320307A);		
		String text = Tirupati_320307A.getText();
		Tirupati_320307A.click();
	}

}