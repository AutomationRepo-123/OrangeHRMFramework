package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage1 {

	@FindBy(name="contact")
	private WebElement contact;

	public WebElement getContact() {
		return contact;
	}

	public void setContact(WebElement contact) {
		this.contact = contact;
	}
	
}
