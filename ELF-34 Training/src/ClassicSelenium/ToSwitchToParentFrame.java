package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User%20Happy/Downloads/iframe.html");
	
	driver.switchTo().frame("frame1");
	
	driver.findElement(By.xpath("//a[text()='COVID']")).click();
	driver.findElement(By.xpath("//a[text()='MOVIES']")).click();
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[text()='Google']"));

	}

}
