package com.Program1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1Test {
 
	@Test(groups = "smoke")
	public void demo1Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Sucessfully launched demowebshop", true);
		driver.close();
	}

	@Test(groups = "regression")
	public void demo2Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Reporter.log("Sucessfully launched flipkart", true);
		driver.close();
	}

	@Test(groups = "regression")
	public void demo3Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Reporter.log("Sucessfully launched facebook ", true);
		driver.close();
	}
}
