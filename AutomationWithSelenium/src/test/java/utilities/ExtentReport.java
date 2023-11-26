package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.BaseClass;

public class ExtentReport implements ITestListener {
	
	
	
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //Populate common info on the report
	public ExtentTest test; //creating test case entries in the report and update status of the test methods
	String repName;
	public void onStart(ITestContext context) {
		
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName="Test-Report-"+ timestamp + ".html";
		sparkReporter=new ExtentSparkReporter("C:\\Users\\Jairo\\git\\AutomationWithSelenium\\AutomationWithSelenium\\reports\\myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report"); //Title report 
		sparkReporter.config().setReportName("Functional Testing"); //name of the report
		sparkReporter.config().setTheme(Theme.STANDARD); 
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Application", "Aution Exersice");
		extent.setSystemInfo("Enviroment", "QA");
		extent.setSystemInfo("Tester Name", "Jairo");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser Name", "Chrome,Firefox,Edge");
		
	}
	public void onTestSuccess(ITestResult result) {
		
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS,"Test case PASSED is:"+result.getName());
		 
	  }
	public void onTestFailure(ITestResult result) {
		
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case FAILED is:"+result.getName());
		test.log(Status.FAIL,"Test case FAILED cause is:"+result.getThrowable().getMessage());
		try {
			String imgPath=new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}catch (Exception e) {
			e.printStackTrace();
		}
	  }
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case SKIPPED");
		test.log(Status.SKIP,result.getThrowable().getMessage());
	  }
	
	public void onFinish(ITestContext context) {
		 extent.flush();
	  }
	
	
}
