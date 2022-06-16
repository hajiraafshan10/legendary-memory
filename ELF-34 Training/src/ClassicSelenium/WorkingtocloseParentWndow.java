package ClassicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingtocloseParentWndow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String w1=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Set<String> w2=driver.getWindowHandles();
		for(String s:w2){
			
			if(!(s.equals(w1))){
			driver.switchTo().window(s);
			driver.close();
			
			}
			

			
	}
	}
}
