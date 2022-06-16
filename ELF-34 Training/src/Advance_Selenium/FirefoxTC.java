package Advance_Selenium;

import org.testng.annotations.Test;

public class FirefoxTC  extends OpenFirefox{

	
		@Test
		public void Tc(){
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
	
	}

}
