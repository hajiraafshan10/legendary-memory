package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMHovervldatn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).contextClick().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Build your own cheap computer')]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//driver.findElement(By.xpath("//span[@title='Close']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
		if(driver.findElement(By.xpath("(//a[text()='Build your own cheap computer'])[2]")).isDisplayed())
		{
	System.out.println("passs");
	driver.close();
		}
		

	}

}
