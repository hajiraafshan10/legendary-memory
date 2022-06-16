package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().perform();
		//or
		//a.contextClick(driver.findElement(By.xpath("//span[text()='right click me'])"))).build().perform();
		a.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double')]"))).build().perform();

	}

}
