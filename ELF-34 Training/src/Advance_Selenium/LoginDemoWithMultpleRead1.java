package Advance_Selenium;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemoWithMultpleRead1 {
	@Test(dataProvider="TestData")
	public void demowebshop(String Email,String password){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		if (driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("pass:user is logged in");
			
		}else {
			System.out.println("Fail:user is not logged out");
			driver.close();
		}
	
	}
	@DataProvider(name="TestData",parallel=true)
	public Object[][] dataP() throws EncryptedDocumentException, IOException{
		return LoginDemowebClssGneric.readValues("Login");
	}

}
