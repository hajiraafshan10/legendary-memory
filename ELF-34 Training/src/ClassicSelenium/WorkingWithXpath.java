package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("hajiraafshan10@gmail.com");
	driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("8277582599");
	driver.findElement(By.xpath("//input[@value='true']")).click();
	try
	{
	if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed());
	{
		System.out.println("pass");
		
	}
	}
	catch(NoSuchElementException  e)
	{
		System.out.println("fail");
	}
	}
}
