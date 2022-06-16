package Advance_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Working_With_ExtentReports {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime systemDate=LocalDateTime.now();
				String ReportName=systemDate.toString().replaceAll(":", "-");
		ExtentReports report=new ExtentReports("./Reports/"+ReportName+"Reports.html",false);
		ExtentTest test=report.startTest("ExtentDemo");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser is open");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		test.log(LogStatus.INFO, "page is loaded");
		WebElement ScrollEle=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollEle);
		
		test.log(LogStatus.PASS, "Page is scorlled");
		test.log(LogStatus.INFO, test.addScreenCapture(screenCapture()));
		test.log(LogStatus.FATAL, "Header is not displayed");

				report.endTest(test);
		report.flush();
	}
	public static String screenCapture(){
		LocalDateTime SystemDate=LocalDateTime.now();
		String ScreenShotName= SystemDate.toString().replaceAll(":", "-");
		String imgPath="./Screenshots/"+ScreenShotName+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(imgPath);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exceptiom Handled");
		}
		return "."+imgPath;
	}

}

