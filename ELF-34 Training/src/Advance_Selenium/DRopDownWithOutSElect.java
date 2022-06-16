package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DRopDownWithOutSElect {
	@Test
	public void dropdown(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		/*driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("products-orderby")).click();*/
		List<WebElement> list=driver.findElements(By.tagName("select"));
		for(WebElement wb:list){
			System.out.println(wb.getText());
		}
		System.out.println(list.size());
		

		
	}

}
