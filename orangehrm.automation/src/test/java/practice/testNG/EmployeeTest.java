package practice.testNG;

import org.jspecify.annotations.Nullable;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hrm.baseclass.BaseClass;

import junit.framework.Assert;

@Listeners(listener.ListenerImplementation.class)
public class EmployeeTest  extends BaseClass{

	@Test
	public void AddEmployeeTest() {
		System.out.println("helllooooooooooo");
		@Nullable
		String title = driver.getTitle();
		Assert.assertEquals(title, "login");
	}
}
