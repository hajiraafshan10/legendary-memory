package Advance_Selenium;

import org.testng.annotations.Test;

public class ChromeTc extends ChromeOpen {
	@Test
	public void Tc(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
	}

}
