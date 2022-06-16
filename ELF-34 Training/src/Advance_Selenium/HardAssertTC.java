package Advance_Selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HardAssertTC extends BaseTest {
	@Test
	public void TC() {
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement RegLink=driver.findElement(By.xpath("//a[text()='Register']"));
		//assertEquals(RegLink.getText(),"Register","PASS");
		//assertNotEquals(RegLink.getText(),"login","PASS");
		//assertTrue(RegLink.getText().equals("Register"),"PASS");
		assertFalse(RegLink.getText().equals("abc"));
		
	
		
		
	}
}
