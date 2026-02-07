package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	
	@FindBy(id = "Email") private WebElement loginEmailTB;
	@FindBy(id = "Password") private WebElement loginPasswordTB;
	@FindBy(id = "RememberMe") private WebElement loginRemembermeTB;
	@FindBy(linkText ="Forgot password?") private WebElement loginForgotPasswordTB;
	@FindBy(xpath ="//input[@value='Log in']") private WebElement loginButton;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	
	public WebElement getLoginEmailTB() {
		return loginEmailTB;
	}

	public WebElement getLoginPasswordTB() {
		return loginPasswordTB;
	}

	public WebElement getLoginRemembermeTB() {
		return loginRemembermeTB;
	}

	public WebElement getLoginForgotPasswordTB() {
		return loginForgotPasswordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
