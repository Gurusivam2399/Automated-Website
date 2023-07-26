package extentreport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportFramework {

	ExtentReports extent;
	ExtentTest test;
	protected String desc =""; 
	protected String author ="";
	protected String category =""; 

	@BeforeSuite
	protected void  startReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html"); 
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}
	@AfterTest
	protected void Endreport() {
		extent.flush();
	}

	@BeforeClass
	protected void  createtest() {
		test = extent.createTest(desc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	protected void stepreport(String status, String description) {
		switch (status.toLowerCase()) {
		case "pass":
			test.pass(description);
			break;
		case "fail":
			test.fail(description);
			break;
		case "info":
			test.info(description);
			break;
		case "waring":
			test.warning(description);
			break;
		default:
			System.err.println("Status is not defined");
			break;
		}
	}

}


