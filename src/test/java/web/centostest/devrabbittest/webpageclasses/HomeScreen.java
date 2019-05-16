package web.centostest.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.143:8080/UploadReportFile\",\"project_name\":\"CentOSTest\",\"project_description\":\"s\",\"project_id\":299,\"module_name\":\"DevrabbitTest\",\"module_description\":\"ds\",\"sub_module_id\":0,\"module_id\":447,\"testcase_name\":\"TC_Demo\",\"testcase_id\":479,\"testset_id\":0,\"executed_timestamp\":-1078412823,\"browser_type\":\"chrome\"}";

	public static String projectName = "centostest";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_319934A;
	public void clkAContact_319934() {
		waitForExpectedElement(driver, Contact_319934A);		
		String text = Contact_319934A.getText();
		Contact_319934A.click();
	}

}