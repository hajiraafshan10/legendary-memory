package Advance_Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrcaticeConfigerationChronologicalOrder {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforee method");

	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method");
	}


	@BeforeSuite
	public void beforesuite(){
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("After suite");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("after test");
	}
@Test
public void test(){
	System.out.println("tests");
}
}
	
