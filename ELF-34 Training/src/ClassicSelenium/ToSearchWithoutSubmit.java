package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSearchWithoutSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	WebElement e=	driver.findElement(By.xpath("//input[@value='Search store']"));
	e.sendKeys("abcd");
		Actions a=new Actions(driver);
		a.sendKeys(e, Keys.ENTER).perform();

	}

}
