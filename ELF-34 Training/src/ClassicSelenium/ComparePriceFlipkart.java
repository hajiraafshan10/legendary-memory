package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparePriceFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("redmi note 10 pro dark night");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement e=driver.findElement(By.xpath("//div[text()='₹15,999']"));
		String s1=e.getText();
		System.out.println(s1);
		driver.get("https://www.amazon.com/");
		
		

	}

}
