package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductModulePage {
	@FindBy(name = "productName")
	private WebElement PN;
	@FindBy(name = "productPrice")
	private WebElement PP;

	public WebElement getPN() {
		return PN;
	}

	public WebElement getPP() {
		return PP;
	}

}
