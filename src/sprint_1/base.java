package sprint_1;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class base {
	
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

	@BeforeSuite
	 public void startReport(){	     
	           htmlReporter = new ExtentHtmlReporter("G:\\JAVA videos\\TestingReports\\report_1.html");
	           extent = new ExtentReports();
	           extent.attachReporter(htmlReporter);
	    }
	
	@Parameters({"Browser","url"}) //calling parameter from testng.xml & should have same parameter name as in testng.xml 
	@BeforeMethod
	public void LaunchBrowser(@Optional("chrome") String browser,@Optional("www.google.com")String Url) {
		
		if(browser.equals("chrome")) {
			System.out.println("Chrome browser launched");
		}
		else if(browser.equals("ie")) {
			System.out.println("IE browser launched");
		}
	}

	
	
	 @AfterMethod
	    public void getResult(ITestResult result){

	     if(result.getStatus() == ITestResult.SUCCESS) {

	      logger.log(Status.PASS, "Test Case Passed " + result.getName());
	     }
	    if(result.getStatus() == ITestResult.FAILURE){

	      logger.log(Status.FAIL, "Test Case Failed is	"+result.getName() + result.getThrowable());
	     }
	    else if(result.getStatus() == ITestResult.SKIP){

	      logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
	     }
	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		System.out.println("CloseBrowser");
	}
	
	
	@AfterSuite
    public void endReport(){

                   extent.flush();
                   //extent.close();
      }

	@DataProvider
	public Object[][] getdata(){
		
		Object[][] arr = new Object[3][2]; //Row,column
		
		arr[0][0] ="un1";
		arr[0][1] ="pwd1";
		
		arr[1][0] ="un2";
		arr[1][1] ="pwd2";
		
		arr[2][0] ="un3";
		arr[2][1] ="pwd3";
		
		return arr;
	}
	
}
