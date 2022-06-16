package ClassicSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshots_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LocalDateTime systemdatetime=LocalDateTime.now();
		String Screenshotname=systemdatetime.toString().replaceAll(":", "-");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|ETA|Regular|V2|529647634981&s_kwcid=AL!1631!3!529647634981!e!!g!!www%20makemytrip.com&ef_id=CjwKCAjwv-GUBhAzEiwASUMm4gzCZfOZQVztC3uFrBNUNveax097FWYDRNX3yi3vbWrzvv2lo2w-SBoCUPkQAvD_BwE:G:s&gclid=CjwKCAjwv-GUBhAzEiwASUMm4gzCZfOZQVztC3uFrBNUNveax097FWYDRNX3yi3vbWrzvv2lo2w-SBoCUPkQAvD_BwE");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
			File  temp=ts.getScreenshotAs(OutputType.FILE);
			File d=new File("./Screenshots/temp.png");
			File dest=new File("./Screenshots/"+Screenshotname+".png");
			try {
				FileHandler.copy(d, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
