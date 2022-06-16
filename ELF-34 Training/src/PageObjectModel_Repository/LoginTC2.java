package PageObjectModel_Repository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Advance_Selenium.BaseTest;
import Advance_Selenium.MultipleReadClss;
import Advance_Selenium.PropertyFileRead;

public class LoginTC2  extends BaseTest{
	@Test(dataProvider="testData")
public void TC_01(String email,String password) throws IOException{
		driver.get(PropertyFileRead.read("URL"));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clickLogin();
		LoginPage login=new LoginPage(driver);
		login.email_value(email);
		login.pwd_value(password);
		login.loginButton();
		HomePage home=new HomePage(driver);
		try {
			if (home.getLogoutLink().isEnabled()) {
				Reporter.log("PASS:User is successfully logged in", true);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		home.LogoutLink();
		
	}
	
@DataProvider(name="testData")
public Object[][] data() throws EncryptedDocumentException, IOException{
	return MultipleReadClss.readAllValues("Login");
}
}

		
		
		
