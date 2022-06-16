package ClassicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithSynchronisatn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,30);
		
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.
		
driver.findElement(By.cssSelector("input[class='username']")).sendKeys("abcd");
driver.findElement(By.cssSelector("input[class='password']")).sendKeys("123456");
driver.findElement(By.cssSelector("input[class='checkbox']")).click();
driver.findElement(By.cssSelector("input[value='submit']")).click();
driver.close();

	}

}
