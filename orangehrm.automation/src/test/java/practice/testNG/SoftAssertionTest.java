package practice.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	@Test
	public void demo() {

		Reporter.log("step1", true);
		Reporter.log("step2", true);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("hello", "hi");
		Reporter.log("step3", true);
		Reporter.log("step4", true);
		sa.assertAll();

	}

}
