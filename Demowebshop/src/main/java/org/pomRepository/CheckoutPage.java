package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	//Declaration
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement billingAddressCountryDD;
	@FindBy(id = "Billing-address-select") private WebElement billingAddressNewAddressCountryDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNumberTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingAddressContinueButton;
	@FindBy(id = "shipping-address-select") private WebElement shippingAddressDD;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") 
	private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") 
	private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") 
	private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") 
	private WebElement paymentInfoContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") 
	private WebElement confirmOrderContinueButton;
	
	//Initialization
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getBillingAddressCountyDD() {
		return billingAddressCountryDD;
	}

	public WebElement getBillingAddressCountryDD() {
		return billingAddressCountryDD;
	}

	public WebElement getBillingAddressNewAddressCountryDD() {
		return billingAddressNewAddressCountryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}

	
	
	//Operational Method /Business Logic
	
	public void buyProduct(String city,String address1, String pincode, String phoneNo) throws InterruptedException

	{
		//select the utility for select the text in the Dropdown
		Selectutility su= new Selectutility();
		try
		{
			
			{
				su.selectByVisibleTextMethod(billingAddressNewAddressCountryDD, "New Address");
			}
		}
		catch(Exception e)
	
		{
			//su.selectByVisibleTextMethod(billingAddressCountryDD, "India");
		}
			su.selectByVisibleTextMethod(billingAddressCountryDD,"India");
			
		
		
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(pincode);
		phoneNumberTB.sendKeys(phoneNo);
		Thread.sleep(2000);
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContinueButton.click();
		
		}
	    
	
	
	}
	
	
	


