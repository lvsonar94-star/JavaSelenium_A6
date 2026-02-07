package org.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectutility
{
	
	//To select an option by its visible text
	public void selectByVisibleTextMethod(WebElement DropdownElement,String visibleText)
	{
		Select sel = new Select(DropdownElement);
		sel.selectByVisibleText(visibleText);
	}
}
