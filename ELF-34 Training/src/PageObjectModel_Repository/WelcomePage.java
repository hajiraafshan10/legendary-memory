package PageObjectModel_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="ico-register")
	private WebElement RegLink;
	public void clickReglink(){
		RegLink.click();
	}
	@FindBy(className="ico-login")
	private WebElement LoginLink;
	public void clickLogin(){
		LoginLink.click();
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShopCartLink;
	public void clickShopCart(){
		RegLink.click();
	}
	@FindBy(xpath="/(//a[@class='ico-wishlist'])[1]")
	private WebElement WishlistLink;
	public void clickWishlist(){
		RegLink.click();
	}
	@FindBy(xpath="/input[@value='Search store']")
	private WebElement SearchTF;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement SearchButton;
	public void SearchButton(){
		SearchButton.click();
	}
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	private WebElement BookTab;
	public void BookTab(){
		BookTab.click();
	}
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement ComputersTab;
	public void ComputersTab(){
		ComputersTab.click();
}
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	private WebElement ElectronicsTab;
	public void ElectronicsTab(){
		ElectronicsTab.click();
	}
	@FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement ApparelsShoesTab;
	public void ApparelsShoesTab(){
		ApparelsShoesTab.click();
}
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement DigitalDownloadTab;
	public void DigitalDownloadTab(){
		DigitalDownloadTab.click();
}
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	private WebElement JewelryTab;
	public void JewelryTab(){
		JewelryTab.click();
}
	@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement GiftCards;
	public WebElement getRegLink() {
		return RegLink;
	}
	public void setRegLink(WebElement regLink) {
		RegLink = regLink;
	}
	public WebElement getLoginLink() {
		return LoginLink;
	}
	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}
	public WebElement getShopCartLink() {
		return ShopCartLink;
	}
	public void setShopCartLink(WebElement shopCartLink) {
		ShopCartLink = shopCartLink;
	}
	public WebElement getWishlistLink() {
		return WishlistLink;
	}
	public void setWishlistLink(WebElement wishlistLink) {
		WishlistLink = wishlistLink;
	}
	public WebElement getSearchTF() {
		return SearchTF;
	}
	public void setSearchTF(WebElement searchTF) {
		SearchTF = searchTF;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		SearchButton = searchButton;
	}
	public WebElement getBookTab() {
		return BookTab;
	}
	public void setBookTab(WebElement bookTab) {
		BookTab = bookTab;
	}
	public WebElement getComputersTab() {
		return ComputersTab;
	}
	public void setComputersTab(WebElement computersTab) {
		ComputersTab = computersTab;
	}
	public WebElement getElectronicsTab() {
		return ElectronicsTab;
	}
	public void setElectronicsTab(WebElement electronicsTab) {
		ElectronicsTab = electronicsTab;
	}
	public WebElement getApparelsShoesTab() {
		return ApparelsShoesTab;
	}
	public void setApparelsShoesTab(WebElement apparelsShoesTab) {
		ApparelsShoesTab = apparelsShoesTab;
	}
	public WebElement getDigitalDownloadTab() {
		return DigitalDownloadTab;
	}
	public void setDigitalDownloadTab(WebElement digitalDownloadTab) {
		DigitalDownloadTab = digitalDownloadTab;
	}
	public WebElement getJewelryTab() {
		return JewelryTab;
	}
	public void setJewelryTab(WebElement jewelryTab) {
		JewelryTab = jewelryTab;
	}
	public WebElement getGiftCards() {
		return GiftCards;
	}
	public void setGiftCards(WebElement giftCards) {
		GiftCards = giftCards;
	}
	public void GiftCards(){
		GiftCards.click();
}
}
	
	
	
	
	
	
	
	
