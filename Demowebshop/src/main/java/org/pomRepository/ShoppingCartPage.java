package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//Declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartphoneCartItem;
	@FindBy(name = "updatecart") private WebElement updatecartButton;
	@FindBy(name = "continueshopping") private WebElement continueshoppingButton;
	@FindBy(id = "termsofservice") private WebElement tearmsofserviceCheckbox;
	@FindBy(id = "checkout") private WebElement checkoutButton;
	
	//Initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	
	public WebElement getSmartphoneCartItem() {
		return smartphoneCartItem;
	}

	public WebElement getUpdatecartButton() {
		return updatecartButton;
	}

	public WebElement getContinueshoppingButton() {
		return continueshoppingButton;
	}

	public WebElement getTearmsofserviceCheckbox() {
		return tearmsofserviceCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	//Operational Method/ Business Logic
	
	public void removeSmartPhoneMethod() throws InterruptedException
	{
		smartphoneCartItem.click();
		Thread.sleep(500);
		updatecartButton.click();
		
	}
}
