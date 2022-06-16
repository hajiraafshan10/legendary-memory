package PageObjectModel_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement LogoutLink;
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public void setLogoutLink(WebElement logoutLink) {
		LogoutLink = logoutLink;
	}
	public void LogoutLink(){
		LogoutLink.click();
	}

}
