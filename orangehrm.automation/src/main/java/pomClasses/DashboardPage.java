package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "PIM")
	private WebElement PIM;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement profile;

	@FindBy(linkText = "Logout")
	private WebElement logout;

	public WebElement getPIM() {
		return PIM;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}

}
