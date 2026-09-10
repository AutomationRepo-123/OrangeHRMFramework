package practice.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
   @Test
	public void createProfile() {
		//System.out.println("profile is created");
	   Reporter.log("profile is created",true);
	}
   @Test
   public void editProfile() {
		System.out.println("profile is edit");
	}
   @Test
   public void addProfile() {
		System.out.println("profile is added");
	}
}
