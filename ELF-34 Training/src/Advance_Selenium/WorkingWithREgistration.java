package Advance_Selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class WorkingWithREgistration {

	public void sample (String Fn,String Ln,String Email,String Pwd,String Cpwd) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys(Fn);;
	driver.findElement(By.id("LastName")).sendKeys(Ln);;
	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(Pwd);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(Cpwd);
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	}
	@DataProvider(name="TestData",parallel=true)
	public Object[][] dataP() throws EncryptedDocumentException, IOException{
		return Registration_clss_demo.readValues("Register");
	}

}
