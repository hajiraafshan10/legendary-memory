package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragDropp1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DRivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));

		WebElement target=driver.findElement(By.id("box107"));
	Actions a=new Actions(driver);
	//a.dragAndDrop(source, target).perform();
	a.clickAndHold(source).perform();
	a.release(target).perform();

		
	}

}
