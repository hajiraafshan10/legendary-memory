package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinOnIFRames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User%20Happy/Downloads/iframe.html");
	Thread.sleep(4000);
	driver.switchTo().frame("frame1");
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("//iframe[@id='FR1']");
		driver.findElement(By.xpath("//a[text()='MOVIES']")).click();

	}

}
