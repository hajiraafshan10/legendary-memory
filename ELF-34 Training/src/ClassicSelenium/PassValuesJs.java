package ClassicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassValuesJs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement e1=driver.findElement(By.xpath("(//input[@type='text'])[2]Test"));
		
JavascriptExecutor js=	(JavascriptExecutor)driver;
js.executeScript("arguments[0].value='enabled';",e1);
		

	}

}
