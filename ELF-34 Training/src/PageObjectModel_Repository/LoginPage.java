package PageObjectModel_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement EmailTF;
	public void email_value(String email){
		EmailTF.sendKeys(email);
	}
	@FindBy(id="Password")
	private WebElement PasswordTF;
	public void pwd_value(String pwd){
		PasswordTF.sendKeys(pwd);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement LoginButton;
	public WebElement getEmailTF() {
		return EmailTF;
	}
	public void setEmailTF(WebElement emailTF) {
		EmailTF = emailTF;
	}
	public WebElement getPasswordTF() {
		return PasswordTF;
	}
	public void setPasswordTF(WebElement passwordTF) {
		PasswordTF = passwordTF;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}
	public void loginButton(){
		LoginButton.click();
	}

}
