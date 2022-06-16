package ClassicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOrderThFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		 WebElement e1=driver.findElement(By.xpath("//input[@name='q']"));
		 e1.sendKeys("mobiles");
   //driver.findElement(By.xpath("//button[@type='c']"));
    Actions act=new Actions(driver);
	act.sendKeys(e1,Keys.ENTER).perform();
    driver.findElement(By.xpath("//div[text()='Infinix HOT 12 Play (Horizon Blue, 64 GB)']")).click();
    WebElement price=driver.findElement(By.xpath("//div[text()='₹8,999']"));
    String s1=price.getText();
    System.out.println(s1);
     driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click(); 
     driver.findElement(By.xpath("//button[text()='+']")).click();
     WebElement price2=driver.findElement(By.xpath("//a[text()='Infinix HOT 12 Play (Daylight Green, 64 GB)']/../..//span[2][text()='17,998']"));
    String s2=price2.getText();
    System.out.println(s2);

   

	}

}
