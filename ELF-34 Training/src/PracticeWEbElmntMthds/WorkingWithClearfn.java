package PracticeWEbElmntMthds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearfn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).click();
		//driver.findElement(By.id("small-searchterms")).sendKeys("abcd");
		//driver.findElement(By.id("small-searchterms")).clear();
		
		//WORKING WITH getAttribute(name)		
WebElement e=driver.findElement(By.xpath("/input[@type='button'][1]"));
e.getAttribute("type");
		
		
	}

}
