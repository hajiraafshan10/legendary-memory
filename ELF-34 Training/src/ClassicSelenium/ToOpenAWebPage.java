package ClassicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenAWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//To maximize browser
		driver.manage().window().maximize();
		//To open a web page
		driver.navigate().to("http://demowebshop.tricentis.com/");
		//driver.get("http://demowebshop.tricentis.com/");
	
		//to refresh page
		driver.navigate().refresh();
		//To wait for 2seconds
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	

	}

}
