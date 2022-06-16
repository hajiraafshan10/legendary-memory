package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User%20Happy/Downloads/LocatorsPractice%20(1).html");
		
driver.findElement(By.cssSelector("input[class='username']")).sendKeys("abcd");
driver.findElement(By.cssSelector("input[class='password']")).sendKeys("123456");
driver.findElement(By.cssSelector("input[class='checkbox']")).click();
driver.findElement(By.cssSelector("input[value='submit']")).click();
driver.close();
	
	
	}
	
	

}
