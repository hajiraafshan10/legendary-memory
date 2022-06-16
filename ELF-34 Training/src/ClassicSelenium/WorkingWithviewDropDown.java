package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithviewDropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/books?orderby=5");
	//driver.findElement(By.xpath(null));
	WebElement drop1=driver.findElement(By.id("product-orderby"));
	Select s1=new Select(drop1);
	s1.selectByVisibleText("Name: A to Z");
	WebElement drop2=driver.findElement(By.id("product-orderby"));
	Select s2=new Select(drop2);
	s2.selectByVisibleText("Name: Z to A");
	WebElement drop3=driver.findElement(By.id("product-orderby"));
	Select s3=new Select(drop3);
	s3.selectByVisibleText("Price: Low to High");
	WebElement drop4=driver.findElement(By.id("product-orderby"));
	Select s4=new Select(drop4);
	s4.selectByVisibleText("Price: High to Low");
	WebElement drop5=driver.findElement(By.id("product-orderby"));
	Select s5=new Select(drop5);
	s5.selectByVisibleText("Position");
	
	
	
	

	}

}
