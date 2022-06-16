package ClassicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnElement_JS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//implicitlyWait:it will check for the element and if it get
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[text()='jdk-8u333-linux-x64.tar.gz']")).click();
		WebElement e1=driver.findElement(By.xpath("//a[text()='Download jdk-8u333-linux-x64.tar.gz']"));
JavascriptExecutor js=	(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",e1);
		
		
		
		
		
		
		
		
		
		
		


	}

}
