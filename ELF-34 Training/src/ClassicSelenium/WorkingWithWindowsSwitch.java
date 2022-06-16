package ClassicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowsSwitch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String w1=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		Thread.sleep(2000);

		
		Set<String> w2=driver.getWindowHandles();
		for(String s:w2){
			
			if(!(s.equals(w1))){
			driver.switchTo().window(s);
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			
			driver.findElement(By.xpath("//span[text()='Register']")).click();
			driver.findElement(By.id("user_name")).sendKeys("hajeera");
			driver.findElement(By.id("user_email")).sendKeys("hajeera404@gmail.com");
			driver.findElement(By.id("password")).sendKeys("password89");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.close();
			}
			if(s.equals(w1)){
				driver.switchTo().window(s);
				driver.findElement(By.id("opentab"
						+ ""
						+ "")).click();
				
			}
}
		driver.quit();
		
	}
	}
