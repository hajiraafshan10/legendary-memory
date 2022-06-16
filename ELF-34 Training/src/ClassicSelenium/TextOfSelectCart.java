package ClassicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextOfSelectCart {

public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User%20Happy/Downloads/demo.html");
	WebElement dropdown=driver.findElement(By.id("standard_cars"));
	Select drop=new Select(dropdown);
	List<WebElement> options=drop.getOptions();
	
	for(int i=0;i<options.size();i++){
		Select a1=new Select(driver.findElement(By.id("standard_cars")));
		a1.selectByIndex(i);
		System.out.println(options.get(i).getText());
	}
	}

}
