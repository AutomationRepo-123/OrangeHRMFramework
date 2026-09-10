package practice.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderBilllingTest {
	@Test
	public void CreateOrder() {
	Reporter.log("order is created", true);
	}

	@Test(dependsOnMethods = "CreateOrder")
	public void BillingOrder() {
	Reporter.log("billing is done", true);
	}

}
