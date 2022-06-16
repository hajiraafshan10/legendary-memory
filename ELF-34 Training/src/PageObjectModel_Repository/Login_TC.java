package PageObjectModel_Repository;

import org.testng.annotations.Test;
import Advance_Selenium.BaseTest;

@Test
public class Login_TC extends BaseTest {
	public void TC_01(){
	driver.get("http://demowebshop.tricentis.com/");
	WelcomePage welcome=new WelcomePage(driver);
	welcome.clickLogin();
	
	LoginPage Login=new LoginPage(driver);
	Login.email_value("yoginarayana03@gmail.com");
	Login.pwd_value("password");
    Login.loginButton();
	}	

}
