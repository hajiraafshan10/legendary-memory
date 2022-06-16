package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hajiraafshan10@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("8277582599");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		

	}

}


