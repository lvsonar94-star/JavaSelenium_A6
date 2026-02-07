package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//Declaration
	@FindBy(linkText = "Register") private WebElement registerlink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoppingCartLink;
	@FindBy(xpath = "//span[text()='wishlist']") private WebElement wishlistLink;
	@FindBy(partialLinkText = "Books") private WebElement booksLink;
	@FindBy(partialLinkText = "Computers") private WebElement computersLink;
	@FindBy(partialLinkText = "Electronics") private WebElement electronicsLink;
	@FindBy(partialLinkText = "Apparel & Shoes") private WebElement apparelShoesLink;
	@FindBy(partialLinkText = "Digital downloads") private WebElement digitalDownloadsLink;
	@FindBy(partialLinkText = "Jewelry") private WebElement jewelrysLink;
	@FindBy(partialLinkText = "Gift Cards") private WebElement giftCardsLink;
	@FindBy(linkText = "Log out") private WebElement logoutLink;
	
	
	//Initialization
	public BasePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public WebElement getBooksLink() {
		return booksLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getApparelShoesLink() {
		return apparelShoesLink;
	}
	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}
	public WebElement getJewelrysLink() {
		return jewelrysLink;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	
}
