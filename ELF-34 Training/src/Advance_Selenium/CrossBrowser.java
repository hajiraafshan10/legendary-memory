package Advance_Selenium;

import org.testng.annotations.Test;

public class CrossBrowser extends BaseTest {
	@Test
	public void TC() {
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

	}

}
