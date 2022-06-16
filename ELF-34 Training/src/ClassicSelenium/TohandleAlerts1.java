package ClassicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TohandleAlerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement e=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				Actions a1=new Actions(driver);
				a1.doubleClick(e).build().perform();		
				
		Alert a=driver.switchTo().alert();
				a.accept();
				driver.close();


	}

}
