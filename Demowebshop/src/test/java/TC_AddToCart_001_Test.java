

import org.genericLib.BestTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellphonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC_AddToCart_001_Test extends BestTest{
	
	@Test
	public void addToCartMethod()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellphonesPage cpp = new CellphonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true,"Product is not added to cart");
		
	}

}
