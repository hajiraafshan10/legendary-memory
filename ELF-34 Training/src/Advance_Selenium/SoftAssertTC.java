package Advance_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTC extends BaseTest{
	@Test
	public void TC(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement RegLink=driver.findElement(By.xpath("//a[text()='Register']"));
		
		//for soft assert need to create object of SoftAssert class
		SoftAssert ast=new SoftAssert();
		//ast.assertEquals(RegLink.getText(), "Register","PASS");
		//ast.assertNotEquals(RegLink.getText(),"Login","PASS");
		//ast.assertTrue(RegLink.isDisplayed(),"pass");
	ast.assertFalse(RegLink.getText().equals("login"),"pass");
		
		RegLink.click();
		ast.assertAll();
		
	}

}
