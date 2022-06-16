package ClassicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToHandleAlerts2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement e=driver.findElement(By.xpath("//input[@type='text']"));
		e.sendKeys("12345");
		WebElement e1=driver.findElement(By.xpath("//input[@type='submit']"));
		e1.click();
						
				
		Alert a=driver.switchTo().alert();
				a.accept();
		
				
				//Alert a2=driver.switchTo().alert();
						//a2.accept();
				a.accept();
					

	}

}
