package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SighningInToFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[area-label='First name']")).sendKeys("afshan");
		driver.findElement(By.cssSelector("input[area-label='Sur name']")).sendKeys("Ab");
		driver.findElement(By.cssSelector("input[placeholder aria-label='Mobile number or email address']]")).sendKeys("Abc@gmail.com");
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		

	}
	

}
