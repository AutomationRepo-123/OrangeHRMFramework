package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductModulePage {
	@FindBy(name = "productId")
	private WebElement PI;

	public WebElement getPI() {
		return PI;
	}
	
	

}
