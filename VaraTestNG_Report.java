package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VaraTestNG_Report {
	
	@Test
	public void a() {
		System.out.println("test1");
		Reporter.log("test1",true);
	}
	@Test
	public void b() {System.out.println("test2");}
	
	@AfterTest
	public void aftertest() {System.out.println("AfterTest");}
	@BeforeSuite
	public void aftersuite() {System.out.println("AfterSuite");}
	//public void generatereport() {System.out.println("Generate Report");}
	@AfterSuite
	
	public void generatereport() {System.out.println("Generate Report");}
	@BeforeClass
	public void beforclass() {System.out.println("BeforeClass");}
	@AfterClass
	public void afterclass() {System.out.println("AfterClass");}
	@BeforeMethod
	public void beforemethod() {System.out.println("BeforeMethod");}
	@AfterMethod
	public void aftermethod() {System.out.println("AfterMethod");}

}
