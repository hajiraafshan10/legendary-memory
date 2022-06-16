package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String dtitle=driver.getTitle();
		if(dtitle.contains("Demo")){
			System.out.println("task pass");
			
		}
		driver.findElement(By.className("ico-register")).click();
		String regtitle=driver.getTitle();
		if(regtitle.contains("Register")){
			System.out.println("user succesfully registerd");
		}
		String f="abcd";
		String l="xyz";
		String em="aedes@gmail.com";
		String p="123456";
		String cp="123456";
		WebElement rb=driver.findElement(By.id("gender-female"));
		rb.click();
		WebElement fn=driver.findElement(By.id("FirstName"));
		fn.sendKeys(f);
		WebElement ln=driver.findElement(By.id("LastName"));
		ln.sendKeys(l);
		WebElement e=driver.findElement(By.id("Email"));
		e.sendKeys(em);
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys(p);
		WebElement  cpwd=driver.findElement(By.id("ConfirmPassword"));
		cpwd.sendKeys(cp);
		WebElement  bt=driver.findElement(By.id("register-button"));
		bt.click();
		
if(driver.findElement(By.className("ico-logout")).isDisplayed())
		{
	System.out.println("passs");
	driver.close();
		}
	}

}
