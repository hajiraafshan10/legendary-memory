package ClassicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingToGetDD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement wb:list){
			System.out.println(wb.getText());
		}
		System.out.println(list.size());
		

	}

}
