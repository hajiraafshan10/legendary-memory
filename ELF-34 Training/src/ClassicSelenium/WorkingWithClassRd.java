package ClassicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithClassRd{



				public static void main(String[] args) {
					System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					/*driver.get("file:///C:/Users/User%20Happy/Downloads/LocatorsPractice.html");
					WebElement UN=driver.findElement(By.className("UserName"));
					UN.sendKeys("hlo");
					WebElement PW=driver.findElement(By.className("password"));
					PW.sendKeys("6788");
					WebElement rd=driver.findElement(By.name("a"));
					rd.click();
					WebElement Button=driver.findElement(By.className("Submit"));
					Button.click();*/
					driver.get("https://www.amazon.in/");
					WebElement UN=driver.findElement(By.id("nav-search-submit-button"));
					UN.click();


					

				}

			}
