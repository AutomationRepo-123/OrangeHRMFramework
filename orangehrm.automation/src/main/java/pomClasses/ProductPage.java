package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	@FindBy(xpath = "//button[contains(.,'Add')]")
	private WebElement button;

	@FindBy(name = "productName")
	private WebElement ProductName;

	public WebElement getButton() {
		return button;
	}

	public WebElement getProductName() {

		return ProductName;
	}

}
