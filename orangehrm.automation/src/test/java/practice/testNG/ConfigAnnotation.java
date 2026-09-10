package practice.testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigAnnotation {
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("execute beforesuite ",true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("execute beforeClass ",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("execute beforemethod ",true);
	}
	@Test
	public void createContact() {
		Reporter.log("execute createContact",true);
		
	}
	@Test
	public void createContactWithNumber() {
		Reporter.log("execute createContactWithNumber",true);
		
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("execute aftermethod",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("execute AfterClass ",true);
	}
	@AfterSuite
	public void Aftersuite() {
		Reporter.log("execute Aftersuite ",true);
	}
	
}