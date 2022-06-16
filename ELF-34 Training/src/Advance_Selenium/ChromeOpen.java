package Advance_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeOpen {
	WebDriver driver;

	@Test
	public void sample(){
		
	}
	@BeforeClass
	public void Chromeopen(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
@AfterClass
public void Chromeclose(){
	driver.close();
}
}
