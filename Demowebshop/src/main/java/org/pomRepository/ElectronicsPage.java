package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	//Declaration
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhonesLink;
	@FindBy(partialLinkText = "Camera, photo") private WebElement cameraPhotosLink;
	
	//Initialization
	
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	
	public WebElement getCellPhonesLink() {
		return cellPhonesLink;
	}

	public WebElement getCameraPhotosLink() {
		return cameraPhotosLink;
	}
	
	

}
