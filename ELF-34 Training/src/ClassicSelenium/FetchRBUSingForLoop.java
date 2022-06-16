package ClassicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchRBUSingForLoop {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				List<WebElement> l1=driver.findElements(By.xpath("//input[@type='radio']"));
				
		    //	for(int i=0;i<l1.size();i++){
					//System.out.println(l1.get(i).get());
			//	}
		//BY USING FOR EACH	LOOP
				for(WebElement wb:l1){
					Thread.sleep(3000);
					wb.click();
				}
					
					
				//}

			}


	}

