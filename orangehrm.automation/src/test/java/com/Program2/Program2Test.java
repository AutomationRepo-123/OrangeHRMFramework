package com.Program2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program2Test {
	
	@Test(groups = "smoke")
	public void demo4Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		Reporter.log("Sucessfully launched instagram",true);
		driver.close();
	}

	@Test(groups = "regression")
	public void demo5Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Reporter.log("Sucessfully launched demoapps",true);
		driver.close();
	}
	
	@Test(groups = "regression")
	public void demo6Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		Reporter.log("Sucessfully launched youtube ",true);
		driver.close();
	}
}
