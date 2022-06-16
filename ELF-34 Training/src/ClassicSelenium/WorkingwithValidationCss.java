package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithValidationCss {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("abcd");
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	
	try{
	if(driver.findElement(By.cssSelector("input[value='computer']")).isDisplayed()){
		System.out.println("pass: search is sucessful");
		
	}
	}
	catch(NoSuchElementException e){
		System.out.println("fail:search is unsuccesful");
	}
	}

}
