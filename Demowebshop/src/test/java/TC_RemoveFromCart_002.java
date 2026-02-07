


import org.genericLib.BestTest;
import org.openqa.selenium.WebDriver;
import org.pomRepository.BasePage;
import org.pomRepository.CellphonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC_RemoveFromCart_002 extends BestTest{
	@Test
	public void removeProductFromCartMethod() throws InterruptedException
	{
	
	BasePage bp = new BasePage(driver);
	bp.getElectronicsLink().click();
	
	ElectronicsPage ep = new ElectronicsPage(driver);
	ep.getCellPhonesLink().click();
	
	CellphonesPage cpp = new CellphonesPage(driver);
	cpp.getCellPhoneAddToCartButton().click();
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true,"Product is not added to cart");
	
	bp.getShoppingCartLink().click();
	
	ShoppingCartPage scp=new ShoppingCartPage(driver);
	scp.removeSmartPhoneMethod();
	
	try
	{
		if(scp.getSmartphoneCartItem().isDisplayed())
		{
			Reporter.log("Product is not removed from cart",true);
		}
	  // sa.assertEquals(scp.getSmartphoneCartItem().isDisplayed(), false, "product is not remove from cart!!");
	}
	catch(Exception e)
	{
		Reporter.log("Product is removed from cart",true);
		//sa.assertEquals(scp.getSmartphoneCartItem().isDisplayed(), false, "product is not remove from cart!!");	
	}
	sa.assertAll();
}
}
