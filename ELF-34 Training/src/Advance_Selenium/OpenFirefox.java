package Advance_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class OpenFirefox {
	
		static WebDriver driver;

		
		@BeforeClass
		public void Chromeopen(){
          System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
			
		}
	@AfterClass
	public void Firefoxclose(){
		driver.close();
	}
	}



