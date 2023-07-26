package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		
		//Blank HTMl
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html"); 
		//Create the report and send to the project
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
		
		// Create test 1
		ExtentTest test = extent.createTest("GS001-Sreach product");
		test.assignAuthor("Guru");
		test.assignCategory("bildin");
		
		test.pass("Enter the desired product name");
		test.pass("Check if the product is listed");
		test.pass("Add the product to the cart");
		
		//test2
		ExtentTest test2 = extent.createTest("Gs002-login the web");
		test2.pass("open the page");
		test2.pass("enter the data");
		test2.fail("save the login data "); 
		
		//to attache the image in the report
		//test2.fail("payment fail",MediaEntityBuilder.createScreenCaptureFromPath(""));
		
		// this should be a last comm because its a syntax of finish the report
		extent.flush();
		
		
		
	}

}
