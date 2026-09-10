package practice.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertionTest {
	@Test
	public void demo() {
		Reporter.log("step1", true);
		Reporter.log("step2", true);
		Assert.assertEquals("Hello", "Home");
		Reporter.log("step3", true);
		Reporter.log("step4", true);
	}

}
