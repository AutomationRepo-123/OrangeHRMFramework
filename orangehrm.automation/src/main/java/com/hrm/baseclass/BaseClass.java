package com.hrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.automation.utility.ExcelUtility;
import orangehrm.automation.utility.PropertiesFileUtility;
import orangehrm.automation.utility.WebDriverUtility;
import pomClasses.DashboardPage;
import pomClasses.LoginPage;

public class BaseClass {
	public PropertiesFileUtility plib = new PropertiesFileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public WebDriver driver = null;
	public static WebDriver sdriver;

	@BeforeSuite()
	public void beforesuite() {
		Reporter.log("database connectivity", true);
	}

//	@Parameters("BROWSER")
	@BeforeClass
	public void beforeClass() throws IOException {
		String BROWSER = plib.togetDataFromPropertiesfile("browser");
		if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		sdriver=driver;
		

	}

	@BeforeMethod
	public void beforemethod() throws IOException {
		String URL = plib.togetDataFromPropertiesfile("url");
		String USERNAME = plib.togetDataFromPropertiesfile("username");
		String PASSWORD = plib.togetDataFromPropertiesfile("password");
		driver.get(URL);
		wlib.maximize(driver);
		wlib.waitforPageToLoad(driver);
		LoginPage lp = new LoginPage(driver);
		lp.getUN().sendKeys(USERNAME);
		lp.getPWD().sendKeys(PASSWORD);
		lp.getlogin().click();

	}

	@AfterMethod
	public void aftermethod() {
		DashboardPage dbp = new DashboardPage(driver);
		dbp.getProfile().click();
		dbp.getLogout().click();
	}

	@AfterClass
	public void AfterClass() {
		driver.quit();
	}

	@AfterSuite
	public void Aftersuite() {
		Reporter.log("closing database connectivity", true);
	}
}
