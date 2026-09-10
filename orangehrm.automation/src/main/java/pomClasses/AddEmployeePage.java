package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstName")
	private WebElement firstName;
	@FindBy(name = "lastName")
	private WebElement lastName;
	@FindBy(xpath = "//div[.='Employee Id']//input")
	private WebElement empid;
	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement savebtn;
	@FindBy(css = ".oxd-toast-content--success")
	private WebElement successMsg;

	public WebElement getfirstName() {
		return firstName;
	}

	public WebElement getlastName() {
		return lastName;
	}

	public WebElement getempid() {
		return empid;
	}

	public WebElement getsavebtn() {
		return savebtn;
	}

	public WebElement getsuccessMsg() {
		return successMsg;
	}

}
