package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement Rg=driver.findElement(By.className("ico-register"));
		Rg.click();
		WebElement rb=driver.findElement(By.id("gender-female"));
		rb.click();
		WebElement fn=driver.findElement(By.id("FirstName"));
		fn.sendKeys("abcd");
		WebElement ln=driver.findElement(By.id("LastName"));
		ln.sendKeys("xyz");
		WebElement e=driver.findElement(By.id("Email"));
		e.sendKeys("abc@gmail.com");
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("1234");
		WebElement  cpwd=driver.findElement(By.id("ConfirmPassword"));
		cpwd.sendKeys("1234");
		WebElement  bt=driver.findElement(By.id("register-button"));
		bt.click();
	
		
		
		

	}

}
