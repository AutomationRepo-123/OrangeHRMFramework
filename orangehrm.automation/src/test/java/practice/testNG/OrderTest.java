package practice.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderTest {
	@Test(invocationCount = 10)
	public void CreateOrder() {
		Reporter.log("createOrder123", true);
	}
	
}
