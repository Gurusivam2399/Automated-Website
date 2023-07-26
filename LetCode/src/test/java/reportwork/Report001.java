package reportwork;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import extentreport.ReportFramework;

public class Report001 extends ReportFramework {
	
	
	@BeforeTest
	void setdata() {
		desc ="frirst program";
		author="Guru";
		category = "smoke";
 	}
	
	@Test
	void mytest() {
		System.out.println("test begins");
		stepreport("pass","enterkey functionality");
		System.out.println("test end");
	}

}
