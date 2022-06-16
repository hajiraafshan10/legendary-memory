package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSelectAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement e=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		e.sendKeys("abcd");
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.BACK_SPACE);
		

	}

}
