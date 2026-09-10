package orangehrm.automation;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.hrm.baseclass.BaseClass;

import orangehrm.automation.utility.ExcelUtility;
import orangehrm.automation.utility.PropertiesFileUtility;
import orangehrm.automation.utility.WebDriverUtility;
import pomClasses.AddEmployeePage;
import pomClasses.DashboardPage;
import pomClasses.LoginPage;
import pomClasses.PIMPage;

public class EmployeeTest extends BaseClass{
	@Test
	public void AddEmployeeTest() throws IOException {

		String FIRSTNAME = elib.toReadDataFromExcelFile("Sheet1", 1, 1);
		String LASTNAME = elib.toReadDataFromExcelFile("Sheet1", 1, 2);
		String EMPID = elib.toReadDataFromExcelFile("Sheet1", 1, 3);

		// maximize the browser
		wlib.maximize(driver);
		// implicit wait for 15 seconds
		wlib.waitforPageToLoad(driver);

		// Click on PIM link
		DashboardPage dbp = new DashboardPage(driver);
		dbp.getPIM().click();

		// Click on Add button
		PIMPage pp = new PIMPage(driver);
		pp.getaddbtn().click();

		// Enter first name, last name and employee ID
		AddEmployeePage aep = new AddEmployeePage(driver);
		aep.getfirstName().sendKeys(FIRSTNAME);
		aep.getlastName().sendKeys(LASTNAME);
		aep.getempid().sendKeys(EMPID);

		// Click on Save button
		WebElement SaveButton = aep.getsavebtn();

		// explicit wait for 15 seconds
		wlib.waitForElementToBeClickable(driver, SaveButton);
		SaveButton.click();

		// Capture the success message
		String actualmsg = aep.getsuccessMsg().getText();
		String expectmsg = "Successfully Saved";
		Assert.assertEquals(actualmsg, expectmsg);
	}

}
