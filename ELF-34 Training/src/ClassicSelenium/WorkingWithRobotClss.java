package ClassicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithRobotClss {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("http://demowebshop.tricentis.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
