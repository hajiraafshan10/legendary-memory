package PageObjectModel_Repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	private WebElement MaleRadioButton;
	public void MaleRadioButton(){
		MaleRadioButton.click();
	}
	@FindBy(id="gender-female")
	private WebElement FemaleRadioButton;
	public void FemaleRadioButton(){
		FemaleRadioButton.click();
	}
	@FindBy(id="FirstName")
	private WebElement FirstNameTF;
	
	@FindBy(id="LastName")
	private WebElement LastNameTF;
	
	@FindBy(id="Email")
	private WebElement EmailTF;
	
	@FindBy(id="Password")
	private WebElement PasswordTF;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTF;
	
	@FindBy(id="register-button")
	private WebElement RegButton;
	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}
	public void setMaleRadioButton(WebElement maleRadioButton) {
		MaleRadioButton = maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}
	public void setFemaleRadioButton(WebElement femaleRadioButton) {
		FemaleRadioButton = femaleRadioButton;
	}
	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}
	public void setFirstNameTF(WebElement firstNameTF) {
		FirstNameTF = firstNameTF;
	}
	public WebElement getLastNameTF() {
		return LastNameTF;
	}
	public void setLastNameTF(WebElement lastNameTF) {
		LastNameTF = lastNameTF;
	}
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
	public WebElement getConfirmPasswordTF() {
		return ConfirmPasswordTF;
	}
	public void setConfirmPasswordTF(WebElement confirmPasswordTF) {
		ConfirmPasswordTF = confirmPasswordTF;
	}
	public WebElement getRegButton() {
		return RegButton;
	}
	public void setRegButton(WebElement regButton) {
		RegButton = regButton;
	}
	public void RegButton(){
		RegButton.click();
	}
	}
	

